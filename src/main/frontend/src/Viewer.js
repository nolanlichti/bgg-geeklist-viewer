import React from 'react';
import axios from 'axios';
import parser from 'bbcode-to-react';
import StrikethroughTag from './StrikethroughTag'
import dayjs from 'dayjs';
import UserTag from "./UserTag";



parser.registerTag('-', StrikethroughTag); // add new tag
parser.registerTag('user', UserTag); // add new tag


class Viewer extends React.Component {

    setSort(sort){
        this.setState({currSort: sort})
    }



    filterNothing(a) {
        return true;
    }


    constructor () {
        super();
        this.state = {geeklistdata: null, sort: this.sortDescByEditDt,activeitems:[],currFilter:this.filterNothing};
        this.render = this.render.bind(this);
        this.componentDidMount = this.componentDidMount.bind(this)
        this.handleSearch = this.handleSearch.bind(this)

    }




    componentDidMount() {
        axios.get("http://localhost:5000/geeklists/267600/json")
            .then((response)=>{
                if (response && response.data === ''){
                    this.setState({bggIsLoading:true});
                }else {

                    let geeklistdata = response.data;

                    this.setState({bggIsLoading: false});

                    let newItems = geeklistdata.item.map(itm => {
                        itm.postDt = dayjs(itm.postdate, 'ddd, DD MMM YYYY HH:mm:ss ZZ');//.format('YYYY-MM-DD HH:mm:ss')
                        itm.editDt = dayjs(itm.editdate, 'ddd, DD MMM YYYY HH:mm:ss ZZ');//.format('YYYY-MM-DD HH:mm:ss')
                        let regexp = /\[user=(.*)\]\[\/user]/

                        let matches = itm.body.match(regexp);
                        if (matches) {
                            itm.body = itm.body.replace(regexp, "[user]" + matches[1] + "[/user]");
                        }
                        return itm;
                    });


                    this.setState({activeitems: newItems})
                    this.setState({currSort: this.sortDescByEditDt})
                    this.setState({currFilter: this.filterNothing})


                }
            })

    }


    timeUnitsAgo(date){
        if (dayjs().diff(date,'minute') > 60){
            if (dayjs().diff(date,'hour') > 24){
                return dayjs().diff(date,'day') + " day(s) ago"
            }
            return dayjs().diff(date,'hour') + " hour(s) ago"
        }

        return dayjs().diff(date,'minute') + " minute(s) ago"

    }

    handleSearch(event){
        let val = event.target.value.toLowerCase();
        let currFilter = function(item){
            return item.objectname.toLowerCase().includes(val)
                || item.body.toLowerCase().includes(val)
                || item.username.toLowerCase().includes(val)
                || item.comment.some((cmt)=>{cmt.value.toLowerCase().includes(val)})
                || item.comment.some((cmt)=>{cmt.username.toLowerCase().includes(val)})

        };
        this.setState({currFilter:currFilter})
    }

    render () {
        const buttonStyle = {padding:10+"px", margin:10+"px", width:90+"%"};
        const searchStyle = {width:90+"%"};
        const commentsStyle = { marginLeft: 5+"%"};

        if (this.state.bggIsLoading){
            return <div className="container">BGG is loading the geeklist, please wait a few seconds and refresh the page.</div>
        }
            if (this.state.activeitems) {
                return (

                        <div className="container">
                            <div className="row">
                                <div className="col-sm">

                                <h1>
                                    <a
                                       href="https://boardgamegeek.com/geeklist/267600/indycon-2020-flea-market">IndyCon
                                        Flea Market on BGG</a>
                                </h1>
                                </div>
                            </div>
                            <div className="row">
                                <div className="col-md col-sm-12">
                                    <button style={buttonStyle}  onClick={()=>this.setSort(this.sortDescByEditDt)}>Show Recent Edits First</button>
                                </div>
                                <div className="col-md col-sm-12">
                                    <button  style={buttonStyle}  onClick={()=>this.setSort(this.sortDescByPostDt)}>Show Recent Posts First</button>
                                </div>
                                <div className="col-md col-sm-12">
                                    <button style={buttonStyle}  onClick={()=>this.setSort(this.sortAscByEditDt)}>Show Old Edits First</button>
                                </div>
                                <div className="col-md col-sm-12">
                                    <button style={buttonStyle} onClick={()=>this.setSort(this.sortAscByPostDt)}>Show Old Posts First</button>
                                </div>
                            </div>
                            <div className="row">&nbsp;  </div>
                            <div className="row">
                                <div className="col-sm">
                                    <input style={searchStyle} type="text" placeholder={"search title, post text, comment text, or username..."}
                                       onKeyUp={this.handleSearch} />
                                </div>
                            </div>
                            <div className="row">&nbsp;  </div>


                            <div className="row">
                                <div className="col-sm">
                                <b>Displaying 50 Items</b>
                                </div>
                            </div>

                            {this.state.activeitems
                                .sort(this.state.currSort)
                                .filter(this.state.currFilter)
                                .slice(0,50)
                                .map(a=>{
                                    return  (
                                    <div key={a.objectname+a.username+a.id}>
                                    <hr/>
                                    <div><h2><a
                                                href={"https://boardgamegeek.com/geeklist/267600/item/"+a.id+"#item"+a.id}>{a.objectname}</a></h2></div>
                                    <div>User:  <b><a
                                        href={"https://boardgamegeek.com/user/"+a.username}>{a.username}</a></b></div>
                                    <br/>
                                    <div>{parser.toReact(a.body)}</div>
                                        <div> {
                            a.comment.map(
                                cmt => { return (<div style={commentsStyle}>
                                                    <hr/>
                                                    <span>
                                                        <a href={"https://boardgamegeek.com/user/"+cmt.username}>{cmt.username} </a>
                                                    </span>
                                                    <span>
                                                        <i>{this.timeUnitsAgo(cmt.postdate)}:&nbsp;</i>
                                                    </span>
                                                    <span>
                                                        {cmt.value}
                                                    </span>
                                                 <hr/>
                                                </div>)}
                                )
                                        }</div>
                                    <br/>
                                    <div>Edited: {this.timeUnitsAgo(a.editDt)}</div>
                                    <div>Posted: {this.timeUnitsAgo(a.postDt)}</div>
                                    </div>
                                    )
                                    })
                            }
                        </div>


                );
            }else{
                return (<div>still loading</div>)
            }

    }

    sortDescByEditDt(a, b) {
        if (a.editDt !== undefined) {
            return a.editDt.isBefore(b.editDt) ? 1 : -1
        } else {
            return 1
        }
    }
    sortDescByPostDt(a, b) {
        if (a.postDt !== undefined) {
            return a.postDt.isBefore(b.postDt) ? 1 : -1
        }else{
            return 1
        }
    }

    sortAscByEditDt(a, b) {
        if (a.editDt !== undefined) {
            return a.editDt.isAfter(b.editDt) ? 1 : -1
        } else {
            return -1
        }
    }
    sortAscByPostDt(a, b) {
        if (a.postDt !== undefined) {
            return a.postDt.isAfter(b.postDt) ? 1 : -1
        }else{
            return -1
        }
    }
}

export default Viewer;

import {Tag} from "bbcode-to-react";
import React from "react";

class UserTag extends Tag {
    toReact() {
        // using this.getComponents() to get children components.
        const attributes = {
            href: "https://boardgamegeek.com/user/"+this.getContent(true),
        };
        return (
            <span>&nbsp;<a {...attributes} target={"blank"}>{this.getContent(true)}</a></span>
        );
    }
}

export default UserTag;

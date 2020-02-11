package org.clintrorick.bggxmlapiwrapper.stuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GeekListController {

    @Autowired
    GeeklistApiWrapper geeklistApiWrapper;

    @CrossOrigin
    @RequestMapping(value = "/geeklists/{id}/json",produces = "application/json")
    public Geeklist getGeeklist( @PathVariable Integer id){
        System.out.println("about to call bgg with geeklist id"+id);
        Geeklist list = geeklistApiWrapper.getGeeklist( id );
        if (list == null){
            System.out.println("BGG is loading, please try again soon.");
        }
        System.out.println("just called bgg with geeklist id"+id);
        return list;

    }

}

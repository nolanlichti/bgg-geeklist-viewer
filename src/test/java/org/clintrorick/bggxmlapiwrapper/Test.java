package org.clintrorick.bggxmlapiwrapper;

import org.clintrorick.bggxmlapiwrapper.stuff.Geeklist;
import org.clintrorick.bggxmlapiwrapper.stuff.GeeklistApiWrapper;
import org.springframework.boot.test.context.SpringBootTest;

import static junit.framework.TestCase.assertTrue;

@SpringBootTest
public class Test {

    GeeklistApiWrapper geeklistApiWrapper = new GeeklistApiWrapper();

    @org.junit.Test
    public void geeklistIsDeserialized() {
       Geeklist geeklist = geeklistApiWrapper.getGeeklist( 267600 );
       System.out.println( geeklist );
       assertTrue(geeklist!=null);
    }
}

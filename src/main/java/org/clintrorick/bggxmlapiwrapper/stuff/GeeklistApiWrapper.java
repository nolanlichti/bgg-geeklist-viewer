package org.clintrorick.bggxmlapiwrapper.stuff;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GeeklistApiWrapper {

    RestTemplate restTemplate = new RestTemplate(  );

    public Geeklist getGeeklist( Integer geeklistId){
        try {

            return restTemplate.getForObject( "https://api.geekdo.com/xmlapi/geeklist/" + geeklistId +"?comments=1", Geeklist.class );
        }catch(Exception e){
            return null;
        }
    }
}

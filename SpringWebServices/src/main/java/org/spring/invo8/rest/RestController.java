package org.spring.invo8.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

 
    @RequestMapping("/hello/{name}")
    public Message message(@PathVariable String name) {
 
        Message msg = new Message(name, "Hello " + name);
        return msg;
    }
}

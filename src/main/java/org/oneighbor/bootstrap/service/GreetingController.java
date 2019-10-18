package org.oneighbor.bootstrap.service;

import org.oneighbor.bootstrap.model.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public Message greeting(@RequestParam(value="name", defaultValue="World") String aName) {
		return new Message(String.format("Hello %s, Greetings...", aName));
    }
}
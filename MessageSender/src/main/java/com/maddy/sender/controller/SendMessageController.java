package com.maddy.sender.controller;

import com.maddy.sender.service.SendMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/queue")
public class SendMessageController {
    @Autowired
    SendMessageService sendMessageService;

    @GetMapping(value = "/sendMessage")
    public void sendMessage2Queue(@RequestParam("myMessage") String myMessage) {
        System.out.println("My Message: "+myMessage);
        sendMessageService.sendMessage2Queue(myMessage);
    }
}

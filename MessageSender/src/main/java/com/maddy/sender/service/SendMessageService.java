package com.maddy.sender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendMessageService {

    @Autowired
    JmsTemplate jmsTemplate;

    public static final String myQueueDestination = "maddy_queue";

    public void sendMessage2Queue(String myMessage) {
        jmsTemplate.convertAndSend(myQueueDestination, myMessage);
        System.out.println("Message Sent to Queue.");
    }
}

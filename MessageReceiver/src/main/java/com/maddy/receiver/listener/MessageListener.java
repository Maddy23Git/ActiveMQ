package com.maddy.receiver.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @JmsListener(destination = "maddy_queue")
    public void listenMessage(String myMessage) {
        System.out.println("Message Received: " + myMessage);
    }
}

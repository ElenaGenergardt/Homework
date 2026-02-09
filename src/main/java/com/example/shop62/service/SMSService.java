package com.example.shop62.service;

import org.springframework.stereotype.Component;

@Component
public class SMSService implements MessageService{

    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient);
        System.out.println("Message: " + message);

    }
}

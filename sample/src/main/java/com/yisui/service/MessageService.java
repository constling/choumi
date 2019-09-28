package com.yisui.service;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

    public MessageService() {
        super();
        System.out.println("MessageService...");
    }

    public void PrintName() {
        System.out.println("MessageService");
    }
}

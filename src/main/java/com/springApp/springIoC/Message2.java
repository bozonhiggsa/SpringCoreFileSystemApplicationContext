package com.springApp.springIoC;

/**
 * Bean class - prototype
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Message2 extends AbstractMessage {

    private String textMessage;

    public String getTextMessage() {
        return "Message1: " + textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }
}

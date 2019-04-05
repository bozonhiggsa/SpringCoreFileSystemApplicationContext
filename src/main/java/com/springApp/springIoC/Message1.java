package com.springApp.springIoC;

/**
 * Bean class - singleton
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Message1 extends AbstractMessage {

    private String textMessage;

    public String getTextMessage() {
        return "Message1: " + textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }
}

package com.springApp.springIoC;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Bean class that comprises embedded field of Message
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Messager {

    AbstractMessage message;

    @Qualifier("beanMessage2")
    public void setMessage(AbstractMessage message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println(message.getTextMessage());
    }
}

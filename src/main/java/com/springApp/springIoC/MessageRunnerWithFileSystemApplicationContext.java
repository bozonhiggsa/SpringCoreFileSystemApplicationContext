package com.springApp.springIoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Entry point
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MessageRunnerWithFileSystemApplicationContext {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("classpath:message-bean.xml");
        Message message = (Message) context.getBean("fromBeanMessage");
        System.out.println(message.getMessage());
    }
}

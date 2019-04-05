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
                new FileSystemXmlApplicationContext("classpath:spring_config.xml");

        Messager messager = context.getBean("beanMessager", Messager.class);
        messager.printMessage();
    }
}

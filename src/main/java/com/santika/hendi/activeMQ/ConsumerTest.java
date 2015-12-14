/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santika.hendi.activeMQ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author hendi.santika
 */
public class ConsumerTest {

    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("appContext.xml");
        MessageConsumerBean mc
                = (MessageConsumerBean) context.getBean("consumer");
        MessageObject messageObj = mc.receiveMessage();
        System.out.println("Message from : "
                + messageObj.getMailId() + "\n"
                + messageObj.getMessage()+ "\n"
                + "has beeen received");
    }
}

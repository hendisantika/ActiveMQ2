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
public class ProducerTest {

    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("appContext.xml");
        MessageProducerBean mp
                = (MessageProducerBean) context.getBean("producer");
        mp.sendMessage(new MessageObject("1234", "Test Message"));
    }
}

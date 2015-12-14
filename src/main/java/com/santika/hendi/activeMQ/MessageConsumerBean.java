/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santika.hendi.activeMQ;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.JmsUtils;

/**
 *
 * @author hendi.santika
 */
public class MessageConsumerBean {

    private JmsTemplate jmsTemplate;
    private Destination destination;

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public MessageObject receiveMessage() {
        MapMessage message = (MapMessage) jmsTemplate.receive(destination);
        try {
            MessageObject messageObj = new MessageObject();
            messageObj.setMailId(message.getString("mailId"));
            messageObj.setMessage(message.getString("message"));
            return messageObj;
        } catch (JMSException e) {
            throw JmsUtils.convertJmsAccessException(e);
        }
    }
}

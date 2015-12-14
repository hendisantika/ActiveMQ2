/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santika.hendi.activeMQ;

/**
 *
 * @author hendi.santika
 */
public class MessageObject {

    private String mailId;
    private String message;

    public MessageObject() {
    }

    ; 
 public MessageObject(String mailId, String message) {
        super();
        this.mailId = mailId;
        this.message = message;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

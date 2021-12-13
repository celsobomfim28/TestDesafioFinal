package br.com.pan.bluebank.utils;

import br.com.pan.bluebank.model.enums.EventType;

import java.math.BigDecimal;

public class Message {
    private String message;

    public Message() {}

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


package br.com.pan.bluebank.services;


import br.com.pan.bluebank.models.SnsResponse;
import br.com.pan.bluebank.utils.Message;

public interface MessagePublisher {
    SnsResponse publish(Message message);
}

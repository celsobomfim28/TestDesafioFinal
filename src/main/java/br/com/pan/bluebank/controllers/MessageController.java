package br.com.pan.bluebank.controllers;


import br.com.pan.bluebank.models.SnsResponse;
import br.com.pan.bluebank.services.MessagePublisher;
import br.com.pan.bluebank.utils.Message;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    private final MessagePublisher messagePublisher;

    public MessageController(MessagePublisher messagePublisher) {
        this.messagePublisher = messagePublisher;
    }

    @PostMapping(value = "/publish")
    @ResponseStatus(HttpStatus.CREATED)
    public SnsResponse publishMessage(@RequestBody Message message) {
        return messagePublisher.publish(message);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(RuntimeException.class)
    private String handleException(RuntimeException e) {
        return e.getMessage();
    }
}
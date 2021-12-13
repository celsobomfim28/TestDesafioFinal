package br.com.pan.bluebank.utils;

import software.amazon.awssdk.services.sns.model.MessageAttributeValue;
import software.amazon.awssdk.services.sns.model.PublishRequest;

import java.util.HashMap;
import java.util.Map;

public class RequestBuilder {
    public static final String MESSAGE = "Message";
    public static final String DEFAULT_MESSAGE_BODY = "Please see attributes.";


    public static PublishRequest build(String topicArn, Message message) {
        Map<String, MessageAttributeValue> attributes = new HashMap<>();
        attributes.put(MESSAGE, buildAttribute(message.getMessage(), "String"));


        PublishRequest request = PublishRequest.builder()
                .topicArn(topicArn)
                .message(DEFAULT_MESSAGE_BODY)
                .messageAttributes(attributes)
                .build();

        return request;
    }

    private static MessageAttributeValue buildAttribute(String value, String dataType) {
        return MessageAttributeValue.builder()
                .dataType(dataType)
                .stringValue(value)
                .build();
    }
}

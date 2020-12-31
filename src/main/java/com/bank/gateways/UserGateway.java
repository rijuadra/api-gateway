package com.bank.gateways;

import com.bank.bo.TransactionRequest;
import com.bank.bo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserGateway {
    @Autowired
    KafkaTemplate kafkaTemplate;
    private static final String USER_DETAILS_TOPIC = "userDetails1";
    private static final String USER_AUTHENTICATION_TOPIC = "userAuthentication1";
    public void sendUserDetails(User user) {
        kafkaTemplate.send(USER_DETAILS_TOPIC, user);
    }

    public void sendTransactionRequest(TransactionRequest transactionRequest) {
        kafkaTemplate.send(USER_AUTHENTICATION_TOPIC, transactionRequest);
    }
}

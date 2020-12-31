package com.bank.service;

import com.bank.bo.TransactionRequest;
import com.bank.bo.User;
import com.bank.gateways.UserGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserGateway userGateway;
    public boolean persistUserDetails(User user){
        userGateway.sendUserDetails(user);
        return true;
    }

    public void initiateTransaction(TransactionRequest transactionRequest) {
         userGateway.sendTransactionRequest(transactionRequest);
    }
}

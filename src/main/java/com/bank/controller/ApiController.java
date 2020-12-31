package com.bank.controller;

import com.bank.bo.TransactionRequest;
import com.bank.bo.User;
import com.bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    UserService userService;
    @GetMapping("/test")
    public String doTest(){
        return "it's working";
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody User user){
        userService.persistUserDetails(user);
        return "message pushed to kafka userDetails topic";
    }
    @PostMapping("/transaction")
    public String debitFromAccount(@RequestBody TransactionRequest transactionRequest){
        userService.initiateTransaction(transactionRequest);
        return transactionRequest.getTypeOfTransaction()+" Transaction Initiated";
    }

}

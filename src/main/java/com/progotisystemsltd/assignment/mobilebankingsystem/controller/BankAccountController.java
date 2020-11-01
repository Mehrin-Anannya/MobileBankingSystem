package com.progotisystemsltd.assignment.mobilebankingsystem.controller;

import com.progotisystemsltd.assignment.mobilebankingsystem.model.BankAccount;
import com.progotisystemsltd.assignment.mobilebankingsystem.repository.BankAccountRepository;
import com.progotisystemsltd.assignment.mobilebankingsystem.service.BankAccountService;
import com.progotisystemsltd.assignment.mobilebankingsystem.service.BankAccountServiceImpl;
import com.progotisystemsltd.assignment.mobilebankingsystem.service.BusinessAccountInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bankAccount/")
public class BankAccountController {

    @Autowired
    private BankAccountServiceImpl bankAccountService;

    @Autowired
    private BusinessAccountInfoServiceImpl businessAccountInfoService;

    @GetMapping("/allBankAccounts")
    public List<BankAccount> getAllBankAccountInfo(){
        return bankAccountService.getAllBankAccount();
    }
    @GetMapping(value = "/bankAccountId/{bankAccountId}")
    public BankAccount getBankAccountById(@PathVariable(value = "bankAccountId")Integer bankAccountId){
        return bankAccountService.getBankAccountById(bankAccountId);
    }

    @GetMapping(value = "/bankAccountNumber/{accountNumber}")
    public BankAccount getBankAccountByAccountNumber(@PathVariable(value = "accountNumber")Long accountNumber){
        return bankAccountService.getBankAccountByAccountNumber(accountNumber);
    }

    @GetMapping(value = "/checkBalance/{mobilePhoneNumber}")
    public BankAccount getBankAccountByAccountNumber(@PathVariable(value = "mobilePhoneNumber")String mobilePhoneNumber){
        return bankAccountService.checkBalanceWithMPN(mobilePhoneNumber);
    }
}

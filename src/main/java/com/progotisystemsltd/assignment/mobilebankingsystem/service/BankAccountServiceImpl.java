package com.progotisystemsltd.assignment.mobilebankingsystem.service;

import com.progotisystemsltd.assignment.mobilebankingsystem.model.BankAccount;
import com.progotisystemsltd.assignment.mobilebankingsystem.model.BusinessAccountInfo;
import com.progotisystemsltd.assignment.mobilebankingsystem.repository.AccountNumberRepository;
import com.progotisystemsltd.assignment.mobilebankingsystem.repository.BankAccountRepository;
import com.progotisystemsltd.assignment.mobilebankingsystem.repository.BusinessAccountInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountServiceImpl implements BankAccountService{
    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Autowired
    private AccountNumberRepository accountNumberRepository;

    @Override
    public void createBankAccount(BankAccount bankAccount) {
        bankAccountRepository.save(bankAccount);
    }

    @Override
    public List<BankAccount> getAllBankAccount() {
        return bankAccountRepository.findAll();
    }

    @Override
    public BankAccount getBankAccountById(Integer bankAccountId) {
        return bankAccountRepository.findById(bankAccountId).orElse(null);
    }

    @Override
    public BankAccount getBankAccountByAccountNumber(Long accountNumber) {
        return bankAccountRepository.findBankAccountByAccountNumber(accountNumber);
    }

    @Override
    public BankAccount checkBalanceWithMPN(String mobilePhoneNumber) {
        return bankAccountRepository.findBalanceByMobilePhoneNumber(mobilePhoneNumber);
    }

}

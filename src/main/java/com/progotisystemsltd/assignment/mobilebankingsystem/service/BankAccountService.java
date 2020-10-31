package com.progotisystemsltd.assignment.mobilebankingsystem.service;

import com.progotisystemsltd.assignment.mobilebankingsystem.model.BankAccount;
import com.progotisystemsltd.assignment.mobilebankingsystem.model.BusinessAccountInfo;

import java.util.List;

public interface BankAccountService {
  public void createBankAccount(BankAccount bankAccount);
  public List<BankAccount>  getAllBankAccount();
  public BankAccount getBankAccountById(Integer bankAccountId);
  public BankAccount getBankAccountByAccountNumber(Long accountNumber);


}

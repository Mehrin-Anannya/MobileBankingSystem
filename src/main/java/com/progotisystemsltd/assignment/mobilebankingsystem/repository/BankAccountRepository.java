package com.progotisystemsltd.assignment.mobilebankingsystem.repository;

import com.progotisystemsltd.assignment.mobilebankingsystem.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {
    BankAccount findBankAccountByAccountNumber(Long accountNumber);
}

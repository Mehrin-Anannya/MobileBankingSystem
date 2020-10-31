package com.progotisystemsltd.assignment.mobilebankingsystem.repository;

import com.progotisystemsltd.assignment.mobilebankingsystem.model.BankAccount;
import com.progotisystemsltd.assignment.mobilebankingsystem.model.BusinessAccountInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessAccountInfoRepository extends JpaRepository<BusinessAccountInfo, Integer> {
    BusinessAccountInfo findBankAccountByAccountNumber(Long accountNumber);
}

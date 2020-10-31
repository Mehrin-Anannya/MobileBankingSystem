package com.progotisystemsltd.assignment.mobilebankingsystem.service;

import com.progotisystemsltd.assignment.mobilebankingsystem.model.BusinessAccountInfo;
import com.progotisystemsltd.assignment.mobilebankingsystem.repository.BusinessAccountInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessAccountInfoServiceImpl implements BusinessAccountInfoService {
    @Autowired
    private BusinessAccountInfoRepository businessAccountInfoRepository;

    @Override
    public void createBusinessAccount(BusinessAccountInfo businessAccountInfo) {
        businessAccountInfoRepository.save(businessAccountInfo);
    }

    @Override
    public BusinessAccountInfo getBusinessAccountInfoByAccountNumber(Long accountNumber) {
        return businessAccountInfoRepository.findBankAccountByAccountNumber(accountNumber);
    }
}

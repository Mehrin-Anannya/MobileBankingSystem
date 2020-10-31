package com.progotisystemsltd.assignment.mobilebankingsystem.service;

import com.progotisystemsltd.assignment.mobilebankingsystem.model.BusinessAccountInfo;

public interface BusinessAccountInfoService {
    public void createBusinessAccount(BusinessAccountInfo businessAccountInfo);
    public BusinessAccountInfo getBusinessAccountInfoByAccountNumber(Long accountNumber);
}

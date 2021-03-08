package com.twisleton.quotefinder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    @Autowired
    LoanProviderService loanProviderService;

    public void printLoanProviders() {
        loanProviderService.getAllLoanProviders().forEach(loanProvider ->
                System.out.println(
                        loanProvider.getId() + " " + loanProvider.getName() + " " + loanProvider.getMinCreditScore()));

        System.out.println("Loan provider 1: "+loanProviderService.getLoanProviderById(1).getName());


    }

}

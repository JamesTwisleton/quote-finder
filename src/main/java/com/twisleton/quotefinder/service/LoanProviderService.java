package com.twisleton.quotefinder.service;

import com.twisleton.quotefinder.dto.LoanProvider;
import com.twisleton.quotefinder.repository.LoanProvidersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanProviderService {

    @Autowired
    LoanProvidersRepository loanProvidersRepository;

    public List<LoanProvider> getAllLoanProviders() {
        List<LoanProvider> loanProviders = new ArrayList<LoanProvider>();
        loanProvidersRepository.findAll().forEach(loanProvider -> loanProviders.add(loanProvider));
        return loanProviders;
    }

    public LoanProvider getLoanProviderById(int id) {
        return loanProvidersRepository.findById(id).get();
    }

}

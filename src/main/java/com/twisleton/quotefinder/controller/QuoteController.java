package com.twisleton.quotefinder.controller;

import com.twisleton.quotefinder.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @Autowired
    QuoteService quoteService;

    @GetMapping("/quote")
    public String getQuote() {
        quoteService.printLoanProviders();
        return "WOW";

    }
}

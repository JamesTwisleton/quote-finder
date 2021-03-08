package com.twisleton.quotefinder.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LoanProvider {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int minCreditScore;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMinCreditScore() {
        return minCreditScore;
    }


}
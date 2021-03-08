package com.twisleton.quotefinder.repository;

import com.twisleton.quotefinder.dto.LoanProvider;
import org.springframework.data.repository.CrudRepository;

public interface LoanProvidersRepository extends CrudRepository<LoanProvider, Integer> {
}


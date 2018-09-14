package com.testbankmanagement.dao.repositories;

import com.testbankmanagement.dao.models.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Cao Nguyen on 9/14/2018.
 */
@Repository
public interface BankRepository extends JpaRepository<Bank, Long>{
}

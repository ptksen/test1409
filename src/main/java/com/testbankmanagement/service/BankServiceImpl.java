package com.testbankmanagement.service;

import com.testbankmanagement.dao.models.Bank;
import com.testbankmanagement.dao.repositories.BankRepository;
import com.testbankmanagement.dto.BankDTO;
import org.springframework.stereotype.Service;

/**
 * Created by Cao Nguyen on 9/14/2018.
 */
@Service
public class BankServiceImpl implements BankService{
    BankRepository bankRepository;

    @Override
    public void addBank(BankDTO bankDTO) {
        Bank bank = new Bank();
        bank.setBankName(bankDTO.getBankName());
        bank.setBankAccount(bankDTO.getBankAccount());
        bank.setUserName(bankDTO.getUserName());

        bankRepository.save(bank);
    }
}

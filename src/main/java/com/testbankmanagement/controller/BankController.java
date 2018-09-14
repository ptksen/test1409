package com.testbankmanagement.controller;

import com.testbankmanagement.dto.BankDTO;
import com.testbankmanagement.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Cao Nguyen on 9/14/2018.
 */
@Controller
public class BankController {
    @Autowired
    BankService bankService;
    @GetMapping(value = "/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:/add");
        return mav;
    }
    @GetMapping(value = "/add")
    public ModelAndView add(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("add");
        mav.addObject("bank", new BankDTO());
        return mav;
    }
    @PostMapping(value = "/add-process")
    public String addProcess(BankDTO bankDTO){
        bankService.addBank(bankDTO);
        return "redirect:/add";
    }

}

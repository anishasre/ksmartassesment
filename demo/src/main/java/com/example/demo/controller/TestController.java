package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.VoucherModel;
import com.example.demo.services.VoucherService;


@RestController
public class TestController {
    @Autowired 
    VoucherService vrser;
    @RequestMapping(value = "/tst",method = RequestMethod.POST)
    public String hello(){
        return "hai";
    }
    @PostMapping("/voucher")
   //@RequestMapping(value="/voucher", method=POST)
    public VoucherModel createVoucher(@RequestBody VoucherModel vr) {
		return vrser.createvoucher(vr);
	}
}

package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.VoucherModel;
import com.example.demo.repository.VoucherRepository;

@Service
public class VoucherService {
    @Autowired
    VoucherRepository vrrep;
    

    public VoucherModel createvoucher(VoucherModel vrmod){

        return vrrep.save(vrmod);

    }
}

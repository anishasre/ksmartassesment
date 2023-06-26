package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.VoucherModel;

@Repository
public interface VoucherRepository extends JpaRepository<VoucherModel,Long>{
    
}

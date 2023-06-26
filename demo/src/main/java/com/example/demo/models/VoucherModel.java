package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="voucher_det")
public class VoucherModel {
    
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
    
@Column(name = "name")
private String name;

@Column(name = "address")
private String address;

@Column(name = "phone")
private String phone;

@Column(name = "headid")
private int headid;

@Column(name = "amount")
private Double amount;

@Override
	public String toString() {
		return "VoucherModel [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ",headid="+headid+",amount="+amount +"]";
	}
}

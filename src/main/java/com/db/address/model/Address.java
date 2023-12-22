package com.db.address.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {

	private Long Id;
	private String hNo;
	private String street;
	private String city;
	private String country;
	private String pinCode;
}

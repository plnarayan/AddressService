package com.db.address.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.db.address.model.Address;

import jakarta.annotation.PostConstruct;

@RestController
public class AddressController {

	
	Map<Long, Address> addressMap ;
	@PostConstruct
	private void loadData() {
		Address address1 = new Address(1L,"89-2-3/1", "Sreehari peta", "Narsapur", "India", "734275");
		Address address2 = new Address(2L,"5-2-3/1", "TNGO Colony", "Hyderabad", "India", "94275");
		Address address3 = new Address(3L,"5-8-90/1", "Gachibowli", "Hyderabad", "India", "84275");
		Address address4 = new Address(4L,"95-2-3/1", "Shapur", "Narsapur", "Hyderabad", "34275");
		Address address5 = new Address(5L,"56-2-3/1", "Mehadipatnam", "Hyderabad", "India", "74275");
		Address address6 = new Address(6L,"53-2-3/1", "SSriram pet", "Narsapur", "India", "89275");
		Address address7 = new Address(7L,"15-2-3/1", "Kondaput", "Hyderabad", "India", "234275");
		Address address8 = new Address(8L,"9-2-3/9", "Raypet", "Narsapur", "India", "674275");
		Address address9 = new Address(9L,"68-2-3/8", "Tadepalligudem", "Gudem", "India", "894275");
		Address address10= new Address(10L,"87-2-3/7", "Bhimavaram", "Bhimavaram", "India", "894275");
		Address address11 = new Address(11L,"235-2-3/4", "Rajamundry", "Rajamundry", "India", "553275");
		
		addressMap =  new TreeMap<Long, Address>();
		addressMap.put( address1.getId(),address1);
		addressMap.put( address2.getId(),address2);
		addressMap.put( address3.getId(),address3);
		addressMap.put( address4.getId(),address4);
		addressMap.put( address5.getId(),address5);
		addressMap.put( address6.getId(),address6);
		addressMap.put( address7.getId(),address7);
		addressMap.put( address8.getId(),address8);
		addressMap.put( address9.getId(),address9);
		addressMap.put( address10.getId(),address10);
		addressMap.put( address11.getId(),address11);
		
	}

	@GetMapping("/getAddress/{id}")
	public ResponseEntity<Address> getAddress(@PathVariable  Long id) {
		Address address = null;
		if( addressMap!= null) {
		 address = addressMap.get(id);
		}
		return new ResponseEntity<Address>(address, HttpStatus.OK);

	}

}

package com.sss.bank.validation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sss.bank.validation.api.pojo.BankResponse;

@RestController
public class SSSEquifaxController {

	@RequestMapping(value = "/api/sg/bank", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<Object> bankValidation(
			@RequestParam(required = true, value = "sortcode") String sortcode,
			@RequestParam(required = true, value = "account") String account) {
		
		BankResponse bankResponse=new BankResponse();
		
		bankResponse.setValid("Account is valid"+sortcode);
		bankResponse.setBankname("HSBC"+account);
		bankResponse.setAddress("Glasgow"+account);
		
		
		return new ResponseEntity<Object>(bankResponse, HttpStatus.OK);

		

	}

}

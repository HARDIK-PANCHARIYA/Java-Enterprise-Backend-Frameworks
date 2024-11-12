package com.core.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.core.entity.Bank;
import com.core.service.BankService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class BankController {

	@Autowired
	BankService bankservice;

	@GetMapping("/getAllBankDetails")
	public List<Bank> getAllBankDetails() {
		return bankservice.getAllBankDetails();

	}

	@PostMapping("/insertBankDetails")
	public String insertBankDetails(@RequestBody Bank b) {
		return bankservice.insertBankDetails(b);
	}

	@GetMapping("/getBankDetailsById/{custId}")
	public Bank getById(@PathVariable int custId) {
		return bankservice.getById(custId);
	}

	@PutMapping("/updateById/{custId}")
	public String updateById(@RequestBody Bank b, @PathVariable int custId) {
		return bankservice.updateById(b, custId);
	}

	@PutMapping("/updateBankDetails")
	public String updateBankDetail(@RequestBody Bank b) {
		return bankservice.updateBankDetail(b);
	}

	@DeleteMapping("/deleteById/{custId}")
	public String deleteById(@PathVariable int custId) {
		return bankservice.deleteById(custId);
	}
	
	@DeleteMapping("/deleteByIdResponse/{custId}")
	public ResponseEntity<?> deleteByIdResponse(@PathVariable int custId){
		try {
			bankservice.deleteById(custId);
			return new ResponseEntity<>("Data delete successfully",HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>("Data not Found",HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/countCustomerByBank/{bankname}")
	public HashMap<String, Integer> countCustomerByBank(@PathVariable String bankname) {
		return bankservice.countCustomerByBank(bankname);
	}

	@GetMapping("/onlyBankNameAndCustName")
	public HashMap<String, List<String>> getBankNameAndCustName() {
		return bankservice.getBankNameAndCustName();
	}
	
	
	@GetMapping("/getBankDetailsByCustName/{CustName}")
	public List<Bank> getBankDetailsByCustName(@PathVariable String CustName) {
		return bankservice.getBankDetailsByCustName(CustName);
	}
	
	@GetMapping("/getBankNameAndCustNameByBankName/{bankname}")
	public HashMap<String, List<String>> getBankNameAndCustNameByBankName(@PathVariable String bankname){
		return bankservice.getBankNameAndCustNameByBankName(bankname);
	}
	
	@GetMapping("/getBankDetailsBalanceMoreThan30000")
	public List<Bank> getBankDetailsBalanceMore(){
		return bankservice.getBankDetailsBalanceMore();
	}
	
	@GetMapping("/getCountAcctTypeBankName")
	public int getcount(@RequestParam String acctType, @RequestParam String bankName) {
		return bankservice.getcount(acctType,bankName);
	}

}

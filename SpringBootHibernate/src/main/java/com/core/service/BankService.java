package com.core.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dao.BankDao;
import com.core.entity.Bank;

@Service
public class BankService {

	@Autowired
	BankDao dao;
	
	public List<Bank> getAllBankDetails() {
		return dao.getAllBankDetails();
	}

	public String insertBankDetails(Bank b) {
		return dao.insertBankDetails(b);
		
	}

	public Bank getById(int custId) {
		
		return dao.getById(custId);
	}

	public String updateById(Bank b, int custId) {
		
		return dao.updateById(b,custId);
	}

	public String updateBankDetail(Bank b) {
		return dao.updateBankDetail(b);
	}

	public String deleteById(int custId) {
		return dao.deleteById(custId);
	}

	public HashMap<String, Integer> countCustomerByBank(String bankname) {
		return dao.countCustomerByBank(bankname);
	}

	public HashMap<String, List<String>> getBankNameAndCustName() {
		return dao.getBankNameAndCustName();
	}

	public List<Bank> getBankDetailsByCustName(String custName) {
		return dao.getBankDetailsByCustName(custName);
	}

	public HashMap<String, List<String>> getBankNameAndCustNameByBankName(String ba) {
		return dao.getBankNameAndCustNameByBankName(ba);
	}

	public List<Bank> getBankDetailsBalanceMore() {
		return dao.getBankDetailsBalanceMore();
	}

	public int getcount(String acctType, String bankName) {
		return dao.getcount(acctType,bankName);
	}

	


}

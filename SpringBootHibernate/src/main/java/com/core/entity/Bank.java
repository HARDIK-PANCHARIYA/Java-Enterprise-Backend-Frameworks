package com.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	int custid;
	long acct_no;
	String custName;
	String acct_type;
	int balance;
	String bankName;
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bank(int custid, long acct_no, String custName, String acct_type, int balance, String bankName) {
		super();
		this.custid = custid;
		this.acct_no = acct_no;
		this.custName = custName;
		this.acct_type = acct_type;
		this.balance = balance;
		this.bankName = bankName;
	}



	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public long getAcct_no() {
		return acct_no;
	}

	public void setAcct_no(long acct_no) {
		this.acct_no = acct_no;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAcct_type() {
		return acct_type;
	}

	public void setAcct_type(String acct_type) {
		this.acct_type = acct_type;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}



	@Override
	public String toString() {
		return "Bank [custid=" + custid + ", acct_no=" + acct_no + ", custName=" + custName + ", acct_type=" + acct_type
				+ ", balance=" + balance + ", bankName=" + bankName + "]";
	}
	
	
	
	
	
	
	

}

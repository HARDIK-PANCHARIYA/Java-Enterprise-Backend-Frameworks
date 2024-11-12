package com.core.dao;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.core.entity.Bank;

@Repository
public class BankDao {
	
	
	@Autowired
	SessionFactory factory;
	
	public List<Bank> getAllBankDetails(){
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Bank.class);
		List<Bank> blist = c.list();
		return blist;
	}

	public String insertBankDetails(Bank b) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(b);
		tx .commit();
		return "Data Insert Successfully";	
	}

	public Bank getById(int custId) {
		Session session = factory.openSession();
		Bank b1 = session.get(Bank.class, custId);
		return b1;	
	}

	public String updateById(Bank b, int custId) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Bank b1 = session.load(Bank.class, custId);
		b1.setCustName(b.getCustName());
		b1.setAcct_type(b.getAcct_type());
		b1.setBalance(b.getBalance());
		b1.setBankName(b.getBankName());
		session.update(b1);
		tx.commit();
		return "Data Update Successfully";
	}

	public String updateBankDetail(Bank b) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(b);
		tx.commit();
		return "Data Update Successfully";
	}

	public String deleteById(int custId) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Bank b1 = session.load(Bank.class, custId);
		session.delete(b1);
		tx.commit();
		return "Delete Successfully";
	}

	public HashMap<String, Integer> countCustomerByBank(String bankname) {
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Bank.class);
		c.add(Restrictions.like("bankName",bankname));
		List<Bank> blist = c.list();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put(bankname, blist.size());
		return hm;
		
	}

	public HashMap<String, List<String>> getBankNameAndCustName() {
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Bank.class);
		List<Bank> blist = c.list();
		
		HashMap<String, List<String>> hm = new HashMap<>();
		for (Bank bank : blist) {
	        String bankName = bank.getBankName().toUpperCase(); 
	        String custName = bank.getCustName();
	        
	        if (hm.containsKey(bankName)) {
	            hm.get(bankName).add(custName);
	        }
	        else {
	            List<String> custList = new ArrayList<>();
	            custList.add(custName);
	            hm.put(bankName, custList);
	        }
	    }
	    return hm;
	}
	
	
	public List<Bank> getBankDetailsByCustName(String custName) {
		Session session = factory.openSession();
		Query q = session.createQuery("from Bank where custName=:cn");
		q.setParameter("cn", custName);
		List<Bank> blist = q.list();
		return blist;
	}

	public HashMap<String, List<String>> getBankNameAndCustNameByBankName(String bankname) {
		HashMap<String, List<String>> hm = new HashMap<>();
		ArrayList<?> al = new ArrayList<>();
		Session session = factory.openSession();
		Query q = session.createQuery("select custName from Bank where bankName=:bn");
		q.setParameter("bn", bankname );
		List<String> blist = q.list();
		
		hm.put(bankname,blist);
		return hm;	
	}

	public List<Bank> getBankDetailsBalanceMore() {
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Bank.class);
		c.add(Restrictions.gt("balance", 30000));
		List<Bank> blist = c.list();
		return blist;
	}

	public int getcount(String acctType, String bankName) {
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Bank.class);
		List<Bank> blist = c.list();
		ArrayList<Bank> b = new ArrayList<Bank>();
		for(Bank o : blist) {
			if(o.getAcct_type().equals(acctType) && o.getBankName().equals(bankName)) {
				b.add(o);
			}
		}
		return b.size();
	}

		
}

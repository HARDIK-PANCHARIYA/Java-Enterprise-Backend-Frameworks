package com.core.mapping;

import java.util.List;
import javax.persistence.*;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int deptid;
	String dname;
	String loc;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="deptid")
	List<Employe> emplist;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String dname, String loc) {
		super();
		this.dname = dname;
		this.loc = loc;
	}

	public Department(String dname, String loc, List<Employe> emplist) {
		super();
		this.dname = dname;
		this.loc = loc;
		this.emplist = emplist;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<Employe> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employe> emplist) {
		this.emplist = emplist;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + ", loc=" + loc + ", emplist=" + emplist + "]";
	}
	
	
	



	
	
	
	
	
	

}

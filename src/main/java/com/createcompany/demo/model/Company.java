package com.createcompany.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	@GeneratedValue
	private int cid;
	private String cName;
	private String cEmail;
	private long cPhoneNo;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public long getcPhoneNo() {
		return cPhoneNo;
	}
	public void setcPhoneNo(long cPhoneNo) {
		this.cPhoneNo = cPhoneNo;
	}
	@Override
	public String toString() {
		return "CreateCompany [cid=" + cid + ", cName=" + cName + ", cEmail=" + cEmail + ", cPhoneNo=" + cPhoneNo + "]";
	}
	
}

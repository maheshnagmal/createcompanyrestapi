package com.createcompany.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Party {
	@Id
	@GeneratedValue
	private int pId;
	private String pName;
	private String pEmail;
	private String pPhoneNo;
	private String sale;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpEmail() {
		return pEmail;
	}
	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}
	public String getpPhoneNo() {
		return pPhoneNo;
	}
	public void setpPhoneNo(String pPhoneNo) {
		this.pPhoneNo = pPhoneNo;
	}
	public String getSale() {
		return sale;
	}
	public void setSale(String sale) {
		this.sale = sale;
	}
	@Override
	public String toString() {
		return "AddParty [pId=" + pId + ", pName=" + pName + ", pEmail=" + pEmail + ", pPhoneNo=" + pPhoneNo + ", sale="
				+ sale + "]";
	}
}

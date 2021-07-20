package com.createcompany.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "PAYMENTOUT")
public class PaymentOut {
	@Id
    @GeneratedValue
    int id;
	long reciptNumber;
     String partyName;
     long phoneNumber;
     String billName;
     Date billingDate;
     int discount;
     int totalAmount;
     int paidAmount;
     String remark;
	public PaymentOut(int id, long reciptNumber, String partyName, long phoneNumber, String billName, Date billingDate,
			int discount, int totalAmount, int paidAmount, String remark) {
		super();
		this.id = id;
		this.reciptNumber = reciptNumber;
		this.partyName = partyName;
		this.phoneNumber = phoneNumber;
		this.billName = billName;
		this.billingDate = billingDate;
		this.discount = discount;
		this.totalAmount = totalAmount;
		this.paidAmount = paidAmount;
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "PaymentOut [id=" + id + ", reciptNumber=" + reciptNumber + ", partyName=" + partyName + ", phoneNumber="
				+ phoneNumber + ", billName=" + billName + ", billingDate=" + billingDate + ", discount=" + discount
				+ ", totalAmount=" + totalAmount + ", paidAmount=" + paidAmount + ", remark=" + remark + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getReciptNumber() {
		return reciptNumber;
	}
	public void setReciptNumber(long reciptNumber) {
		this.reciptNumber = reciptNumber;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	public Date getBillingDate() {
		return billingDate;
	}
	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(int paidAmount) {
		this.paidAmount = paidAmount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
     
     
}

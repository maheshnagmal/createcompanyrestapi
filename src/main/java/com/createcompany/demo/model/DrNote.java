package com.createcompany.demo.model;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "DRNOTE")
public class DrNote {
	@Id
    @GeneratedValue
    int id;
	 long returnNo;
     String partyName;
     long phoneNumber;
     String billingName;
     Date billingDate;
     long billingNumber;
     String supplierState;
     String paymentType;
     String partyType;
     String remark;
     int totalAmount;
     int reciveedAmount;
     int balanceAmount;
     String[] itemList;
	public DrNote(int id, long returnNo, String partyName, long phoneNumber, String billingName, Date billingDate,
			long billingNumber, String supplierState, String paymentType, String partyType, String remark,
			int totalAmount, int reciveedAmount, int balanceAmount, String[] itemList) {
		super();
		this.id = id;
		this.returnNo = returnNo;
		this.partyName = partyName;
		this.phoneNumber = phoneNumber;
		this.billingName = billingName;
		this.billingDate = billingDate;
		this.billingNumber = billingNumber;
		this.supplierState = supplierState;
		this.paymentType = paymentType;
		this.partyType = partyType;
		this.remark = remark;
		this.totalAmount = totalAmount;
		this.reciveedAmount = reciveedAmount;
		this.balanceAmount = balanceAmount;
		this.itemList = itemList;
	}
	@Override
	public String toString() {
		return "DrNote [id=" + id + ", returnNo=" + returnNo + ", partyName=" + partyName + ", phoneNumber="
				+ phoneNumber + ", billingName=" + billingName + ", billingDate=" + billingDate + ", billingNumber="
				+ billingNumber + ", supplierState=" + supplierState + ", paymentType=" + paymentType + ", partyType="
				+ partyType + ", remark=" + remark + ", totalAmount=" + totalAmount + ", reciveedAmount="
				+ reciveedAmount + ", balanceAmount=" + balanceAmount + ", itemList=" + Arrays.toString(itemList) + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getReturnNo() {
		return returnNo;
	}
	public void setReturnNo(long returnNo) {
		this.returnNo = returnNo;
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
	public String getBillingName() {
		return billingName;
	}
	public void setBillingName(String billingName) {
		this.billingName = billingName;
	}
	public Date getBillingDate() {
		return billingDate;
	}
	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}
	public long getBillingNumber() {
		return billingNumber;
	}
	public void setBillingNumber(long billingNumber) {
		this.billingNumber = billingNumber;
	}
	public String getSupplierState() {
		return supplierState;
	}
	public void setSupplierState(String supplierState) {
		this.supplierState = supplierState;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPartyType() {
		return partyType;
	}
	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getReciveedAmount() {
		return reciveedAmount;
	}
	public void setReciveedAmount(int reciveedAmount) {
		this.reciveedAmount = reciveedAmount;
	}
	public int getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public String[] getItemList() {
		return itemList;
	}
	public void setItemList(String[] itemList) {
		this.itemList = itemList;
	}
     
     
		
}

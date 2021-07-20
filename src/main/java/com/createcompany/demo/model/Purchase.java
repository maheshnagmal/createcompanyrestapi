package com.createcompany.demo.model;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "PURCHASE")
public class Purchase {
	@Id
    @GeneratedValue
    int id;
	String partyName;
	long phoneNumber;
	String billName;
	long billNumber;
	long purchaseNumber;
	Date purchaseDate;
	
	int paidAmount;
	int totalAmount;
	Date balanceDue;
	String remark;
	String paymentType;
   long paymentReference;
   String supplierState;
   String []itemList;
@Override
public String toString() {
	return "Purchase [id=" + id + ", partyName=" + partyName + ", phoneNumber=" + phoneNumber + ", billName=" + billName
			+ ", billNumber=" + billNumber + ", purchaseNumber=" + purchaseNumber + ", purchaseDate=" + purchaseDate
			+ ", paidAmount=" + paidAmount + ", totalAmount=" + totalAmount + ", balanceDue=" + balanceDue + ", remark="
			+ remark + ", paymentType=" + paymentType + ", paymentReference=" + paymentReference + ", supplierState="
			+ supplierState + ", itemList=" + Arrays.toString(itemList) + "]";
}
public Purchase(int id, String partyName, long phoneNumber, String billName, long billNumber, long purchaseNumber,
		Date purchaseDate, int paidAmount, int totalAmount, Date balanceDue, String remark, String paymentType,
		long paymentReference, String supplierState, String[] itemList) {
	super();
	this.id = id;
	this.partyName = partyName;
	this.phoneNumber = phoneNumber;
	this.billName = billName;
	this.billNumber = billNumber;
	this.purchaseNumber = purchaseNumber;
	this.purchaseDate = purchaseDate;
	this.paidAmount = paidAmount;
	this.totalAmount = totalAmount;
	this.balanceDue = balanceDue;
	this.remark = remark;
	this.paymentType = paymentType;
	this.paymentReference = paymentReference;
	this.supplierState = supplierState;
	this.itemList = itemList;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public long getBillNumber() {
	return billNumber;
}
public void setBillNumber(long billNumber) {
	this.billNumber = billNumber;
}
public long getPurchaseNumber() {
	return purchaseNumber;
}
public void setPurchaseNumber(long purchaseNumber) {
	this.purchaseNumber = purchaseNumber;
}
public Date getPurchaseDate() {
	return purchaseDate;
}
public void setPurchaseDate(Date purchaseDate) {
	this.purchaseDate = purchaseDate;
}
public int getPaidAmount() {
	return paidAmount;
}
public void setPaidAmount(int paidAmount) {
	this.paidAmount = paidAmount;
}
public int getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(int totalAmount) {
	this.totalAmount = totalAmount;
}
public Date getBalanceDue() {
	return balanceDue;
}
public void setBalanceDue(Date balanceDue) {
	this.balanceDue = balanceDue;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public String getPaymentType() {
	return paymentType;
}
public void setPaymentType(String paymentType) {
	this.paymentType = paymentType;
}
public long getPaymentReference() {
	return paymentReference;
}
public void setPaymentReference(long paymentReference) {
	this.paymentReference = paymentReference;
}
public String getSupplierState() {
	return supplierState;
}
public void setSupplierState(String supplierState) {
	this.supplierState = supplierState;
}
public String[] getItemList() {
	return itemList;
}
public void setItemList(String[] itemList) {
	this.itemList = itemList;
}
   
}
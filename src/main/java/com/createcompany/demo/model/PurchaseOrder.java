package com.createcompany.demo.model;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "PURCHASEORDER")
public class PurchaseOrder {
	@Id
    @GeneratedValue
    int id;
	int orderNo;
	String partyName;
	String billName;
	Date dueDate;
	int discount;
	String tax;
	int paidAmmount;
	Date balanceDue;
	String payementMode;
	long paymentReference;
	String remark;
	String supplierState;
	@Override
	public String toString() {
		return "PurchaseOrder [id=" + id + ", orderNo=" + orderNo + ", partyName=" + partyName + ", billName="
				+ billName + ", dueDate=" + dueDate + ", discount=" + discount + ", tax=" + tax + ", paidAmmount="
				+ paidAmmount + ", balanceDue=" + balanceDue + ", payementMode=" + payementMode + ", paymentReference="
				+ paymentReference + ", remark=" + remark + ", supplierState=" + supplierState + "]";
	}
	public PurchaseOrder(int id, int orderNo, String partyName, String billName, Date dueDate, int discount, String tax,
			int paidAmmount, Date balanceDue, String payementMode, long paymentReference, String remark,
			String supplierState) {
		super();
		this.id = id;
		this.orderNo = orderNo;
		this.partyName = partyName;
		this.billName = billName;
		this.dueDate = dueDate;
		this.discount = discount;
		this.tax = tax;
		this.paidAmmount = paidAmmount;
		this.balanceDue = balanceDue;
		this.payementMode = payementMode;
		this.paymentReference = paymentReference;
		this.remark = remark;
		this.supplierState = supplierState;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public int getPaidAmmount() {
		return paidAmmount;
	}
	public void setPaidAmmount(int paidAmmount) {
		this.paidAmmount = paidAmmount;
	}
	public Date getBalanceDue() {
		return balanceDue;
	}
	public void setBalanceDue(Date balanceDue) {
		this.balanceDue = balanceDue;
	}
	public String getPayementMode() {
		return payementMode;
	}
	public void setPayementMode(String payementMode) {
		this.payementMode = payementMode;
	}
	public long getPaymentReference() {
		return paymentReference;
	}
	public void setPaymentReference(long paymentReference) {
		this.paymentReference = paymentReference;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getSupplierState() {
		return supplierState;
	}
	public void setSupplierState(String supplierState) {
		this.supplierState = supplierState;
	}
   
}

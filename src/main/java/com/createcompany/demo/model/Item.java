package com.createcompany.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name = "ITEM")
public class Item {
	@Id
    @GeneratedValue
    int id;
	String itemName;
	int quantity;
	String unit;
	String barCode;
	String category;
	String subCategory;
	long hsnNumber;
	String supplierName;
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public long getHsnNumber() {
		return hsnNumber;
	}
	public void setHsnNumber(long hsnNumber) {
		this.hsnNumber = hsnNumber;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", quantity=" + quantity + ", unit=" + unit + ", barCode="
				+ barCode + ", category=" + category + ", subCategory=" + subCategory + ", hsnNumber=" + hsnNumber
				+ ", supplierName=" + supplierName + "]";
	}
	

	
}

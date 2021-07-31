package com.createcompany.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SalesOrder {
	@Id
	@GeneratedValue
	private int id;
	private int returnNo;
	private Date date;
	private String partyName;
	private String billingName;
	private long phoneNo;
	private String paymentMode;
	private Date invoiceDate;
	private String state;
	private long totalAmount;
	private String remark;
	

}

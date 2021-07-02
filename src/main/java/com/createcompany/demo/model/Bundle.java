package com.createcompany.demo.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Bundle {
	@Id
	@GeneratedValue
	private int bundleId;
	private String bundleName;
	private int bundleAmount;
	private Date startDate;
	private Date endDate;
	private String validFor;	
	public int getBundleId() {
		return bundleId;
	}
	public void setBundleId(int bundleId) {
		this.bundleId = bundleId;
	}
	public String getBundleName() {
		return bundleName;
	}
	
	public void setBundleName(String bundleName) {
		this.bundleName = bundleName;
	}
	
	public int getBundleAmount() {
		return bundleAmount;
	}
	public void setBundleAmount(int bundleAmount) {
		this.bundleAmount = bundleAmount;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getValidFor() {
		return validFor;
	}
	public void setValidFor(String validFor) {
		this.validFor = validFor;
	}
	@Override
	public String toString() {
		return "AddBundle [bundleId=" + bundleId + ", bundleName=" + bundleName + ", bundleAmount=" + bundleAmount
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", validFor=" + validFor + "]";
	}
	
}

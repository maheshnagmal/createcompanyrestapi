package com.createcompany.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SUPPLIER")
public class Supplier { 
   @Id
	@GeneratedValue
   int id;
   @Column(name = "supplierName")
    String supplierName;

   @Column(name = "firstName")
   String firstName;
   @Column(name = "lastName")
   String lastName;
   @Column(name = "emailId")
   String emailId;
   @Column(name = "billingAddress")
   String billingAddress;
   @Column(name = "dispatchAddress")
   
   String dispatchAddress;
   @Column(name = "phoneNumber")
   Long phoneNumber;
   @Column(name = "gstnNumber")
   String gstnNumber;
   @Column(name="country")
   String country;
    public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

	public Supplier() {
	super();

}



	public Supplier(int id, String supplierName, String firstName, String lastName, String emailId,
			String billingAddress, String dispatchAddress, Long phoneNumber, String gstnNumber, String country) {
		super();
		this.id = id;
		this.supplierName = supplierName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.billingAddress = billingAddress;
		this.dispatchAddress = dispatchAddress;
		this.phoneNumber = phoneNumber;
		this.gstnNumber = gstnNumber;
		this.country = country;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getId() {
        return this.id;
    }

    

	public void setId(int id) {
        this.id = id;
    }

    public Long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getBillingAddress() {
        return this.billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getDispatchAddress() {
        return this.dispatchAddress;
    }

    public void setDispatchAddress(String dispatchAddress) {
        this.dispatchAddress = dispatchAddress;
    }

    public String getGstnNumber()
    {
        return this.gstnNumber;
        
    }

    public void setGstnNumber(String gstnNumber)
    {
		this.gstnNumber = gstnNumber;
	}

  
    @Override
	public String toString() {
		return "Supplier [id=" + id + ", supplierName=" + supplierName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", emailId=" + emailId + ", billingAddress=" + billingAddress + ", dispatchAddress="
				+ dispatchAddress + ", phoneNumber=" + phoneNumber + ", gstnNumber=" + gstnNumber + ", country="
				+ country + "]";
	}
}
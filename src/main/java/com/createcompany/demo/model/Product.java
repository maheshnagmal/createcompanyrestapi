package store_module.store.classes;

import java.util.Arrays;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


@Table(name = "PRODUCT")

public class Product {
	@Id
    @GeneratedValue
    int id;
	
	String productName;
	int productQuantity;
	String itemsName[];
	String itemsQuantity[];
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String[] getItemsName() {
		return itemsName;
	}
	public void setItemsName(String[] itemsName) {
		this.itemsName = itemsName;
	}
	public String[] getItemsQuantity() {
		return itemsQuantity;
	}
	public void setItemsQuantity(String[] itemsQuantity) {
		this.itemsQuantity = itemsQuantity;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productQuantity=" + productQuantity + ", itemsName="
				+ Arrays.toString(itemsName) + ", itemsQuantity=" + Arrays.toString(itemsQuantity) + "]";
	}

}

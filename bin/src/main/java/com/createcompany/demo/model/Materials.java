package store_module.store.classes;
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
@Table(name = "MATERIAL")
public class Materials {
	@Id
	@GeneratedValue
	int id;
	String productName;
    String itemName;
    String supplierName;
    int quantity;
   String recurrent;
    String remaining;
    String productionDays;
	
	public Materials(int id,String productName, String itemName, String supplierName, int quantity, String recurrent,
			String remaining, String productionDays) {
		super();
		this.id=id;
		this.productName = productName;
		this.itemName = itemName;
		this.supplierName = supplierName;
		this.quantity = quantity;
		this.recurrent = recurrent;
		this.remaining = remaining;
		this.productionDays = productionDays;
	}
	public Materials() {
		super();
	}
	
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
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getRecurrent() {
		return recurrent;
	}
	public void setRecurrent(String recurrent) {
		this.recurrent = recurrent;
	}
	public String getRemaining() {
		return remaining;
	}
	public void setRemaining(String remaining) {
		this.remaining = remaining;
	}
	public String getProductionDays() {
		return productionDays;
	}
	public void setProductionDays(String productionDays) {
		this.productionDays = productionDays;
	}
	@Override
	public String toString() {
		return "Materials [productName=" + productName + ", itemName=" + itemName + ", supplierName=" + supplierName
				+ ", quantity=" + quantity + ", recurrent=" + recurrent + ", remaining=" + remaining
				+ ", productionDays=" + productionDays + "]";
	}
	

}

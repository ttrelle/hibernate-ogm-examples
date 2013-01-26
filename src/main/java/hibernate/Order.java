package hibernate;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(
			name="byItemsQuantity", 
			query = "SELECT o FROM Order o")
})
public class Order {

	@Id private String id;
	
	private Date date;
	
	@Column(name = "custInfo") private String customerInfo;
	
	@ElementCollection
	private List<Item> items;	
	
	public Order() {
		super();
	}
	
	public Order(String customerInfo) {
		super();
		this.customerInfo = customerInfo;
		this.date = new Date();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(String customerInfo) {
		this.customerInfo = customerInfo;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}	
	
}

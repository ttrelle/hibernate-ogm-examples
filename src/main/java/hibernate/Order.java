package hibernate;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.bson.types.ObjectId;

@Entity
public class Order {

	private ObjectId id;
	
	private Date date;
	
	@Column(name = "custInfo") private String customerInfo;
	
	private List<Item> items;	
	
	public Order(String customerInfo) {
		super();
		this.customerInfo = customerInfo;
		this.date = new Date();
	}	
	
}

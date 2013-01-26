package hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Item {

	 private int quantity;

	 private double price;
	 
	 @Column(name="desc") private String description;

	 public Item() {
	 }
	 
	public Item(int quantity, double price, String description) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.description = description;
	}
	
}

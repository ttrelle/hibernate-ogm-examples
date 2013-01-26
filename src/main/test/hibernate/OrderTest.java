package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

public class OrderTest {

	/** JPA entity manager. */
	private EntityManager em;
	
	@Before public void setUp() {
		em = Persistence.createEntityManagerFactory("primary").createEntityManager();
	}
	
	@Test public void should_find_by_items_quantity() {
		// given
		Order order = new Order("Tobias Trelle");
		List<Item> items = new ArrayList<Item>();
		items.add( new Item(1, 47.11, "Item #1") );
		items.add( new Item(2, 42.0, "Item #2") );
		order.setItems(items);
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(order);
		em.flush();
		tx.commit();
		
		// when
//		List<Order> orders = em
//				.createQuery("{\"items.quantity\": 2}")
//				.getResultList();
//		
//		// then
//		Assert.assertNotNull(orders);
//		Assert.assertEquals(1, orders.size());		
	}
}

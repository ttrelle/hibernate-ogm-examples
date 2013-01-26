package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

public class OrderTest {

	private EntityManager em;
	
	@Before public void setUp() {
		em = Persistence.createEntityManagerFactory("primary").createEntityManager();
	}
	
	@Test public void should_find_by_items_quantity() {
		
	}
}

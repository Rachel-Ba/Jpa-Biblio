package jpa01;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Test;
import entity.*;

public class TestJpa 
{
	private EntityManagerFactory factory = null;
	
	@Before
	public void init()
	{
		factory = Persistence.createEntityManagerFactory("pu_essai");
	}

	@Test
	public void findLivre() {
		
		EntityManager em = factory.createEntityManager();
		
		if(em != null)
		{
			client livre1 = em.find(client.class,1);
			System.out.println(livre1);
			
		}
		
		em.close();
		factory.close();
		
	}

	

	

}

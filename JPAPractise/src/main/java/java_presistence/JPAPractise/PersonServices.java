package java_presistence.JPAPractise;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonServices 
{
	
	public EntityManagerFactory emf = Persistence.createEntityManagerFactory("mypu");
	public EntityManager em = emf.createEntityManager();
	public EntityTransaction tx = em.getTransaction();
	
	
	public void CreatePerson(Persons person)
	{
		tx.begin();
		em.persist(person);
		tx.commit();
	}
	
}

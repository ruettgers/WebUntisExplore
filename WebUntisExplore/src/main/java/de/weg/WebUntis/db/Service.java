package de.weg.WebUntis.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Service {
	
	//protected static EntityManager em;
	private static final String PERSISTENCE_UNIT_NAME = "WebUntisExplore";
	private static EntityManagerFactory factory;

	public static EntityManager getEntityManagerInstance()
	{
	    factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    EntityManager em = factory.createEntityManager();
	
	    return em;
}
}

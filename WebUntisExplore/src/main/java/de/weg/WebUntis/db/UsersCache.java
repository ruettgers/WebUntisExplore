package de.weg.WebUntis.db;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Dient der temporaren Bereitstellung der Daten aus der users-Tabelle.
 * Es findet keine speicherung der Daten statt.
 * Die Klasse dient dazu, Benutzernamen für den Massenimport abzugleichen.
 * Wird ein Name generiert, darf dieser noch nicht in der bestehendnen Tabelle enthalten sein.
 * Neue zu vergebende Namen können eingefügt werden (als dummy) damit bei erneutem prüfen von weiteren generierten Namen dieser Name als neuer NAme bekannt ist und daher ein neuer neuer NAme generiert werden muss.
 * Die neuen Namen werden aber nicht in die Datenbank zurücktransferiert. Dies muss dann durch den eigentlichen Massenupload der Import Datei geschehen.
 *  
 * @author dirk
 *
 */
public class UsersCache {
	

		protected static Map<String, Users> usersNameCache;
		protected static UsersCache usc;
		
		private UsersCache()
		{
			usersNameCache = new HashMap<String, Users>();
			UsersService us = UsersService.getInstance();
			Collection<Users> users = us.findAll();
			for(Users u : users)
			{
				usersNameCache.put(u.getName(),u);
			}
			
		}
		
		public static UsersCache getInstance()
		{
			if (usc ==null)
			{
				usc = new UsersCache();
			}
			return usc;
			
		}
		
		public void insertDummyName(String name)
		{
			if (!usersNameCache.containsKey(name))
				{
				usersNameCache.put(name,null);
				};
		}

		public boolean containsName(String name)
		{
			return usersNameCache.containsKey(name);
		}
}

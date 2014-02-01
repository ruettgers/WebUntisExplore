package de.weg.WebUntis.db;

import java.util.Collection;
import java.util.List;

import javax.persistence.Query;

public class UsersService {
	protected static UsersService us;
	protected static String tableName = "Users";

	public static UsersService getInstance() {
		if (us == null) {
			us = new UsersService();
		}
		return us;
	}

	public Users createUsers(Integer id, String name) {
		Users usr = new Users();
		usr.setName(name);
		usr.setUSER_ID(id.toString());
		Service.getEntityManagerInstance().persist(usr);
		return usr;
	}


	@SuppressWarnings("unchecked")
	public List<Users> findByName(String name) {
		String paramName = "ParamName";
		Query q = Service.getEntityManagerInstance().createQuery(
				"SELECT u FROM " + tableName + " u WHERE Name = :" + paramName);
		q.setParameter(paramName, name);
		return q.getResultList();
	}

	
	public boolean existUserWithName(String name) {
		return !(findByName(name).isEmpty());
	}


	@SuppressWarnings("unchecked")
	public Collection<Users> findAll() {
		Query query = Service.getEntityManagerInstance().createQuery(
				"SELECT u FROM " + tableName + " u");
		return (Collection<Users>) query.getResultList();
	}
}

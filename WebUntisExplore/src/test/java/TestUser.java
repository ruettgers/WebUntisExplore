

import de.weg.WebUntis.db.UsersService;

public class TestUser {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		userCheck("R�");
		userCheck("R�sssssss");
		
	}

	private static void userCheck(String name) {

		System.out.print("Check Users:"+name);
		UsersService us = UsersService.getInstance();
		System.out.println(":"+us.existUserWithName(name));
		
	}
}

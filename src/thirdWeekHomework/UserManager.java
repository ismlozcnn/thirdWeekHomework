package thirdWeekHomework;

public class UserManager {
	String message=" isim soyisimli kullanýcý ekledi";

	public void add(User user) {
		System.out.println(user.firstName +user.lastName +" "+ message);

	}
	
	public void add(User[] users) {
		for (User user : users) {
			System.out.println(user.firstName+user.lastName+message);
		}
		
	}

}

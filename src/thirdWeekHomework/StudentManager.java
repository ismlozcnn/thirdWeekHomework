package thirdWeekHomework;

public class StudentManager extends UserManager {
	String message=" isim soyisimli öðrenci ekledi";

	@Override
	public void add(User user) {
		System.out.println(user.firstName + user.lastName + message);

	}

	public void add(User[] users) {
		for (User user : users) {
			System.out.println(user.firstName + user.lastName + message);
		}

	}

}

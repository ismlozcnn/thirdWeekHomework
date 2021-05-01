package thirdWeekHomework;

public class Main {

	public static void main(String[] args) {

		Student student = new Student(1, "�smail", "�zcan", "asdasd", 14);
		Instructor instructor = new Instructor(2, "Engin", "Demiro�", "asdasdasd", 14, "Expert");
		System.out.println(student.getProgressPercentage());
		instructor.setCourseFee(25);
		System.out.println(instructor.getCourseFee());

		User[] users = new User[] { student, instructor };

		UserManager[] userManagers = new UserManager[] { new StudentManager(), new InstructorManager() };

		// sadece tekil olarak add i�lemi yapt� fakat userManagers 2.eleman�
		// instructormanagerdan t�retti�im i�in e�itmen gibi ekledi
		for (UserManager userManager : userManagers) {
			userManager.add(student);
		}
		System.out.println();
		
		//burada ise ilk studenttan t�retti�i i�in student �zerinde ekledi ikisinini de
		//sonras�nda instructormanager �zerinden t�retti�i i�in iki nesneyi de e�itmen gibi ald�
		
		for (UserManager userManager : userManagers) {
			userManager.add(users);

		}

	}

}

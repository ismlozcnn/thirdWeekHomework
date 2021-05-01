package thirdWeekHomework;

public class Main {

	public static void main(String[] args) {

		Student student = new Student(1, "İsmail", "Özcan", "asdasd", 14);
		Instructor instructor = new Instructor(2, "Engin", "Demiroğ", "asdasdasd", 14, "Expert");
		System.out.println(student.getProgressPercentage());
		instructor.setCourseFee(25);
		System.out.println(instructor.getCourseFee());

		User[] users = new User[] { student, instructor };

		UserManager[] userManagers = new UserManager[] { new StudentManager(), new InstructorManager() };

		// sadece tekil olarak add işlemi yaptı fakat userManagers 2.elemanı
		// instructormanagerdan türettiğim için eğitmen gibi ekledi
		for (UserManager userManager : userManagers) {
			userManager.add(student);
		}
		System.out.println();
		
		//burada ise ilk studenttan türettiği için student üzerinde ekledi ikisinini de
		//sonrasında instructormanager üzerinden türettiği için iki nesneyi de eğitmen gibi aldı
		
		for (UserManager userManager : userManagers) {
			userManager.add(users);

		}

	}

}

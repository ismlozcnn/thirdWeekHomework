package thirdWeekHomework;

public class Student extends User {
	double progressPercentage;

	public Student(int id, String firstName, String lastName, String email, double progressPercentage) {
		super(id, firstName, lastName, email);
		this.progressPercentage = progressPercentage;
	}

	public double getProgressPercentage() {
		return progressPercentage;
	}

}

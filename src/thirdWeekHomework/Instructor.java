package thirdWeekHomework;

public class Instructor extends User {
	double courseFee;
	String title;

	public Instructor(int id, String firstName, String lastName, String email, double courseFee, String title) {
		super(id, firstName, lastName, email);
		this.courseFee=courseFee;
		this.title=title;

	}

	public double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}

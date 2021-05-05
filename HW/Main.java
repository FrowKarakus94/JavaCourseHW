package Odev2;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setFirstName("Ali");
		user.setLastName("Halicioglu");
		user.setEmail("birisierikli@hotmail.com");
		user.setPassword("123OPLK@6$#");
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("engindemirog@hotmail.com");
		instructor.setPassword("1238472");
		instructor.setProfession("Software");
		Student student = new Student();
		student.setFirstName(user.firstName);
		student.setLastName(user.lastName);
		student.setEmail(user.email);
		student.setPassword(user.password);
		student.setCourse("C# + Angular");
		student.setInstructor("Engin Demirog");

		StudentManager studentManager = new StudentManager();
		studentManager.Add(student);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(instructor);
		UserManager userManager = new UserManager();
		userManager.Add(user);
	}

}

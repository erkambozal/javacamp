package �dev3;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Engin","Demirog","engindemirog","Instructor");
		User user2 = new User(2,"Erkam","Bozal","erkambozal","Student");
		
		User[] users = {user1,user2};
		
		UserManager userManager = new UserManager();
		userManager.addMultiple(users);
		userManager.login("erkambozal","Student");
		userManager.logout(user1);
		userManager.delete(user2);
	
	
	Instructor engin = new Instructor(1,"Java","�dev3");
	Student erkam = new Student(1,"Java", "�dev3");
	
	InstructorManager instructorManager = new InstructorManager();
	
	instructorManager.addGivenLesson(engin);
	
	StudentManager studentManager = new StudentManager();
	studentManager.addTakenLesson(erkam);
	
	
	}
}

package �dev3;

public class UserManager {
	
	public void add(User user) {
		
	System.out.println(user.getFirstName()+"" + user.getLastName() + "kullan�c�s� eklendi.");
	}
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}
	}
	
	public void login(String userName, String userType) {
		System.out.println(userName + "adl� kullan�c� giri� yapt�.");
	}
	
	public void logout(User user) {
		System.out.println(user.getUserName() + "adl� kullan�c� ��k�� yapt�.");
	}
	public void delete (User user) {
		System.out.println(user.getFirstName() + "" + user.getLastName() + "adl� kullan�c� silindi.");
	}

}

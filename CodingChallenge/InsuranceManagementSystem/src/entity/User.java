package entity;

public class User {
	private int userId;
	private String userName;
	private String userPassword;
	private String userRole;
	
	public User() {
		
	}
	
	public User(int userId, String userName, String userPassword, String userRole) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userRole = userRole;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public String getUserPassword() {
		return this.userPassword;
	}
	
	public String getUserRole() {
		return this.userRole;
	}
	

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	public String toString() {
		return "User: [ userId=" + userId +", userName=" + userName + ", userPassword=" + userPassword +
				", userRole="+ userRole +"]";
	}
	
}

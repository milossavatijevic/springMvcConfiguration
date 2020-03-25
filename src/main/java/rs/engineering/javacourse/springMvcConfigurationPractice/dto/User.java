package rs.engineering.javacourse.springMvcConfigurationPractice.dto;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = -1868379227357288282L;
	
	private String username;
	private String password;
	private String name;
	private String lastname;
	
	public User() {
		super();
	}

	public User(String username, String password, String name, String lastname) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + ", lastname=" + lastname
				+ "]";
	}
	
	

}

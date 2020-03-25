package rs.engineering.javacourse.springMvcConfigurationPractice.dao;

import java.util.ArrayList;
import java.util.List;

import rs.engineering.javacourse.springMvcConfigurationPractice.dto.User;

public class ArrayListDao {
	
	private List<User> list;

	public ArrayListDao() {
		super();
		list = new ArrayList<User>();
	}
	
	public void save(User user) {
		list.add(user);
	}
	
	public List<User> getUsers() {
		return list;
	}
}

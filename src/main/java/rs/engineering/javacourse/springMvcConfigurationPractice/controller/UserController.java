package rs.engineering.javacourse.springMvcConfigurationPractice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import rs.engineering.javacourse.springMvcConfigurationPractice.dao.ArrayListDao;
import rs.engineering.javacourse.springMvcConfigurationPractice.dto.User;

@Controller
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private ArrayListDao usersList;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("users");
		modelAndView.addObject("list", usersList.getUsers());
		return modelAndView;
	}
	
	@ModelAttribute(name = "user")
	public User getUser() {
		return new User("n/a", "n/a", "n/a", "n/a");
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("action", "Action: add new user");
		return "add";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute(name = "user") User user) {
		
		usersList.save(user); 
		return "redirect:/users/add";
	}
	
}

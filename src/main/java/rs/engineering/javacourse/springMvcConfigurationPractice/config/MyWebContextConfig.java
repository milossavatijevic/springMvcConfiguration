package rs.engineering.javacourse.springMvcConfigurationPractice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import rs.engineering.javacourse.springMvcConfigurationPractice.controller.UserController;
import rs.engineering.javacourse.springMvcConfigurationPractice.dao.ArrayListDao;

@Configuration
@EnableWebMvc
public class MyWebContextConfig {
	
	@Bean
	public ArrayListDao arrayListDao() {
		return new ArrayListDao();
	}
	
	@Bean
	public RequestMappingHandlerMapping requestMappingHandlerMapping() {
		return new RequestMappingHandlerMapping();
	}
	
	@Bean
	public UserController userController() {
		return new UserController();
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
}

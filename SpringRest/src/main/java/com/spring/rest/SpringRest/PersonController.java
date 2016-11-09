package com.spring.rest.SpringRest;

import java.util.HashMap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class PersonController {
	
	static HashMap<Integer,User> userHm=new HashMap<Integer,User>();
	
	
	@RequestMapping(value = "/loginperson", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String login(@RequestBody User user) {
		System.out.println(user.getUserName());
		if(user.getUserName().equals(user.getPassword()))
		{
			System.out.println("Login Successful");
			return "successful login";
		}
//		else
//			System.out.println("Login failure");
		return "successful failure";
	}
	
	@RequestMapping(value = "/register/{userName}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User register(@PathVariable(value="userName") String userName){
		User user = new User();
		user.setUserName(userName);
		return user;
	}
	
	@RequestMapping(headers={"auth_token"}, method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)	
	public void logout(){
		
	}
	
	public void userInfo(){
		
	}
}
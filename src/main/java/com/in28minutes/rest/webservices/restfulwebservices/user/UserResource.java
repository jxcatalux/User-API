package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class UserResource {
	
	@Autowired
	private UserDaoService userService;
	
	@GetMapping("/users")
	public List<User> retrieveAll(){
		return userService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id){
		return userService.findOne(id);
	}
	
	@PostMapping("/user")
	public void saveUser(@RequestBody User user){
		User savedUser = userService.save(user);
	}
	
}

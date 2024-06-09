package com.devlearning.dio_api_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.devlearning.dio_api_rest.model.User;
import com.devlearning.dio_api_rest.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userRepository.listAll();
	}
	
	@DeleteMapping("/users/{id}") 
	public void deleteUsers(@PathVariable("id") Integer id) {
		userRepository.remove(id);
	}
	
}

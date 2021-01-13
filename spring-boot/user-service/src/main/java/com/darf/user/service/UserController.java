package com.darf.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darf.user.dto.UserDTO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> findAll() {
		log.info("Find all User");
		return userService.findAll();
	}
	
	@PostMapping
	public User save(@RequestBody User user) {
		log.info("Save a User");
		return userService.save(user);
	}
	
	@GetMapping("/{id}")
	public UserDTO findById(@PathVariable("id") Long id) {
		log.info("Find a User by id");
		return userService.findById(id);
	}

}

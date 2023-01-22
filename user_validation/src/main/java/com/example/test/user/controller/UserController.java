package com.example.test.user.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.user.dto.UserRequest;
import com.example.test.user.entity.User;
import com.example.test.user.exception.UserNotFoundException;
import com.example.test.user.services.UserService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@RestController
@RequestMapping("/usermapping")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping(value = "/saveuser")
	public ResponseEntity<User> saveAllUser(@RequestBody @Valid UserRequest user) {
		return new ResponseEntity<User>(service.saveUser(user),HttpStatus.CREATED);

	}

	@GetMapping(value = "/getalluserobjects")
	public ResponseEntity<List<User>> getUserDtls() {
		return  ResponseEntity.ok(service.getAllUsers());
	}

	@GetMapping(value = "/uservalue/{userId}", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

	public ResponseEntity<User> getUser(@PathVariable int userId) throws UserNotFoundException {
		return  ResponseEntity.ok(service.getUser(userId));
	}

}

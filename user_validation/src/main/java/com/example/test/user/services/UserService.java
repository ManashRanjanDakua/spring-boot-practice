package com.example.test.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.user.dto.UserRequest;
import com.example.test.user.entity.User;
import com.example.test.user.exception.UserNotFoundException;
import com.example.test.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public User saveUser(UserRequest userrequest) {

		User user = new User(0, userrequest.getName(), userrequest.getEmail(), userrequest.getMobile(),
				userrequest.getGender(), userrequest.getAge(), userrequest.getNationality());
		return repo.save(user);

	}

	public List<User> getAllUsers() {
		return repo.findAll();
	}

	public User getUser(int userId) throws UserNotFoundException {
		// return repo.findById(userId).orElse(null);
		User user = repo.findById(userId).orElse(null);
		if (user != null) {
			return user;
		} else {
			throw new UserNotFoundException("User Not Found for this Id:- " + userId);
		}
	}

}

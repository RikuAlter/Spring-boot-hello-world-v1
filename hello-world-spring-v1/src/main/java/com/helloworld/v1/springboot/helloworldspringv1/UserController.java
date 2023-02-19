package com.helloworld.v1.springboot.helloworldspringv1;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// path: /users
// User: id, name, phoneNo

@RestController
public class UserController {
		
	@RequestMapping("/users")
	public List<User> fetchUsers(){
		return Arrays.asList(
				new User(1, "Rahul Sarkar", "7557025155"),
				new User(2, "Jyotidip Barman", "9988776655"),
				new User(3, "Rina Sarkar", "9641132618")
				);
	}
}

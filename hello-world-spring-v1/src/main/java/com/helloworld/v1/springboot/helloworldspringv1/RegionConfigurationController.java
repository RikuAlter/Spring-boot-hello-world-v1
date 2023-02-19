package com.helloworld.v1.springboot.helloworldspringv1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// path: /users
// User: id, name, phoneNo

@RestController
public class RegionConfigurationController {
	
	@Autowired
	private RegionServiceConfiguration regionServiceConfiguration;
		
	@RequestMapping("/region-config")
	public RegionServiceConfiguration fetchUsers(){
		return this.regionServiceConfiguration;
	}
}

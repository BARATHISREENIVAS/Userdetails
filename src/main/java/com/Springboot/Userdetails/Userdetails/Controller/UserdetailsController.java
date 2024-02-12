package com.Springboot.Userdetails.Userdetails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.Userdetails.Userdetails.Entity.Userdetails;
import com.Springboot.Userdetails.Userdetails.Service.UserdetailsService;

@RestController
public class UserdetailsController {

	@Autowired
	private UserdetailsService userdetailsService;
	
	@PostMapping("/userdetails")
	public Userdetails postDetails(@RequestBody Userdetails userdetails) {
		return userdetailsService.saveDetails(userdetails);
	}
	
}

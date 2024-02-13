package com.Springboot.Userdetails.Userdetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	@GetMapping("/getUserdetails")
	public List<Userdetails> getUserdetails(){
		return userdetailsService.getUserdetailsAllDetails();
	}
	@RequestMapping("/getUserdetailsById/{id}")
	public Userdetails getUserDetailsById(@PathVariable int id) {
		return userdetailsService.getdetailsById(id);
	}
	@GetMapping("/getUserdetailsByFirstName/{firstname}")
	public Userdetails getUserdetailsByFirstName(@PathVariable String firstname) {
		return userdetailsService.getdetailsByFirstName(firstname);
	}
	@PutMapping("/UpdateUserdetails")
	public Userdetails updateUserDetails(@RequestBody Userdetails userDetails) {
		return userdetailsService.updatedetails(userDetails);
	}
	
	@DeleteMapping("/deleteUserdetails/{id}")
	public String deleteUserdetails(@PathVariable int id) {
		return userdetailsService.deleteDetailsById(id);
	}
}

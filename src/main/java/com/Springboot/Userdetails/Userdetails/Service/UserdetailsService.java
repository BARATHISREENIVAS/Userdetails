package com.Springboot.Userdetails.Userdetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springboot.Userdetails.Userdetails.Entity.Userdetails;
import com.Springboot.Userdetails.Userdetails.Repository.UserdetailsRepo;

@Service
public class UserdetailsService {

	@Autowired
	private UserdetailsRepo userdetailsRepo;
	
	public Userdetails saveDetails(Userdetails userdetails) {
		
		return userdetailsRepo.save(userdetails);
	}
	public List<Userdetails> getUserdetailsAllDetails(){
		return userdetailsRepo.findAll();
	}
	
	public Userdetails getdetailsById(int id){
		return userdetailsRepo.findById(id).orElse(null);
	}
	
}

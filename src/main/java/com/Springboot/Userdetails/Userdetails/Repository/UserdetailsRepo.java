package com.Springboot.Userdetails.Userdetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.Userdetails.Userdetails.Entity.Userdetails;

public interface UserdetailsRepo extends JpaRepository<Userdetails, Integer>{

}

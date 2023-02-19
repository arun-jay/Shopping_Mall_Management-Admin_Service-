package com.springproject.demo;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Mall_service_Controller 
{

	  @Autowired(required=true)
	  private Mall_Service service;
	  
	  @GetMapping("/mallservice")
	  public java.util.List<admin>list()
	  {
		  return service.listAll();
	  }
	  @GetMapping("/mallservice/{admin_Id}")
	  public ResponseEntity <admin> get(@PathVariable Integer Admin_Id)
	  {
		  try
		  {
			admin Admin = service.get(Admin_Id);
			return new ResponseEntity<admin>(Admin,HttpStatus.OK);
		  }
		  catch(NoResultException e)
		  {
			  return new ResponseEntity<admin>(HttpStatus.NOT_FOUND);
		  }
	   
	  }
		  @PostMapping("/mallservice")
		  public void add(@RequestBody admin Admin)
		  {
			  service.save(Admin);
		  }
		  @PutMapping ("/mallservice/{admin_Id}")
		  public ResponseEntity<?> update(@RequestBody admin Admin, @PathVariable Integer Admin_Id)
		  {
			  admin existadmin = service.get(Admin_Id);
			  service.save(existadmin);
			  return new ResponseEntity<>(HttpStatus.OK);
		  }
		  @DeleteMapping("/mallservice/{admin_Id}")
		  public void delete (@PathVariable Integer admin_Id)
		  {
			  service.delete(admin_Id);
		  }
	   
	}




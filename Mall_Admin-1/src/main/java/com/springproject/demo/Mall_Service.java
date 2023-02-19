package com.springproject.demo;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class Mall_Service 
{
	@Autowired
	private Mall_Admin_Repository repo;
	
	   public List<admin> listAll()
    {
  	  return repo.findAll();
    }
    
    public void save(admin admin)
    {
  	  repo.save(admin);
    }
    
    public admin get(Integer admin_Id)
    {
  	  return repo.findById(admin_Id).get();
    }
    
    public void delete(Integer admin_Id)
    {
  	  repo.deleteById(admin_Id);
    }

}



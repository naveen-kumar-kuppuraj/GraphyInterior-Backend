package com.SpringBoot.GraphyInterior.Controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SpringBoot.GraphyInterior.ClientRepository.ClientRepository;
import com.SpringBoot.GraphyInterior.Entity.Client;


@RequestMapping("/ClientController")
@RestController
@CrossOrigin("*")

public class ClientController {
	
	@Autowired
	
	private ClientRepository cr;
	
	@PostMapping("/Insert")
	ResponseEntity<Client>predefinedcreate(@RequestBody Client c)
	{
		Client ab=new Client();
		ab.setID(c.getID());
		ab.setName(c.getName());
		ab.setMobile(c.getMobile());
		ab.setEmail(c.getEmail());
		ab.setAddress(c.getAddress());
		ab.setMessage(c.getMessage());
		
		cr.save(ab);
		
		return new ResponseEntity<Client>(ab,HttpStatus.OK);
	}

	@GetMapping("/Read/{sno}")
	public ResponseEntity<Client> readClientById(@PathVariable("sno") int id) {
	    Optional<Client> client = cr.findById(id);

	    if (client.isPresent()) {
	        return new ResponseEntity<>(client.get(), HttpStatus.OK);  
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);  
	    }
	}

	
	@PutMapping("/Update")
	ResponseEntity<Client>predefinedupdate(@RequestBody Client c)
	{
		Client ad=new Client();
		ad.setID(c.getID());
		ad.setName(c.getName());
		ad.setMobile(c.getMobile());
		ad.setEmail(c.getEmail());
		ad.setAddress(c.getAddress());
		ad.setMessage(c.getMessage());
		
		cr.save(ad);
		
		return new ResponseEntity<Client>(ad,HttpStatus.OK);
	}
	
	@DeleteMapping("/Delete")
	 ResponseEntity<Client> preDefinedDelete(@RequestBody Client c)
	{
		int ac= cr.deleteById(c.getID());
		System.out.println(ac);
		
		
	
	   return new ResponseEntity<Client>(HttpStatus.OK);
	}

}

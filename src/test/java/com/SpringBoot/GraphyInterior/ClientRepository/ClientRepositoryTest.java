package com.SpringBoot.GraphyInterior.ClientRepository;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.SpringBoot.GraphyInterior.Entity.Client;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class ClientRepositoryTest {
	
	@Autowired
	private ClientRepository cr;
	
	@Test
	void predefinedInsert()
	{
		Client ab=new Client();
		ab.setID(2);
		ab.setName("kumar");
		ab.setMobile("9988776655");
		ab.setEmail("naveen@gmail.com");
		ab.setAddress("chennai");
		ab.setMessage("hello");
		
		cr.save(ab);
	}
	 
	@Test
	void predefinedread()
	{
		Optional<Client>ac=cr.findById(2);
		System.out.println(ac);
	}
	
	@Test
	void predefinedupdate()
	{
		Client ad=new Client();
		ad.setID(1);
		ad.setName("naveen");
		ad.setMobile("000000");
		ad.setEmail("kevin@gmail.com");
		ad.setAddress("kerala");
		ad.setMessage("bye");
		
		cr.save(ad);
		
	}
	
	@Test
	void predefineddelete()
	{
		cr.deleteById(2);
	}

}

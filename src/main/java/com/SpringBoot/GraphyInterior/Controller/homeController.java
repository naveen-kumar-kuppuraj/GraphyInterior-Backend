package com.SpringBoot.GraphyInterior.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/homeController")
@RestController

public class homeController {
	
	@GetMapping("/home")
	String welcome()
	{
		return "hello";
	}

	

}

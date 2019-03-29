package com.superzero.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController  
public class TestController {
	
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test()
	{
		 return "Hello, jenkins 1.0.2";
	}

}

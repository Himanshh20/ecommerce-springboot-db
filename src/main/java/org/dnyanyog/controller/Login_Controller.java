package org.dnyanyog.controller;

import org.dnyanyog.dto.Login_Request;
import org.dnyanyog.dto.Login_Response;
import org.dnyanyog.service.Login_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Login_Controller {   
	 @Autowired 
	 Login_Service loginservice ; 
	@PostMapping ("/login ") 
	public Login_Response login(@RequestBody Login_Request loginBody)   {  
		System.out.println(loginBody.user) ; 
		System.out.println(loginBody.password) ; 
    
		
				return loginservice.login(loginBody);
			
		
	}
	}
	 



package org.dnyanyog.service;

import org.dnyanyog.dao.Login_Dao;
import org.dnyanyog.dto.Login_Request;
import org.dnyanyog.dto.Login_Response;
import org.dnyanyog.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

 @Component
public class Login_Service {  
	 @Autowired
	
	  Login_Dao loginDao ; 
	  public  Login_Response login( Login_Request loginbody )  {
		   Login_Response response = new Login_Response  ()  ;  
		     
		    Login user  = loginDao.findByLoginname(loginbody.user) ; 
		      
		    	 response.errorCode= "0000" ; 
		    	 response.message= "Success" ; 
		    	 response.firstname = user.getFirstname(); 
		    	 response.lastname = user.getLastname() ; 
		    	 response.loginname = user.getLoginname() ; 
		    	   
		  
		      return response; 
		    
	 
	




} 
 }

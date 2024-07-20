package org.dnyanyog.dao;

import org.dnyanyog.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface Login_Dao extends JpaRepository<Login , Integer> { 
	// public Login findByFirstname(String firstname ) ;   
	 
	//public Login findByLoginname(String  loginname ) ;

	public Login findByLoginname(String loginname); 

	 

}

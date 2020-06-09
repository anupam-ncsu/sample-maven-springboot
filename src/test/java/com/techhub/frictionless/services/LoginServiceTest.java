package com.techhub.frictionless.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LoginServiceTest {
	
	/**
	 * Test valid user creds
	 */
	@Test
	public void LoginServiceValidCredentails() {
		
		LoginService svc = new LoginService();
		
		boolean result = svc.validateUser("demo","demo");
		assertEquals(true, result);
	}
	
	/**
	 * Test Invalid user creds
	 */
	@Test
	public void LoginServiceInValidCredentails() {
		
		LoginService svc = new LoginService();
		
		boolean result = svc.validateUser("fake","fake");
		assertEquals(false, result);
	}

}

package com.worldpay.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.worldpay.service.AuthenticateUser;
import com.worldpay.service.FileReader;
import com.worldpay.service.UserInfo;

import static org.mockito.Mockito.*;

public class AuthenticateUserTest {

	AuthenticateUser authenticateUser;
	
	
	@Before
	public void init(){
		authenticateUser = new AuthenticateUser();
	}
	
	@Test
	public void isAuthenticateUserTest() {
		
		FileReader fr = Mockito.mock(FileReader.class);
		when(fr.getFileData()).thenReturn("2121su");
		
		UserInfo user = new UserInfo();
		user.setName("user");
		user.setDOB("12072014");
		user.setPhoneNumber("1234567");
		
		boolean res = authenticateUser.isAuthenticateUser(fr, user);
		assertTrue(res);
	}

}

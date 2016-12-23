package com.worldpay.AdditionTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.worldpay.service.AddNumber;

@RunWith(JUnit4.class)
public class AddNumberTest {
	AddNumber number;
	@Before
	public void init(){          //Call this method every time before any test method call
		number =new AddNumber();
	}

	@Test
	public void test() {
		// number = new AddNumber();
		assertEquals(5, number.addNumber(2, 3));
	}
	
	@After
	public void after(){   //Call this method every time after any test method call
		number = null;
	}

}

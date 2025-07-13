package com.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.base.baseclass;

public class Title_Validation extends baseclass {
	@Test
	public void add() {
		
		lp.Login("kiran@gmail.com", "123456");
		assertEquals(page.title(), "ram");
		
		
		
	}

}

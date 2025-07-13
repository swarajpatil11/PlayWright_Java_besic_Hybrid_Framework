package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.baseclass;

public class TC_Login_001 extends baseclass {
	@Test(dataProvider = "td")
	void login(String email, String passwd) {
		lp.Login(email, passwd);
	}
		
		@DataProvider(name = "td")
		String[][] LoginData() throws Exception {

			String[][] data = utilities.ReadExcelLogin.ReadXL();

			return data;

		}

}

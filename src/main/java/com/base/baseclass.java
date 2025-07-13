package com.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.pages.loginpage;

public class baseclass {
	public static Page page;
	public static loginpage lp;

	@BeforeMethod
	public static void Setup() {

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		page = browser.newPage();
		page.navigate("https://javabykiran.com/liveproject/index.html#");

		lp = new loginpage(page);

	}

	@AfterMethod
	public void after() {
		page.close();
	}
}

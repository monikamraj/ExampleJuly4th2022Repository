package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeDemo3 {
	public static WebDriver oBrowser=null;
	public static ActiTimeDemo1 oPage=null;
	public static void main(String[]args)
	{
		 launchBrowser();
		 navigate();
		 login();
		 flyoutWindow();
		 createUser();
		//deleteUser();
		//Logout();
		 }
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","E:\\Exampleautomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimeDemo1(oBrowser);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void login()
	{
		try {
			oPage.getUserName().sendKeys("admin");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
			}
	}
private static void flyoutWindow()
{
	try {
		oPage.getFlyoutWindow().click();
		Thread.sleep(2000);
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}
}
private static void createUser()
{
	try {
		oPage.getcontentselectedusers().click();
		Thread.sleep(2000);
		oPage.getAdduser().click();
		Thread.sleep(2000);
		oPage.oFirstName().sendKeys("Monika");
		Thread.sleep(2000);
		oPage.oLastName().sendKeys("M Raj");
		Thread.sleep(2000);
		oPage.getmail().sendKeys("monikamraj@gmail.com");
		Thread.sleep(2000);
		oPage.getUserName().sendKeys("Sonika");
		Thread.sleep(2000);
		oPage.oPASSword().sendKeys("darling");
		Thread.sleep(2000);
		oPage.RePassword().sendKeys("darling");
		Thread.sleep(2000);
		oPage.oClickCreate().click();
		Thread.sleep(2000);
	} catch (Exception e) {
		e.printStackTrace();
		
	}
}
private static void modify()
{
	try {
		oPage.omodify().click();
		Thread.sleep(1000);
		
	} catch (Exception e) {
		
	}
}
}

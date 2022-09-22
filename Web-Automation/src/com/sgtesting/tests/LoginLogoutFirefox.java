package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutFirefox {
	public static WebDriver oBrowser=null;
	public static void main(String args[])
	{
		launchBrowser();
		navigate();
		login()	;
		minimizeFlyOutWindow();
	   logout();	
      closeapplication();
		 }
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.gecko.driver","E:\\Exampleautomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void navigate() {
		try {
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.cssSelector("#loginButton > div:nth-child(1)")).click();
				Thread.sleep(5000);	
					
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void logout()
	{
		try {
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void closeapplication()
	{
		try {
			oBrowser.quit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}


package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static WebDriver oBrowser=null;
	public static void main(String args[])
	{
		launchBrowser()	;
		 navigate();
		 login();
		 minimizeflyOutWindow();
		 createuser();
		 modifyUser();
		// deleteUser();
		// logout();
		// closeApplication();
	}
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","E:\\Exampleautomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			 oBrowser = new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void navigate()
	{
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
			 oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			 Thread.sleep(2000);
		
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void minimizeflyOutWindow()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
	private static void createuser()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Monika");
			oBrowser.findElement(By.name("lastName")).sendKeys("M Raj");
			oBrowser.findElement(By.name("email")).sendKeys("monikamraj@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("vani");
			oBrowser.findElement(By.name("password")).sendKeys("Sonika");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Sonika");
			Thread.sleep(2000);	
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void modifyUser()
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='M Raj, Monika']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Moksha");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void deleteUser()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(2000);
		
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void logout()
	{
		try {
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void closeApplication()
	{
		try {
			oBrowser.quit();
			
		} catch (Exception e) {
			e.printStackTrace();
}
	}
}

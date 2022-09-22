package com.sgtesting.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateProject {
	
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","E:\\Exampleautomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			 oBrowser = new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	@Test(priority=2)
	private static void navigate()
	{
		try {
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
			oBrowser.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority=3,dataProvider="credentials")
	private static void login(String user,String password)
	{
		try {
			 oBrowser.findElement(By.id("username")).sendKeys(user);
			 oBrowser.findElement(By.name("pwd")).sendKeys(password);
			 oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			 Thread.sleep(2000);
		
		} catch (Exception e) {
			e.printStackTrace();
			
	}
	}
	@DataProvider
	public Object[][] credentials()
	{
		return new Object[][] {{"admin","manager"}};
	}
	
	@Test(priority=4)
	private static void minimizeflyOutWindow()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	private static void createCustomer()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys("Monika");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_descriptionField\']")).sendKeys("Beautiful soul");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
	@Test(priority=6)
	private static void createProject()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_projectNameField\']")).sendKeys("GOAL");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_projectDescriptionField\"]")).sendKeys("Discipline");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);

		
	} catch (Exception e) {
		e.printStackTrace();
		
	}
	}
	@Test(priority=7)
	private static void deleteProject()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	private static void deleteCustomer()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	@Test(priority=9)
	private static void logout()
	{
		try {
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	@Test(priority=10)
	private static void closeApplication()
	{
		try {
			oBrowser.quit();
			
		} catch (Exception e) {
				e.printStackTrace();
	}
	}
	}



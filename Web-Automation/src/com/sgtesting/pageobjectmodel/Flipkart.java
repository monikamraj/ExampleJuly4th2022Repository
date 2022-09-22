package com.sgtesting.pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	private static final int i = 0;
	public static WebDriver oBrowser=null;
	public static void main(String args[])
	{
		launchBrowser();
		navigate();
		login();
	//	 noOfLinks();
		 DisplayLinks();
	}
	private static void launchBrowser()
	{
	try {
		System.setProperty("webdriver.chrome.driver","E:\\Exampleautomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		Thread.sleep(5000);
		
	} catch (Exception e) {
		e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void login()
	{
		try {
			oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("monikamraj@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@type='password']")).sendKeys("sonika");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("9743398661");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void noOfLinks() 
	{
		try
		{
	List<WebElement> olList=oBrowser.findElements(By.xpath("//*[@href]"));
			System.out.println("# of links:"+olList.size());
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DisplayLinks()
	{
		try {
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i< olinks.size();i++);
			{
				String linkName=olinks.get(i).getText();
				System.out.println(linkName);
				
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
}

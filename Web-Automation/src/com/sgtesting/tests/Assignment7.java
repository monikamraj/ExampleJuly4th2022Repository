package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static WebDriver oBrowser=null;
	public static void main(String args[]) {
		launchBrowser();
		 navigate();
		 login();
		 minimizeflyOutWindow();
		 createCustomer();
		 createProject();
		 createTask() ;
		 deleteTask();
		//deleteProject();
		//deleteCustomer();
	// logout();
		//closeApplication();
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
		oBrowser.manage().window().maximize();
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
private static void createTask() 
{
	try {
		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")).click();
		oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("swimming");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")).sendKeys("volleyball");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[3]/td[1]/input")).sendKeys("Running");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_commitBtn\']/div/span")).click();
	} catch (Exception e) {
		e.printStackTrace(); 
		
	}
	
}
private static void deleteTask() {
	try {
		oBrowser.findElement(By.xpath("//div[text()='checkbox inactive']")).click();
		Thread.sleep(2000);
		//oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]")).click();
		//Thread.sleep(2000);
		//oBrowser.findElement(By.xpath("//*[@id=\'deleteTaskPopup_deleteConfirm_submitBtn\']")).click();
	} catch (Exception e) {
		
	}
}
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

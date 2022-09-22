package com.sgtesting.Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {
	public static WebDriver oBrowser=null;
	public static void main (String [] args)
	{
		lauchbrowser();
		navigate();
	//	absolutepath();
		//relativeXPathUsingTagName();
	//	relativeXPathUsingTagNameWithIndex();
	//	relativeXPathUsingTagNameWithAttributeNameValue();
	//	relativeXPathUsingAttributeNameValue();
	//	 relativeXPathUsingAttributeValue();
	//	 relativeXPathUsingTagNameWithMultipleAttributeNameValue();
		 //relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingAndOperator();
		// relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingOROperator();
		// relativeXPathUsingPartialMatchingOfAttributeValue();
		 relativeXPathUsingTagNameWithAttributeName_1();
	}
	{
			
			}
	private static void lauchbrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","E:\\Exampleautomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void navigate()
	{
		try {
			oBrowser.get("F:/Sample.html");
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void absolutepath()
	{
		try {
			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("Monika");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	//Case 1: Using tagName to identify the Element
	// Syntax: //<tagName>
	private static void relativeXPathUsingTagName()
	{
		try {
			oBrowser.findElement(By.xpath("//input")).sendKeys("monika");
			
		} catch (Exception e) {
			
		}
	}
	//Case 2: Using tagName with index to identify the Element
	 // Syntax: //<tagName>[index]
	private static void relativeXPathUsingTagNameWithIndex()
	{
		try {
			oBrowser.findElement(By.xpath("//input[2]")).sendKeys("Sonika");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	//Case 3: Using tagName with AtributeName and Value combination
	// Syntax: //<tagName>[@Attribute='attributevalue']
	private static void relativeXPathUsingTagNameWithAttributeNameValue()
	{
		try {
			oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
			Thread.sleep(2000);
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}
// Case 4: Irrespective of tagName with AtributeName and Value combination
	 //* Syntax: //*[@Attribute='attributevalue']
	private static void relativeXPathUsingAttributeNameValue()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Case 5: Irrespective of tagName and AtributeName using Value Alone
	// * Syntax: //*[@*='attributevalue']
	private static void relativeXPathUsingAttributeValue()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Case 6: Using tagName with Multiple AtributeName and Value combination
//	 * Syntax: //<tagName>[@Attribute='attributevalue'][@Attribute='attributevalue']
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValue()
	{
		try {
			oBrowser.findElement(By.xpath("//input[@class='submit1btn1'][@value='Submit']")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Case 7: Using tagName with Multiple AtributeName and Value combination using and operator
//	 * Syntax: //<tagName>[@Attribute='attributevalue' and @Attribute='attributevalue']
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingAndOperator()
	{
		try {
		oBrowser.findElement(By.xpath("//input[@value='Submit' and @class='submit1btn1']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	// Case 8: Using tagName with Multiple AtributeName and Value combination using OR operator
	 // Syntax: //<tagName>[@Attribute='attributevalue' or @Attribute='attributevalue']
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingOROperator()
	{
		try {
			oBrowser.findElement(By.xpath("//input[@value='Submit' and @class='submit1btn1']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Case 9: Based on Partial MAtching of Attribute Value 
	// *  starts-with(@attributename,'attributevalue')
	// *  ends-with(@attributename,'attributevalue')
	// *  contains(@attributename,'attributevalue')
	// * Syntax: //<tagName>[starts-with(@attributename,'attributevalue')]
    //* Syntax: //<tagName>[ends-with(@attributename,'attributevalue')]
	// * Syntax: //<tagName>[contains(@attributename,'attributevalue')]
private static void relativeXPathUsingPartialMatchingOfAttributeValue()
	{
		try {
			//oBrowser.findElement(By.xpath("//input[starts-with(@name,'submit1')]")).click();
			//Thread.sleep(3000);
			//oBrowser.findElement(By.xpath("//input[ends-with(@id,'button1')]")).click();
			oBrowser.findElement(By.xpath("//input[contains(@class,'btn1')")).click();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//Case 10: Using tagName with AtributeName combination
// Syntax: //<tagName>[@Attribute]
private static void relativeXPathUsingTagNameWithAttributeName_1()
 {
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<oLinks.size();i++)
		{
			String linkName=oLinks.get(i).getText();
			System.out.println(linkName);
		
	}
		
	}
}

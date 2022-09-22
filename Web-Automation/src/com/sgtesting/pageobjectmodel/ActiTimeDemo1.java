package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeDemo1 {
	public ActiTimeDemo1(WebDriver oBrowser)
	{
		PageFactory.initElements( oBrowser,this);
	}
//Web Element for User Name Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//Webelement for password text field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd; 
	}
	//Web Element for login Element
	@FindBy(xpath="//*[@id=\"loginButton\"]/div")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	//web Element for flyoutWindow
	@FindBy(xpath="//*[@id=\'gettingStartedShortcutsPanelId\']")
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyoutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//Web Element for createUser
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	private WebElement contentselectedusers;
	public WebElement getcontentselectedusers()
	{
		return contentselectedusers;
	}
	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div")
	private WebElement Adduser;
	public WebElement getAdduser()
	{
		return Adduser;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_firstNameField\"]")
    private WebElement FirstName;
    public WebElement oFirstName()
    {
    	return FirstName;

	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_lastNameField\"]")
	private WebElement LastName;
	public WebElement oLastName()
	{
		return LastName;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_emailField\"]")
	private WebElement mail;
	public WebElement getmail()
	{
		return mail;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_usernameField\"]")
	private WebElement USERNAME;
	public WebElement getUSERNAME()
	{
		return USERNAME;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]")
	private WebElement PASSword;
	public WebElement oPASSword()
	{
		return PASSword;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_passwordCopyField\"]")
	private  WebElement RePassword;
	public WebElement RePassword()
	{
		return RePassword;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]")
	private WebElement ClickCreate;
	public WebElement oClickCreate()
	{
		return ClickCreate;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")
	private WebElement DeleteUser;
	public WebElement oDeleteUser()
	{
		return DeleteUser;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
	private WebElement deleteuser;
	public WebElement getdeleteuser()
	{
		return deleteuser;
	}
	private WebElement logoutLink;
	public WebElement getLogout()
	{
		return logoutLink;
	}
    @FindBy(xpath="//*[@id=\"userListTableHeader\"]/tr[2]/th[4]")
    private WebElement modify;
    public WebElement omodify()
    {
    	return modify;
    }

	}
	

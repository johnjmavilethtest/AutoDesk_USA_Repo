package com.autodestcrm.objectrepositorylib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.autodeskcrm.gerericutils.WebDriverUtils;

public class CreateNewUsersPage extends WebDriverUtils{

	WebDriver driver;
	
	public CreateNewUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(name="user_name")
	private WebElement userNameTxb;
	
	@FindBy(name="user_password")
	private WebElement paswrdTxb;
	
	@FindBy(name="confirm_password")
	private WebElement confrmPasswrdTxb;
	
	@FindBy(name="email1")
	private WebElement emailTxb;
	
	@FindBy(name = "last_name")
	private WebElement lastNameTxb;
	@FindBy(xpath = "(//img[@align='absmiddle'])[4]")
	private WebElement selectRolesPlsBtn;
	
	@FindBy(xpath = "//a[text()='Salesman']")
	private WebElement assignRole;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//td[text()='Assign Role']")
	private WebElement pageTitle;
	
	public WebElement enterUserName(WebDriver driver)
	{
		return userNameTxb;
	}
	
	public WebElement EnterPaswrd(WebDriver driver)
	{
		return paswrdTxb;
	}
	
	public WebElement EnterCnfrmPaswrd(WebDriver driver)
	{
		return confrmPasswrdTxb;
	}
	public WebElement EnterEmail(WebDriver driver)
	{
		return emailTxb;
	}
	public WebElement EnterLastName(WebDriver driver) {
		return lastNameTxb;
	}
	public void clickOnRolesPlsBtn()
	{
		selectRolesPlsBtn.click();
	}
	
	public WebElement SelectAssignRole()
	{
		return assignRole;
	}
	public String PageTitle;
	{
		pageTitle.getText();
	}
	
	public void ClickOnSaveBtn() {
		saveBtn.click();
	}
}

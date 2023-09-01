package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_script.base_page;

public class pom extends base_page
{
		@FindBy(name="email")
		private WebElement untbox;
		@FindBy(name="pass")
		private WebElement pwdtbox;
		@FindBy(xpath = "//button[text()='Log in']")
		private WebElement loginbtn;
	public pom(WebDriver driver) 
	{
		super(driver);
	}
		
		public void username(String un)
		{
		untbox.sendKeys(un);
	    }
		public void password(String pwd)
		{
			pwdtbox.sendKeys(pwd);
		}
	   public void clicklogin()
	   {
	    loginbtn.click();
	   }
	}

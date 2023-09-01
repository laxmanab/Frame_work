package Generic_script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Framework_constants
{
		public WebDriver driver;
		@BeforeMethod
		public void openapplication()
		{
			System.setProperty(chrome_key,chrome_value);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(baseURL);
		}
		@AfterMethod
		public void Closeapplication()
		{
			driver.close();
		}
		}



package Generic_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_script.pom;

public class runner_script
{
	@Test
	public void click1() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//Thread.sleep(3000);
	driver.get("https://www.facebook.com/");
    pom p1 = new pom();
     p1.username("lakshmanbgowda");
     Thread.sleep(2000);
     p1.password("8660373953");
     Thread.sleep(2000);
     p1.clicklogin();
     //Thread.sleep(3000);
	}
}

package runner_script;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_script.excelGeneric;

public class fbexcellogin extends excelGeneric
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
String val1=excelGeneric.ddt("Sheet1",0,0);
String val2=excelGeneric.ddt("Sheet1",1,0);
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.facebook.com/login/");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys(val1);
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(val2);
driver.findElement(By.xpath("//button[@name='login']")).click();
}
}

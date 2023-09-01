package runner_script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_script.Base_test;
import pom_script.pom;

public class runner_fb extends Base_test
{
@Test(dataProvider = "testcredential")
public void validLogin(String d1,String d2)
{
	pom p = new pom(driver);
	p.username(d1);
	p.password(d2);
	p.clicklogin();
	Assert.fail();
}
@DataProvider(name="testcredential")
public Object[][] createData1()
{
	return new Object[][]
			{
		
			}
}
}

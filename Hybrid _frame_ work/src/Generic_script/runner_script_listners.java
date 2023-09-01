package Generic_script;

import org.testng.Assert;
import org.testng.annotations.Test;

public class runner_script_listners
{
		@Test
		public void test1()
		{
			System.out.println("hellow bangalore");
		}
		@Test
		public void test2()
		{
			System.out.println("hellow india");
			Assert.fail();
		}
		@Test(dependsOnMethods = "test2")
		public void test3()
		{
			System.out.println("tc skipped");
		}	
	}


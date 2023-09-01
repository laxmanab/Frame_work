package reporting_tool;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

import freemarker.log.Logger;

public class reporting_tool_log4j 
{
@Test
public void console()
{
	BasicConfigurator.configure();
	Logger log = Logger.getLogger(this.getClass().getName());
	log.error("tc error");
	log.warn("warning while tc run");
	log.info("info");
}
}

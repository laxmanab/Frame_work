package reporting_tool;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

import freemarker.log.Logger;

public class reporting_tool2
{
@Test
public void  report() throws IOException
{
	PatternLayout layout = new PatternLayout("%d %c %m %n");
	FileAppender append = new FileAppender(layout,"./report/r1.log");
	BasicConfigurator.configure(append);
	Logger log = Logger.getLogger(this.getClass().getName());
	log.error("tc error");
	log.warn("warning while tc runs");
	log.info("info");
}
}

package DDT.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingDataFromPropertyFileTest {
	@Test
	public void readingDataFromPropertyTest() throws Throwable {
		// step-1 convert physical file into java project
		FileInputStream fis = new FileInputStream("./CommonData.Properties");
		// 2 load the java object
		Properties p = new Properties();
		p.load(fis);
		// 3 read the data
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("un"));
		System.out.println(p.getProperty("pwd"));

	}
}

package DDT.practice;

import java.io.FileReader;
import java.util.HashMap;


import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadingdatafromJSONTest {
	@Test
	public void readingDataFromJSONTest() throws Throwable{
		 //1.Convert the physical file into java object
             FileReader  fr=new FileReader("D:\\KCSM12\\DEMO_MAVEN_Project\\CommonData.JSON");
          //2.convert JSON object into Java object
             JSONParser jp=new JSONParser();
             Object jobj=jp.parse(fr);
             //3.reading the data
             HashMap hp=(HashMap)jobj;
             String URL=(String) hp.get("url");
             System.out.println(URL);
             
}}

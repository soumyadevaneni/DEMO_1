package com.vtiger.generic;


	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class ProppertyFiles 
	{
		public String readDatafrompropertyfile1(String key) throws IOException {
			FileInputStream fis = new FileInputStream("D:\\KCSM12\\DEMO_MAVEN_Project\\Data.properties");

			Properties prop = new Properties();
			prop.load(fis);

			return	prop.getProperty(key);

		}


	

	


	}


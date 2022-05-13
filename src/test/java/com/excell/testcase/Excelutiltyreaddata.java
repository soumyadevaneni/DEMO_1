package com.excell.testcase;

import java.util.HashMap;
import java.util.Map;

import com.vtiger.generic.excelutility;

public class Excelutiltyreaddata {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Map<String, Integer> hp=new HashMap<String, Integer>();
		excelutility ex =new excelutility();
		for (int i=0;i<=ex.getLastRow("sheet2");i++)
		{
			int value2=ex.readNumbericDatafromExcel("sheet2",i,1);
			String name=ex.readDatafromExcel("sheet2",i,0);
			hp.put(name, value2);
		
		}
		System.out.println(hp);
	}}


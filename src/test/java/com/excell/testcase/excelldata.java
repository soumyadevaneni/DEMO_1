package com.excell.testcase;

import com.vtiger.generic.excelutility;

public class excelldata {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		// Map<String, Integer> hp=new HashMap<String, Integer>();
	     
	     excelutility eut =new excelutility();
	     for (int i=0;i<=eut.getLastRow("sheet2");i++)
	     {
	    	 int value2=eut.readNumbericDatafromExcel("sheet2",i,1);
	    			 String name=eut.readDatafromExcel("sheet2",i,0);
	    			// hp.put(name, value);
	    			 if(value2>=15000)
	    			 {
	     
	       //  System.out.println(excelUtility.readDatafromExcel("sheet2", i, 0));
	    				 System.out.println(name);
	    			 }
	    			    
	    			 
	    			 
	     }}

	}



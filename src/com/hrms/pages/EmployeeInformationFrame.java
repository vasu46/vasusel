package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.nt.util.Log4j;

public class EmployeeInformationFrame extends BaseClass {
	public static void enter_Frame(String frameName) {
		driver.switchTo().frame(frameName);
		Reporter.log("Enter the Frame");
		System.out.println("Enter the Frame");
		Log4j.info("Enter the Frame::");
	  }
	public static void exit_Frame() {
		driver.switchTo().defaultContent();
		Reporter.log("Exit the Frame::");
		System.out.println("Exit the Frame:;");
		Log4j.info("Exit the frame::");
		
	}
	

}

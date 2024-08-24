package com.rohi.training.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JenkinsCalcTest {

//	@Test
//	public void addTest() {
//		JenkinsCalculator myCalc= new JenkinsCalculator();
//		assertEquals(10,myCalc.addNumbers(5,5));
//	}
//	@Test
//	public void subtractTest() {
//		JenkinsCalculator myCalc= new JenkinsCalculator();
//		assertEquals(5,myCalc.subtractNumbers(10,5));
//	}
	
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}


}

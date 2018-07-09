package com.assignment2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Flight {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a631020\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/");
	    
	    driver.findElement(By.name("userName")).sendKeys("demo");
	    
	    driver.findElement(By.name("password")).sendKeys("demo");
	    
	    driver.findElement(By.name("login")).click();
	    
	    String SignOffValidation = driver.findElement(By.linkText("SIGN-OFF")).getText();
	    System.out.println(SignOffValidation);
	    Assert.assertTrue(SignOffValidation.contains("SIGN-OFF"));
	    System.out.println("Validation Successfull!!!");
	    
	     
	     driver.findElement(By.xpath("//input[@value='oneway']")).click();
	     
	     Select s=new Select(driver.findElement(By.name("passCount")));
	     s.selectByIndex(1);
	     
	     Select s11=new Select(driver.findElement(By.name("fromPort")));
	     s11.selectByValue("Paris");
	     
	     Select s12=new Select(driver.findElement(By.name("fromMonth")));
	     s12.selectByIndex(1);
	     
	     Select s13=new Select(driver.findElement(By.name("fromDay")));
	     s13.selectByIndex(1);
	     
	     Select s14=new Select(driver.findElement(By.name("toPort")));
	     s14.selectByVisibleText("London");
	     
	     Select s15=new Select(driver.findElement(By.name("toMonth")));
	     s15.selectByVisibleText("March");
	     
	     Select s16=new Select(driver.findElement(By.name("toDay")));
	     s16.selectByIndex(1);
	     
	     driver.findElement(By.xpath("//input[@value='Business']")).click();
	     
	     Select s17=new Select(driver.findElement(By.name("airline")));
	     s17.selectByVisibleText("Blue Skies Airlines");
	     
	     driver.findElement(By.name("findFlights")).click();
	     
	     String CityValidation = driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/b/font")).getText();
         System.out.println(CityValidation);
	     Assert.assertTrue(CityValidation.contains("Paris to London"));
	     System.out.println("Validation Successfull!!!");
		    
	     
	     
	     driver.quit();
	}


}

package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Robot_demo1 {
	 Robot rob;
  @Test
  public void f() throws AWTException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan.reddy.a\\Desktop\\Browser drivers\\chromedriver_win32\\chromedriver.exe");  
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.inviul.com/blog/");
	driver.manage().window().maximize();
	driver.findElement(By.id("s")).sendKeys("WebDriver");
	 rob=new Robot();
	rob.keyPress(KeyEvent.VK_2);
    rob.keyRelease(KeyEvent.VK_2);
   
	    rob.keyPress(KeyEvent.VK_ENTER);
	    rob.keyRelease(KeyEvent.VK_ENTER);
	    
	    rob.setAutoDelay(5000);
	    driver.close();
	   
	   
  }
}

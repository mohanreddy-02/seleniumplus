package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Webdriver_demo1 {
	
	WebDriver driver;

	
	

//  @Test(priority = 1)
//  public void f() {
//	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan.reddy.a\\Desktop\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
//  driver = new ChromeDriver();
//  driver.manage().window().maximize();
//  driver.get("http://demowebshop.tricentis.com/register");
//  driver.findElement(By.id("gender-male")).click();
//  driver.findElement(By.id("FirstName")).sendKeys("mohan");
//  driver.findElement(By.id("LastName")).sendKeys("reddy");
//  driver.findElement(By.id("Email")).sendKeys("xmgvbyz12@gmail.com");
//  driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Mohan123");
//  driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("Mohan123");
//  driver.findElement(By.id("register-button")).click();
//  }
//  @Test (priority =2)
//  public void f1() throws InterruptedException
//  {
//	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan.reddy.a\\Desktop\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
//	  driver = new ChromeDriver();
//	  
//	  String url="https://demoqa.com/menu/";
//	      //driver.get(url); //it will store in the cookies.
//	      driver.navigate().to(url);
//	      driver.manage().window().maximize();
//	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//implicit wait
//	      Actions act1= new Actions(driver);
//	      act1.moveToElement(driver.findElement(By.xpath("//*[@id=\'nav\']/li[2]/a"))).perform();
//	      Thread.sleep(1000);
//	      act1.moveToElement(driver.findElement(By.xpath("//*[@id=\'nav\']/li[2]/ul/li[3]/a"))).perform();
//	      Thread.sleep(1000);
//	      act1.moveToElement(driver.findElement(By.xpath("//*[@id=\'nav\']/li[2]/ul/li[3]/ul/li[2]/a"))).click().build().perform();
//	      driver.close();
//  }
 @Test(priority=3)
 public void f2() throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan.reddy.a\\Desktop\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
	 driver =new ChromeDriver();
     driver.manage().window().maximize();
     String url="http://demowebshop.tricentis.com/";
	 driver.get(url); //it will store in the cookies.
     driver.navigate().to(url);
     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);//implicit wait
    
     WebElement Search =driver.findElement(By.id("small-searchterms"));
     Actions act1= new Actions(driver);
     act1.sendKeys(Search,"computer").perform();
     Thread.sleep(2000);
    // act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
      
 }
}

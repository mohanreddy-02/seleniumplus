package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POM1 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan.reddy.a\\Desktop\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver =new ChromeDriver();
	     driver.get("http://demowebshop.tricentis.com/");
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	     driver.manage().window().maximize();
	     POMwithoutPFactory Pobject= new POMwithoutPFactory(driver);
	     Pobject.click_lnc();
	     Pobject.enter_uname();
	     Pobject.enter_pwd();
	     Pobject.click_lbtn();
	     Pobject.click_lout();
	     System.out.println("title is "+driver.getTitle());
	     driver.close();
	     
	  }
	}

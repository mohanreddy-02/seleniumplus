package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test(priority = 1)
  public void Login() {
	  System.out.println("Login Success");
  }
  @Test(priority = 3)
  public void Checkout() {
	  System.out.println("Checkout Success"); 
  }
  @Test(priority = 2)
  public void AddToCart() {
	  System.out.println("AddtoCart Success");
  }
  
  }


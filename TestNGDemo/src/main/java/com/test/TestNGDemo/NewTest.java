package com.test.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test(priority=2)
  public void f() {
	  System.out.print("\nHii Hello");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.print("\nSanjay\n");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.print("\nENG\n");
  }

  @Test
  public void sub() {
	  int a=10,b=3,c=0;
	  c=a-b;
	  System.out.println("Subtraction:"+c);
	  Assert.assertEquals(7,c);
  }
}

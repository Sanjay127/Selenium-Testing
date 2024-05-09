package com.test.TestNGDemo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestClassEx2 {

  @Test(priority=1)
  public void add() {
	  int a=5,b=3,c=0;
	  c=a+b;
	  System.out.println("Addition:"+c);
	  Assert.assertEquals(8,c);
  }
  @Test(priority=2)
  public void sub() {
	  int a=10,b=3,c=0;
	  c=a-b;
	  System.out.println("Subtraction:"+c);
	  Assert.assertEquals(7,c);
  }
  @Test(priority=3)
  public void mul() {
	  int a=6,b=2,c=0;
	  c=a*b;
	  System.out.println("Multiplication:"+c);
	  Assert.assertEquals(12,c);
  }
  @Test()
  public void div() {
	  int a=10,b=5,c=0;
	  c=a/b;
	  System.out.println("Division:"+c);
	  Assert.assertEquals(2,c);
  }


  @Test(priority=0)
  public void addsum() {
	  int a=3,b=3,c=0;
	  c=a+b;
	  System.out.println("Add:"+c);
	  Assert.assertEquals(6, c);
  }
  
}

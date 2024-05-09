package com.test.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ParallelTest {
  @Test(priority=3)
  public void T01() {
	  System.out.println("Test 01");
  }
  @Test
  public void T02() {
	  System.out.println("Test 02");
  }
  @Test
  public void T03() {
	  System.out.println("Test 03");
  }
  @Test
  public void T04() {
	  System.out.println("Test 04");
  }
  @Test
  public void T05() {
	  System.out.println("Test 05");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Test Started");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Test Ended");
  }

}

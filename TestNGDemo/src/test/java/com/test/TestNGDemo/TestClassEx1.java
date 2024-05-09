package com.test.TestNGDemo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassEx1 {
	WebDriver driver;
  @Test
  public void checkTitle() {
	  String expectedTitle="Guest Registration Form – User Registration";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle,expectedTitle);
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}




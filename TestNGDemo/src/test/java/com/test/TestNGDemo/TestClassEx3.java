package com.test.TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassEx3 {
	WebDriver driver;
  @Test
  public void Test() {
	  driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	  WebElement user=driver.findElement(By.xpath("//*[@name=\"username\"]"));
	  user.sendKeys("Admin");
	  WebElement pass=driver.findElement(By.xpath("//*[@name=\"password\"]"));
	  pass.sendKeys("Admin@123");
	  WebElement login=driver.findElement(By.xpath("//*[@type=\"submit\"]"));
	  login.click();


}
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  System.out.println(driver.getTitle());
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}

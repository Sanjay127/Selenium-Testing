package com.test.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DragAndDrop {
	WebDriver driver;
  @Test
  public void dragDrop() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demoqa.com/droppable/");
	  driver.manage().window().maximize();
	  WebElement source=driver.findElement(By.id("draggable"));
	  WebElement destination=driver.findElement(By.id("droppable"));
	  Actions act=new Actions(driver);
	  act.dragAndDrop(source, destination).build().perform();


  }
}

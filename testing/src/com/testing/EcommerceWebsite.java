package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("Webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement fname=driver.findElement(By.id("input-firstname"));
		fname.sendKeys("Sanjay");
		WebElement lname=driver.findElement(By.name("lastname"));
		lname.sendKeys("M");
		WebElement em=driver.findElement(By.name("email"));
		em.sendKeys("sanj215@gmail.com");
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("Sanj@07");
		driver.findElement(By.id("input-newsletter-no"));
		  
		
	}

}

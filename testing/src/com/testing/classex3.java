package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class classex3 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("Webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		System.out.println(driver.getTitle());
		WebElement fname=driver.findElement(By.cssSelector("input#input-firstname"));
		fname.sendKeys("Sanjay");
		WebElement lname=driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]"));
		lname.sendKeys("M");
		WebElement em=driver.findElement(By.cssSelector("input.form-control[placeholder=\"E-Mail\"]"));
		em.sendKeys("sanj215@gmail.com");
		WebElement pass=driver.findElement(By.cssSelector("input[type=\"password\" i]"));
		pass.sendKeys("Sanj@07");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\"input-newsletter-yes\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}

}

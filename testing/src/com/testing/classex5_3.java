package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class classex5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("Webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		List<WebElement>products=driver.findElements(By.xpath("//h2[@itemprop='name']"));
		for(int i=0;i<products.size();i++)
		{
			System.out.println(products.get(i).getText());
		}
		
		
	}

}

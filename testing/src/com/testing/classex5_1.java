package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class classex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("Webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Home")){
			System.out.println("Matched Home Title");
		}
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		if(driver.getTitle().equals("Shop")) {
			System.out.println("Matched Shop Title");
		}
	}
	
}

package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class classex5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("Webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
	
		if(driver.getCurrentUrl().equals("https://j2store.net/free/")){
			System.out.println("Matched URL");
		}
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().equals("https://j2store.net/free/index.php/shop?filter_catid=11")) {
			System.out.println("Matched Shop URL");
		}

	}

}

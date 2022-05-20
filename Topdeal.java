package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet132\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.urbanladder.com");
		
	driver.findElement(By.xpath("//*[@id='topnav_wrapper']/ul/li[1]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[1]/div/div/ul/li[1]/ul/li[1]/a/span")).click();
	
		
	}

}
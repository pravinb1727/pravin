package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet132\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.urbanladder.com");
		
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		
		driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
		
		driver.findElement(By.xpath("//input[@class='email required input_authentication']")).sendKeys("pravinbiradar64@gmail.com");
		
		driver.findElement(By.xpath("//input[@class='required input_authentication']")).sendKeys("pravin@27");
		
		driver.findElement(By.xpath("//input[@value=''Log In]")).click();

	}

}


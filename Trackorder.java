package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trackorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet132\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.urbanladder.com");
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/section[3]/ul/li/[1]/a/span")).click();
		
		driver.findElement(By.xpath("//input[@id='ip_379403698']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//input[@id='ip_394711104']")).sendKeys("9372481419");
		
		driver.findElement(By.xpath("//button[@class='_3Haew _1fVSi action-button _1njbS _1XfDi _1tgY9']")).click();

	}

}


package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginEPM {

	public static void main(String[] args) throws Throwable {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Enter email / mobile number']")).sendKeys("sureshbabuemp@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pword")).sendKeys("ZPMHQHIA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();

	}

}

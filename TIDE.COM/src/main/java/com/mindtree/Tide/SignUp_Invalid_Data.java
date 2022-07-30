package com.mindtree.Tide;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp_Invalid_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tide.com/en-us");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	
		driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		
		driver.findElement(By.linkText("Register")).click();
	
		driver.findElement(By.linkText("Sign up now")).click();
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String pid=it.next();
		String cid=it.next();
		driver.switchTo().window(cid);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Viku");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mgtrgdfcs772gmail.com");
		driver.findElement(By.xpath("//input[@value='CREATE ACCOUNT']")).click();
		
		
		
		
		
		
		

	}

}

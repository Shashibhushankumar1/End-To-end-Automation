package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoopDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    //	driver.get("https://spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
		  Thread.sleep(2000L);
		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		  for(int i=1;i<=4;i++) {
			  driver.findElement(By.id("hrefIncAdt")).click();
		  }
		  driver.findElement(By.id("btnclosepaxoption")).click();
		  Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	      System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
	}

}

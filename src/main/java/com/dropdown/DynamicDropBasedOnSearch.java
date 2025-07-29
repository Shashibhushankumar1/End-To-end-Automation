package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropBasedOnSearch {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//  //a[@value='MAA']  - Xpath for chennai
//  //a[@value='BLR']
	//For Bangluru
	//From Option
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	
//Below without index (//a[@value='MAA'])[2]")   Parent Child Combination Below
	//To Option(Chennai)
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
    driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	
}
}

package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Static Dropdown (Select tag)
		WebElement staticDropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select=new Select(staticDropDown);
		//Select based upon index
		select.selectByIndex(3);
		//
		System.out.println(select.getFirstSelectedOption().getText());
		//Based upon Selected Text
		select.selectByVisibleText("AED");
		System.out.println(select.getFirstSelectedOption().getText());
		//Here INR is value
		select.selectByValue("INR");
		System.out.println(select.getFirstSelectedOption().getText());	
		
	}

}

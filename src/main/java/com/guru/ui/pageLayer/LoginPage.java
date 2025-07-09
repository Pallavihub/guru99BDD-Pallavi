package com.guru.ui.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.guru.ui.baseLayer.BaseClass;


public class LoginPage extends BaseClass{
	
	
	public void user_is_on_login_page() {
		
		String currentUrl=driver.getCurrentUrl();
		
		System.out.println("Current Url is::"+currentUrl);
	    
	}
	
	public void user_click_on_sign_in() {
	    
		driver.findElement(By.xpath("//a[@href='login.php']")).click();
	}
	
	public void user_enter_username_and_password() {
		
	
		driver.findElement(By.name("userName")).sendKeys("PallaviG");
		
		driver.findElement(By.name("password")).sendKeys("PG123");
		
		driver.findElement(By.name("submit")).click();
		   
	}
	
	public void validate_user_logged_in_successfully() {
	   
		WebElement loginText=driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		
		System.out.println(loginText);
		
	}


}

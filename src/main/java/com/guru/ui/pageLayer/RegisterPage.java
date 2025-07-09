package com.guru.ui.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.guru.ui.baseLayer.BaseClass;

public class RegisterPage extends BaseClass{
	
	
public void user_is_on_register_page(String url) {
    
	BaseClass.initialization(url);
}

public void user_enter_contact_information(String firstName,String lastName, String phone, String email) {
	
	driver.findElement(By.name("firstName")).sendKeys(firstName);
	driver.findElement(By.name("lastName")).sendKeys(lastName);
	driver.findElement(By.name("phone")).sendKeys(phone);
	driver.findElement(By.name("userName")).sendKeys(email);
	
}

public void user_enter_mailing_information(String address, String city, String state, String pinCode, String country) {
    
	driver.findElement(By.name("address1")).sendKeys(address);
	driver.findElement(By.name("city")).sendKeys(city);
	driver.findElement(By.name("state")).sendKeys(state);
	driver.findElement(By.name("postalCode")).sendKeys(pinCode);
	
	WebElement countryWb=driver.findElement(By.name("country"));
	Select sel=new Select(countryWb);
	sel.selectByVisibleText(country);
}

public void user_enter_user_information(String userName, String pass, String confirmPass) {
    
	WebElement uName=driver.findElement(By.name("email"));
	uName.sendKeys(userName);
	
	WebElement Pwd=driver.findElement(By.name("password"));
	Pwd.sendKeys(pass);
	
	
	driver.findElement(By.name("confirmPassword")).sendKeys(confirmPass);
}

public void user_click_on_submit_button() {
	
	driver.findElement(By.xpath("//input[@name='submit']")).click();
    
}

public void user_navigate_to_login_page() {
    
	String loginPageUrl=driver.getCurrentUrl();
	System.out.println("Login page url is::"+loginPageUrl);
}

}

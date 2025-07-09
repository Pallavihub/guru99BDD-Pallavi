package Steps;

import com.guru.ui.baseLayer.BaseClass;
import com.guru.ui.pageLayer.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageSteps extends BaseClass{
	
	LoginPage loginPage;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		loginPage=new LoginPage();
		
		loginPage.user_is_on_login_page();
	}
	@Given("user click on sign in")
	public void user_click_on_sign_in() {
		
		loginPage.user_click_on_sign_in();
	    
	}
	@Given("user enter username and password")
	public void user_enter_username_and_password() {
		
		loginPage.user_enter_username_and_password();
	    
	}
	@Then("Validate user logged in successfully")
	public void validate_user_logged_in_successfully() {
		
		loginPage.validate_user_logged_in_successfully();
	   
	}

}

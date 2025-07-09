package Steps;

import com.guru.ui.baseLayer.BaseClass;
import com.guru.ui.pageLayer.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSteps extends BaseClass{
	
	public static RegisterPage registerPage;
	
@Given("user is on register Page")
public void user_is_on_register_page() {
    
	BaseClass.initialization("https://demo.guru99.com/test/newtours/register.php");
}
@Given("user enter contact information")
public void user_enter_contact_information() {
	
	registerPage=new RegisterPage();
	
	registerPage.user_enter_contact_information("Pallavi", "Gadge", "9988445577", "pg@gmail.com");
    
}
@Given("user enter mailing information")
public void user_enter_mailing_information() {
	
	registerPage.user_enter_mailing_information("Baner", "Pune", "Maharastra", "440012", "INDIA");
    
}
@Given("user enter user information")
public void user_enter_user_information() {
	
	registerPage.user_enter_user_information("PallaviG", "PG123", "PG123");
    
}
@When("user click on submit button")
public void user_click_on_submit_button() throws Exception {
	
	Thread.sleep(2000);
	registerPage.user_click_on_submit_button();
    
}
@Then("user navigate to login page")
public void user_navigate_to_login_page() {
	
	registerPage.user_navigate_to_login_page();
    
}

}

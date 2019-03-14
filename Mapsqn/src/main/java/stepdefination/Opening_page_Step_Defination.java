package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import step_method.Opening_page;

public class Opening_page_Step_Defination extends Opening_page {

	@Given("user is on Mapsynq welcome page")
	public void user_is_on_Mapsynq_welcome_page() {
		welcomePage();

	}

	@Then("Verify mapsynq title on welcome page")
	public void verify_mapsynq_title_on_welcome_page() {
		VerifyTitle();
	}

	@Then("Verify Search bar on Mapsynq welcome page")
	public void verify_Search_bar_on_Mapsynq_welcome_page() {
		Searchbar();

	}

	@Then("Verify Sign in tab on welcome page")
	public void verify_Sign_in_tab_on_welcome_page() {
		signin();
	}

	@Then("verify Register tab on welcome page")
	public void verify_Register_tab_on_welcome_page() {
		registertab();
	}

	@Then("Verify Mobile App tab on welcome page")
	public void verify_Mobile_App_tab_on_welcome_page() {
		MobileApp();
	}

	@Then("Verify Galactio tab on welcome page")
	public void verify_Galactio_tab_on_welcome_page() {
		Galactiotab();
	}

	@Then("Verify SG GPS Navigation tab on welcome page")
	public void verify_SG_GPS_Navigation_tab_on_welcome_page() {
		SGGPSNavigation();
	}

	@Then("verify Calender tab on  welcome page")
	public void verify_Calender_tab_on_welcome_page() {
		Calendertab();
	}

	@Then("Verify legend tab on welcome page")
	public void verify_legend_tab_on_welcome_page() {
		legendtab();
	}

}

package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import runner.com.Runner_class;

public class Opening_page_Step_Defination extends Runner_class {

	@Given("user is on Mapsynq welcome page")
	public void user_is_on_Mapsynq_welcome_page() {
		welcomePage();

	}

	@Then("Verify mapsynq title on welcome page")
	public void verify_mapsynq_title_on_welcome_page() {
		System.out.println();
	}

}

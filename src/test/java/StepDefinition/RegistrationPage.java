package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.RegistrationPage.*;
import static pages.SignInPage.*;
public class RegistrationPage {
    @When("^User clicks on new Registration button")
    public void user_click_on_new_registration_button() throws InterruptedException {
        click_newRegistration_btn();
    }
    @Then("^User should be able to view the Registration page$")
    public void user_should_be_able_to_view_the_registration_page() throws InterruptedException {
        registrationHeading_visibility();
    }
}

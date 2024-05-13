package StepDefinition;

import io.cucumber.java.en.When;

import static pages.SignInPage.*;

public class SignInPage {
    @When("^User successfully enters the log in details$")
    public void user_logsIn_to_login_page() throws InterruptedException {
        enter_username();
        enter_password();
        click_login_btn();
    }
}

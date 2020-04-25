package theinternet;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ForgotPassword {

    @Given("Navigate to Page ForgotPassword")
    public void navigateToPageForgotPassword() {
    }

    @When("A User enters a valid email id")
    public void aUserEntersAValidEmailId() {
    }

    @And("A User clicks on Retrieve password button")
    public void aUserClicksOnRetrievePasswordButton() {
    }

    @When("A User enters a invalid email id")
    public void aUserEntersAInvalidEmailId() {
    }

    @Then("Application shows that the email has been sent.")
    public void applicationShowsThatTheEmailHasBeenSent() {
        assertThat(true, is(true));
    }

   @Then("Application does not show that email has been sent.")
    public void applicationDoesNotShowThatEmailHasBeenSent() {
       assertThat(true, is(false));
    }

}

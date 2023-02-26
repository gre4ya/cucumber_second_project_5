package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.SmartBearBasePage;
import utils.Driver;

public class SmartBearSteps {

    WebDriver driver;
    SmartBearBasePage smartBearBasePage;

    @Before
    public void setup() {
        driver = Driver.getDriver();
        smartBearBasePage = new SmartBearBasePage();
    }
    @Given("user is on {string}")
    public void user_is_on(String url) {
        driver.get(url);
    }
    @When("user enters username as {string}")
    public void user_enters_username_as(String username) {
        smartBearBasePage.usernameInput.sendKeys(username);
    }
    @When("user enters password as {string}")
    public void user_enters_password_as(String password) {
        smartBearBasePage.usernameInput.sendKeys(password);
    }
    @When("user clicks on Login button")
    public void user_clicks_on_Login_button() {
        smartBearBasePage.loginButton.click();
    }
    @Then("user should see {string} message")
    public void user_should_see_message(String expectedErrorMassage) {
        Assert.assertEquals(expectedErrorMassage, smartBearBasePage.errorMassage.getText());
    }
}

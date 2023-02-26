package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.SmartBearLoginPage;
import pages.SmartBearMainPage;
import utils.Driver;
import utils.WindowHandler;

public class SmartBearSteps {

    WebDriver driver;
    SmartBearLoginPage smartBearLoginPage;
    SmartBearMainPage smartBearMainPage;

    @Before
    public void setup() {
        driver = Driver.getDriver();
        smartBearLoginPage = new SmartBearLoginPage();
        smartBearMainPage = new SmartBearMainPage();
    }
    @Given("user is on {string}")
    public void user_is_on(String url) {
        driver.get(url);
    }
    @When("user enters username as {string}")
    public void user_enters_username_as(String username) {
        smartBearLoginPage.usernameInput.sendKeys(username);
    }
    @When("user enters password as {string}")
    public void user_enters_password_as(String password) {
        smartBearLoginPage.passwordInput.sendKeys(password);
    }
    @When("user clicks on Login button")
    public void user_clicks_on_Login_button() {
        smartBearLoginPage.loginButton.click();
        WindowHandler.switchToChildWindow();
    }
    @Then("user should see {string} message")
    public void user_should_see_message(String expectedErrorMassage) {
        Assert.assertEquals(expectedErrorMassage, smartBearLoginPage.errorMassage.getText());
    }
    @Then("user should be routed to {string}")
    public void userShouldBeRoutedTo(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    @And("validate below menu items are displayed")
    public void validateBelowMenuItemsAreDisplayed(DataTable options) {
        for (int i = 0; i < options.asList().size(); i++) {
            Assert.assertEquals(options.asList().get(i), smartBearMainPage.menuOptions.get(i).getText());
        }
    }

    @When("user clicks on {string} button")
    public void userClicksOnButton(String button) {
        switch(button){
            case "Check All":
                smartBearMainPage.checkUncheckButton.get(0).click();
                break;
            case "Uncheck All":
                smartBearMainPage.checkUncheckButton.get(1).click();
                break;
            case "Process":
                smartBearMainPage.processButton.click();
                break;
            default:
                throw new NotFoundException();
        }
    }

    @Then("all rows should be checked")
    public void allRowsShouldBeChecked() {
        for (int i = 0; i < smartBearMainPage.orderSelectorCheckBoxes.size(); i++) {
            Assert.assertTrue(smartBearMainPage.orderSelectorCheckBoxes.get(i).isSelected());
        }
    }

    @Then("all rows should be unchecked")
    public void allRowsShouldBeUnchecked() {
        for (int i = 0; i < smartBearMainPage.orderSelectorCheckBoxes.size(); i++) {
            Assert.assertFalse(smartBearMainPage.orderSelectorCheckBoxes.get(i).isSelected());
        }

    }

    @When("user clicks on {string} menu item")
    public void userClicksOnMenuItem(String manuItem) {
        driver.findElement(By.xpath("//a[text()='" +manuItem + "']")).click();
    }

    @And("user selects {string} as product")
    public void userSelectsAsProduct(String dropdownOption) {
        Select select = new Select(smartBearMainPage.productDropdown);
        select.selectByVisibleText(dropdownOption);
    }

    @And("user enters 2 as quantity")
    public void userEntersAsQuantity() {
        smartBearMainPage.quantityInput.clear();
        smartBearMainPage.quantityInput.sendKeys("2");
    }

    @And("user enters all address information")
    public void userEntersAllAddressInformation() {

    }

    @And("user enters all payment information")
    public void userEntersAllPaymentInformation() {
    }

    @Then("user should see their order displayed in the {string} table")
    public void userShouldSeeTheirOrderDisplayedInTheTable(String arg0) {
    }

    @And("validate all information entered displayed correct with the order")
    public void validateAllInformationEnteredDisplayedCorrectWithTheOrder() {
    }
}

package steps;

import com.github.javafaker.Faker;
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
import utils.RandomNumberGenerator;
import utils.Waiter;
import utils.WindowHandler;

import java.util.Random;

public class SmartBearSteps {

    WebDriver driver;
    SmartBearLoginPage smartBearLoginPage;
    SmartBearMainPage smartBearMainPage;
    Faker faker = new Faker();

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
                Waiter.pause(4);
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
        driver.findElement(By.xpath("//a[text()='" + manuItem + "']")).click();
        Waiter.pause(10);
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
    String streetAddress = faker.address().streetAddress();
    String fullName = faker.name().fullName();
    String city = faker.address().city();
    String state = faker.address().state();
    String zip = faker.address().zipCode().substring(0,5);
    @And("user enters all address information")
    public void userEntersAllAddressInformation() {
        for (int i = 0; i < smartBearMainPage.addressInputFields.size(); i++) {
            switch (i){
                case 0:
                    smartBearMainPage.addressInputFields.get(i).sendKeys(fullName);
                    break;
                case 1:
                    smartBearMainPage.addressInputFields.get(i).sendKeys(streetAddress);
                    break;
                case 2:
                    smartBearMainPage.addressInputFields.get(i).sendKeys(city);
                    break;
                case 3:
                    smartBearMainPage.addressInputFields.get(i).sendKeys(state);
                    break;
                case 4:
                    smartBearMainPage.addressInputFields.get(i).sendKeys(zip);
                    break;
                default:
                    throw new NotFoundException();
            }
        }

    }
    int cardType = RandomNumberGenerator.getARandomNumber(0,2);
    String cardNumber = String.valueOf(faker.number().randomNumber(16, true));
    String cardExpDate = "0" + RandomNumberGenerator.getARandomNumber(1,9) + "/" + RandomNumberGenerator.getARandomNumber(25,30);
    @And("user enters all payment information")
    public void userEntersAllPaymentInformation() {
        smartBearMainPage.cardTypes.get(cardType).click();
        smartBearMainPage.cardNumber.sendKeys(cardNumber);
        smartBearMainPage.cardExpireDate.sendKeys(cardExpDate);
        Waiter.pause(3);
    }

    @Then("user should see their order displayed in the {string} table")
    public void userShouldSeeTheirOrderDisplayedInTheTable(String arg0) {
    }

    @And("validate all information entered displayed correct with the order")
    public void validateAllInformationEnteredDisplayedCorrectWithTheOrder() {
    }
}

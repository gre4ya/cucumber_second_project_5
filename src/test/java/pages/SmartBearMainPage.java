package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class SmartBearMainPage {
    public SmartBearMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = "ul[id='ctl00_menu'] li")
    public List<WebElement> menuOptions;
    @FindBy(css = "p[class='CheckUncheck'] a")
    public List<WebElement> checkUncheckButton;
    @FindBy(css = "input[id*='OrderSelector']")
    public List<WebElement> orderSelectorCheckBoxes;
    @FindBy(css = "a[id*='InsertButton']")
    public WebElement processButton;
    @FindBy(css = "select[id*='ddlProduct']")
    public WebElement productDropdown;
    @FindBy(css = "input[id*='txtQuantity']")
    public WebElement quantityInput;





}

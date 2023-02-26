package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SmartBearMainPage {
    public SmartBearMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



}

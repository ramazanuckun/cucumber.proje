package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Home01 {

    public Home01(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
@FindBy (xpath = "//*[.='Add Element']")
    public WebElement adElement;
    @FindBy(xpath = "//*[.='Delete']")

    public WebElement delete;

@FindBy(xpath = "//*[.='Add/Remove Elements']")
    public WebElement removeAddYazisi;



}

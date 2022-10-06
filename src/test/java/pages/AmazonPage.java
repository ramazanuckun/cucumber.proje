package pages;


import utilities.Driver;

public class AmazonPage {
    public AmazonPage() { //constructor olusturup public yapmamiz gerekir

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (id="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement searchResultWE;

}

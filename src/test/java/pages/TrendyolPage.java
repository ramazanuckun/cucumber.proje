package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendyolPage {

    public TrendyolPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


}

package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Home01;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class HerokuStepDefs {
Home01 home01=new Home01();
    @Given("User goes to direct {string}")
    public void user_goes_to_direct(String Url) {

        Driver.getDriver().get(Url);

    }
    @When("Add Element butona basin")
    public void add_element_butona_basin() {
     home01.adElement.click();

    }
    @When("Delete butonu gorunur oluncaya kadar bekleyin")
    public void delete_butonu_gorunur_oluncaya_kadar_bekleyin() {
        ReusableMethods reusableMethods=new ReusableMethods();

        WebDriverWait webDriverWait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    }
    @Then("Delete butonunun gorunur oldugunu test edin")
    public void delete_butonunun_gorunur_oldugunu_test_edin() {
        Assert.assertTrue(home01.delete.isDisplayed());

    }
    @Then("Delete butonuna basarak butonu silinn")
    public void delete_butonuna_basarak_butonu_silinn() {
        home01.delete.click();

    }
    @Then("AddRemove Elements yazisinin gorunurlugunu test eder")
    public void add_remove_elements_yazisinin_gorunurlugunu_test_eder() {
Assert.assertTrue(home01.removeAddYazisi.isDisplayed());
    }
    @Then("User waits {int} second")
    public void user_waits_second(Integer int1) {

    }
    @Then("Delete butonunun gorunmedigini test edinn")
    public void delete_butonunun_gorunmedigini_test_edinn() {
Assert.assertFalse(home01.delete.isDisplayed());
    }
    @Then("User close browser")
    public void user_close_browser() {

Driver.closeDriver();
    }}

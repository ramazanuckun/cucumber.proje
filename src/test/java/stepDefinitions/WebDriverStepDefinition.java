package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebDriverUniversityPage;
import utilities.Driver;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WebDriverStepDefinition {

    WebDriverUniversityPage webDriverUniversityPage = new WebDriverUniversityPage();
    @Then("kullanici Login Portala kadar asagi tiklar")
    public void kullaniciLoginPortalaKadarAsagiTiklar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).perform();
    }

    @And("kullanici Login Portala tiklar")
    public void kullaniciLoginPortalaTiklar() {
        webDriverUniversityPage.login.click();
    }

    @And("kullanici diger windowa gecer")
    public void kullaniciDigerWindowaGecer() {
        ArrayList<String> windows = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windows.get(1));
    }

    @And("kullanici {string} kutusuna bilgileri girer")
    public void kullaniciKutusunaBilgileriGirer(String username) {
        webDriverUniversityPage.username.sendKeys(username);

    }

    @And("kullanici {string} bolumune bilgileri girer")
    public void kullaniciBolumuneBilgileriGirer(String password) {
        webDriverUniversityPage.password.sendKeys(password);
    }

    @And("kullanici login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
    }

    @And("kullanici Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void kullaniciPopupTaCikanYazininValidationFailedOldugunuTestEder() {
    }

    @And("kullanici Ok diyerek Popup'i kapatir")
    public void kullaniciOkDiyerekPopupIKapatir() {
    }

    @And("kullanici ilk sayfaya geri doner")
    public void kullaniciIlkSayfayaGeriDoner() {
    }

    @And("kullanici ilk sayfaya donuldugunu test eder")
    public void kullaniciIlkSayfayaDonuldugunuTestEder() {
    }
}

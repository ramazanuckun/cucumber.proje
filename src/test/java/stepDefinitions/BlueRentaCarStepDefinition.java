package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentaCarStepDefinition {
    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String searchUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(searchUrl));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {

    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
    }
}

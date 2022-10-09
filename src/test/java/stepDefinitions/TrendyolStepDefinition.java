package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class TrendyolStepDefinition {
    @Given("kullanici google a gider")
    public void kullaniciGoogleAGider() {
        Driver.getDriver().get(ConfigReader.getProperty("googleURL"));
    }

    @Then("kullanici google da Trendyol u aratir")
    public void kullaniciGoogleDaTrendyolUAratir() {
    }

    @Then("kullanici Trendyol a girer")
    public void kullaniciTrendyolAGirer() {
    }

    @Then("kullanici Trendyol da makas aratir")
    public void kullaniciTrendyolDaMakasAratir() {
    }

    @And("kullanici toplam makas sayisini alir")
    public void kullaniciToplamMakasSayisiniAlir() {
    }

    @Then("kullanici google da Morhipo u aratir")
    public void kullaniciGoogleDaMorhipoUAratir() {
    }

    @Then("kullanici Morhipo ya girer")
    public void kullaniciMorhipoYaGirer() {
    }

    @Then("kullanici Morhipo da makas aratir")
    public void kullaniciMorhipoDaMakasAratir() {
    }

    @Given("kullanici makas sayisi fazla olan sayfayi kapatir")
    public void kullaniciMakasSayisiFazlaOlanSayfayiKapatir() {
    }

    @Then("kullanici makas sayisi az olan sayfayi kapatir")
    public void kullaniciMakasSayisiAzOlanSayfayiKapatir() {
    }
}

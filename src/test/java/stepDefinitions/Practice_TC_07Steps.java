package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class Practice_TC_07Steps {
    @Given("Tarayiciyi baslatarak {string} url'sine gidin")
    public void tarayiciyiBaslatarakUrlSineGidin(String searchUrl) {
        Driver.getDriver().get(searchUrl);

    }

    @Then("Ana sayfanin basariyla gorunur oldugunu dogrulayin")
    public void anaSayfaninBasariylaGorunurOldugunuDogrulayin() {
        String homeUrl = "https://automationexercise.com/";
        Assert.assertEquals(homeUrl, "http://automationexercise.com/");
    }

    @Then("Test Case buttonu na tiklayin")
    public void testCaseButtonuNaTiklayin() {
    }

    @And("Kullanicinin test case sayfasina basariyla yönlendirildigini dogrulayin")
    public void kullanicininTestCaseSayfasinaBasariylaYönlendirildiginiDogrulayin() {
    }

    @And("Ilgili sayfanin ekran goruntusunu alin")
    public void ılgiliSayfaninEkranGoruntusunuAlin() {
    }
}

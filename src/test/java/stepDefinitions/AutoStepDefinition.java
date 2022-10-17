package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutomationPracticePage;
import utilities.ConfigReader;

public class AutoStepDefinition {

    Faker faker = new Faker();

    AutomationPracticePage autoPracticePage = new AutomationPracticePage();
    @And("user sign in linkine tiklar")
    public void userSignInLinkineTiklar() {
        autoPracticePage.loginLink.click();
    }

    @And("user Create and account bölümüne email adresi girer")
    public void userCreateAndAccountBölümüneEmailAdresiGirer() {
        autoPracticePage.emailCreateLink.sendKeys(ConfigReader.getProperty("catkatzegato"));
    }

    @And("Create an Account butonuna basar")
    public void createAnAccountButonunaBasar() {
        autoPracticePage.createAccountButton.click();
    }

    @And("kullanici kisisel bilgilerini ve iletisim bilgilerini girer")
    public void kullaniciKisiselBilgileriniVeIletisimBilgileriniGirer() {
        autoPracticePage.genderButton.click();
        autoPracticePage.firstName1Box.sendKeys(faker.name().firstName());
        autoPracticePage.lastName1Box.sendKeys(faker.name().lastName());
        autoPracticePage.passwordBox.sendKeys(faker.internet().password());
        autoPracticePage.days.sendKeys("5");
        autoPracticePage.months.sendKeys("10");
        autoPracticePage.years.sendKeys("1980");
        autoPracticePage.addressBox.sendKeys(faker.address().streetAddress());
        autoPracticePage.cityBox.sendKeys(faker.address().city());
        autoPracticePage.idStateBox.sendKeys(faker.address().state());
        autoPracticePage.postcodeBox.sendKeys(faker.address().zipCode());
        autoPracticePage.phoneMobileBox.sendKeys(faker.phoneNumber().cellPhone());
        autoPracticePage.registerButton.click();
    }

    @And("kullanici Register butonuna basar")
    public void kullaniciRegisterButonunaBasar() {
    }

    @Then("kullanicinin hesap olusturuldugunu dogrulayin")
    public void kullanicininHesapOlusturuldugunuDogrulayin() {
    }

    @Then("hesap olustugunu dogrulayin")
    public void hesapOlustugunuDogrulayin() {
    }
}

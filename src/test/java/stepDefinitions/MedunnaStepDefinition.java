package stepDefinitions;

import io.cucumber.java.en.*;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.accessibility.AccessibleTable;

public class MedunnaStepDefinition {
MedunnaPage medunnaPage=new MedunnaPage();
Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici {string} sayfasina giderrr")
    public void kullanici_sayfasina_giderrr(String url) {

  Driver.getDriver().get(url);


    }
    @When("login olmak icin signin e tiklarr")
    public void login_olmak_icin_signin_e_tiklarr() {

        medunnaPage.signInGiris.click();
        medunnaPage.signIn.click();
    }
    @When("username icin {string} kullanici adini gonderirr")
    public void username_icin_kullanici_adini_gonderirr(String username) {
medunnaPage.username.sendKeys(username);
    }
    @When("password icin {string} parolasini gonderirr")
    public void password_icin_parolasini_gonderirr(String password) {
medunnaPage.password.sendKeys(password);
    }
    @When("signine tiklarr")
    public void signine_tiklarr() {
      medunnaPage.sinInOnay.click();

    }

    @And("Kullanici Items&Titles ikonunu tiklar")
    public void kullaniciItemsTitlesIkonunuTiklar() {
        medunnaPage.itemTitlesIkonu.click();
    }


    @And("Kullanici Room secenegini tiklar")
    public void kullaniciRoomSeceneginiTiklar() {
        medunnaPage.room.click();
    }


    

    @And("Kullanici Create a new  Room yazisini tiklar")
    public void kullaniciCreateANewRoomYazisiniTiklar() {
        ReusableMethods.waitForClickablility(medunnaPage.createNewRoom,5) ;
     //   actions.moveToElement(medunnaPage.createNewRoom).perform();
        medunnaPage.createNewRoom.click();
    }

    @And("Kullanici {string}yazisini gorur")
    public void kullaniciYazisiniGorur(String arg0) {

    medunnaPage.createOrEditAroom.isDisplayed();
       // actions.sendKeys(Keys.TAB).sendKeys("456789").perform();
    }

    @And("kullanici {string}secebilir")
    public void kullaniciSecebilir(String roomTypee) {
        WebElement roomTypeSenarioOutline=  medunnaPage.roomTypeSelect;
Select select=new Select(roomTypeSenarioOutline);
select.selectByValue(roomTypee);

    }



    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSure) {

        try {
            Thread.sleep(istenenSure*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }




    @And("kullanici roomNumber dolduru")
    public void kullaniciRoomNumberDolduru() {
 medunnaPage.roomNumber.sendKeys("456");

    }

    @And("kullanici room type secebilir")
    public void kullaniciRoomTypeSecebilir() {
/*WebElement roomType= medunnaPage.roomTypeSelect;
Select select=new Select(roomType);
select.selectByIndex(2);

 */
     actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys("DELUXE",Keys.ENTER).perform();




    }

    @And("kulllanici status secenegini doldurabilir")
    public void kulllaniciStatusSeceneginiDoldurabilir() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();

    }

    @And("fiyat ekleyebilir ve bos birakamaz")
    public void fiyatEkleyebilirVeBosBirakamaz() {
        actions.sendKeys(Keys.TAB).sendKeys("45689").perform();

    }

    @And("tarih gun,ay ,yil seklinde olmali ve bos birakamaz")
    public void tarihGunAyYilSeklindeOlmaliVeBosBirakamaz() {

                 actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("22").sendKeys(Keys.TAB).sendKeys("11").sendKeys(Keys.TAB)
                .sendKeys("2022").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @And("roomNumber bos biralirsa This field is required.yazisin gorur")
    public void roomnumberBosBiralirsaThisFieldIsRequiredYazisinGorur() {
        medunnaPage.roomTypeGirilmedi.isDisplayed();

    }

    @And("kullanici roomNumber doldurmadaz")
    public void kullaniciRoomNumberDoldurmadaz() {
        medunnaPage.roomNumber.click();
    }

    @And("tarih gun,ay ,yil seklinde olmali ve gecmis tarih girer")
    public void tarihGunAyYilSeklindeOlmaliVeGecmisTarihGirer() {

        ReusableMethods.waitForClickablility(medunnaPage.roomNumber,5);
        medunnaPage.roomNumber.sendKeys("5578");
        WebElement roomTypeSenarioOutline=  medunnaPage.roomTypeSelect;
        Select select=new Select(roomTypeSenarioOutline);
        select.selectByValue("DELUXE");
        medunnaPage.satus.click();
        ReusableMethods.waitForClickablility(medunnaPage.price,5);
        ReusableMethods.waitForClickablility(medunnaPage.creadData,5);
        actions.sendKeys(Keys.TAB).sendKeys("123").sendKeys(Keys.TAB).sendKeys(Keys.TAB)
        .sendKeys("30").sendKeys(Keys.TAB).sendKeys("10").sendKeys(Keys.TAB)
        .sendKeys("2022").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

//medunnaPage.creadData.sendKeys("12/12/2022");
//ReusableMethods.jsclick(medunnaPage.saveKaydet);
//medunnaPage.saveKaydet.click();





    }

    @And("kullanici yeni oda olusturuldu yazisini gorur")
    public void kullaniciYeniOdaOlusturulduYazisiniGorur() {
        //ReusableMethods.waitForClickablility(medunnaPage.yeniOdaOlusturlduYazisi,5);
      //  Assert.assertTrue(medunnaPage.yeniOdaOlusturlduYazisi.isDisplayed());

    }

    @And("kullanici ayni tip odalari secebilir")
    public void kullaniciAyniTipOdalariSecebilir() {
ReusableMethods.waitForClickablility(medunnaPage.roomTypeTusu,5);
        medunnaPage.roomTypeTusu.click();



    }

    @And("kullanici oda duzenler ve gunceller")
    public void kullaniciOdaDuzenlerVeGunceller() {

        medunnaPage.editTusu.click();
        ReusableMethods.waitForClickablility(medunnaPage.price,5);
        medunnaPage.price.sendKeys(Keys.CLEAR);
        medunnaPage.price.sendKeys("100");
        ReusableMethods.waitForClickablility(medunnaPage.saveKaydet,5);
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",medunnaPage.saveKaydet);
        jse.executeScript("arguments[0].click();",medunnaPage.saveKaydet);


    }

    @Given("ortak adimlar")
    public void ortakAdimlar() {



    }

    @And("kullanici delete tusuna basarak oda silebilir")
    public void kullaniciDeleteTusunaBasarakOdaSilebilir() {

        ReusableMethods.waitForClickablility(medunnaPage.deleteTusu,5);
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",medunnaPage.deleteTusu);
        jse.executeScript("arguments[0].click();",medunnaPage.deleteTusu);



    }

    @And("kullanici silme icin Delete tusuna onay verir")
    public void kullaniciSilmeIcinDeleteTusunaOnayVerir() {

        ReusableMethods.waitForClickablility(medunnaPage.deleteOnay,5);
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
         jse.executeScript("arguments[0].scrollIntoView(true);",medunnaPage.deleteOnay);
       // jse.executeScript("arguments[0].click();",medunnaPage.deleteOnay);
        medunnaPage.deleteOnay.click();
    }

    @And("kullanici room type  olarak TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE secebilir")
    public void kullaniciRoomTypeOlarakTWINDELUXEPREMIUM_DELUXESUITVeDAYCARESecebilir() {



    }

    @And("kullanici test-items bolumune tiklar")
    public void kullaniciTestItemsBolumuneTiklar() {
        ReusableMethods.waitForClickablility(medunnaPage.testItems,5);
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",medunnaPage.testItems);
        medunnaPage.testItems.click();
        ;
//medunnaPage.crateaTestItemsOlustur.click();

    }

    @And("Kullanici create a test yazisina tiklayarak yeni birtest ogesi olustrma bolumune yonlendirilir")
    public void kullaniciCreateATestYazisinaTiklayarakYeniBirtestOgesiOlustrmaBolumuneYonlendirilir() {
        ReusableMethods.waitForClickablility(medunnaPage.crateaTestItemsOlustur,5);
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",medunnaPage.crateaTestItemsOlustur);
        medunnaPage.crateaTestItemsOlustur.click();
    }

    @And("kullanici Create or edit a Test Item yazisini gorur")
    public void kullaniciCreateOrEditATestItemYazisiniGorur() {
        medunnaPage.CreateoreditaTestItemYazisiGorunurlugu.isDisplayed();


    }


    @And("kullanici name,Description,price,default min value,default max value,cread date degerlerini girer")
    public void kullaniciNameDescriptionPriceDefaultMinValueDefaultMaxValueCreadDateDegerleriniGirer() {
        ReusableMethods.waitForClickablility(medunnaPage.nameTestItems,5);
      medunnaPage.nameTestItems.sendKeys("ramazan");
      medunnaPage.descrictionTestItems.sendKeys("saglikli yasam");
      medunnaPage.price.sendKeys("800");
      medunnaPage.defaultminValueTestItems.sendKeys("100");
      medunnaPage.defaultmaxValuedescrictionTestItems.sendKeys("200");
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",medunnaPage.creadDataTestItems);
        medunnaPage.creadDataTestItems.sendKeys("22/12/2022");



    }

    @And("kullanici kaydeder")
    public void kullaniciKaydeder() {
        JavascriptExecutor jsee= (JavascriptExecutor) Driver.getDriver();
        jsee.executeScript("arguments[0].scrollIntoView(true);",medunnaPage.saveTestItems);
        medunnaPage.saveTestItems.click();


    }

    @And("kullanici name girer,")
    public void kullaniciNameGirer() throws InterruptedException {
        ReusableMethods.waitForClickablility(medunnaPage.nameTestItems,5);
        medunnaPage.nameTestItems.sendKeys("aamazan hasta");
actions.sendKeys(Keys.TAB).sendKeys("ama yasamak istiyor")
        .sendKeys(Keys.TAB).sendKeys("1234")
        .sendKeys(Keys.TAB).sendKeys("100")
        .sendKeys(Keys.TAB).sendKeys("200").
        sendKeys(Keys.TAB).sendKeys("24")
        .sendKeys(Keys.TAB).sendKeys("12")
        .sendKeys(Keys.TAB).sendKeys("2022")
        .perform();
Thread.sleep(2);
        JavascriptExecutor jsee= (JavascriptExecutor) Driver.getDriver();
        jsee.executeScript("arguments[0].scrollIntoView(true);",medunnaPage.saveTestItems);
        jsee.executeScript("arguments[0].click();",medunnaPage.saveTestItems);
medunnaPage.saveTestItems.click();



    }


    @And("accc")
    public void accc() {
   //   medunnaPage.descrictionTestItems.sendKeys("rrr");
    }
}


////div[contains(text(),'Authentication information not correct.')]
////div[text()='Authentication information not correct.']
/*
Kayan yazıyı yakalama 1.yol -->  //*[contains(text(), 'User found with search SSN')]")
Kayan yazıyı yakalama 2.yol --> //*[starts-with(text(), 'A new Staff is created with idendifier')]")
 */
/*

and  ile
//a[@href="#appointment" and @class="btn-get-started scrollto"]
 */
/*
Register Kısmı
Mavi Çerçeve
//input[@class='is-touched is-dirty av-valid form-control']
Kırmızı çerçeve
//input[@class='is-touched is-dirty av-invalid is-invalid form-control']
 */

/*
ssn
[name=roomNumber]
li.nav-item>a[href="/doctors"]
.nav-item>a[href="/service"]

li.nav-item>a[href^="/ab"]





10:59
li.nav-item>a[href$="ct"]

li#entity-menu>div>a[href^='/st']sapka isareteti baslangic demek items menuyu aldik
li#entity-menu :nth-child(2) :first-child
 */
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPage {

    public MedunnaPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signInGiris;
@FindBy(xpath = "//*[.='Sign in']")
    public WebElement signIn;
@FindBy(xpath = "//input[@name='username']")
    public WebElement username;
@FindBy(xpath = "//input[@name='password']")
    public WebElement password;
@FindBy(xpath = "(//*[.='Sign in'])[4]")
    public WebElement sinInOnay;
@FindBy(xpath = "(//*[.='Items&Titles'])[2]")
    public WebElement itemTitlesIkonu;
@FindBy(xpath = "(//*[.='Room'])[1]")
    public WebElement room;
@FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement createNewRoom;

@FindBy (xpath = "(//*[.='Create or edit a Room'])[1]")
    public WebElement createOrEditAroom;

@FindBy(xpath = "//*[.='Room Number']")
public WebElement roomNumberBaslangic;
@FindBy(xpath = "//*[@id='room-roomNumber']")
public WebElement roomNumber;
@FindBy(xpath = "//*[@id='room-roomType']")
    public WebElement roomTypeSelect;
@FindBy(xpath = "(//*[.='This field is required.'])[2]")
    public WebElement roomTypeGirilmedi;
    @FindBy(xpath = "//*[@id='createdDateLabel']")
    public WebElement creadData;
    @FindBy(xpath = "//*[contains(text(),'A new Room is created with identifier']")
    public WebElement yeniOdaOlusturlduYazisi;
@FindBy(xpath = "//*[@id='room-status']")
    public WebElement satus;
@FindBy(xpath = "//*[@id='room-price']")
    public WebElement price;

@FindBy(xpath = "//button[starts-with(@id,'save')]")
    public WebElement saveKaydet;

@FindBy(xpath = "//thead//tr[1]")
    public WebElement roomTypeTusu;

@FindBy(xpath = "(//*[.='Edit'])[12]")
    public WebElement editTusu;

@FindBy(xpath = "(//*[.='Delete'])[1]")
    public WebElement deleteTusu;
@FindBy(xpath = "//button[@id='jhi-confirm-delete-room']")
    public WebElement deleteOnay;

////////////////////////////////////////
    @FindBy(xpath = "(//*[.='Test Item'])[1]")
    public WebElement testItems;

    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement crateaTestItemsOlustur;

    @FindBy(xpath = "(//*[.='Create or edit a Test Item'])[4]")
    public WebElement CreateoreditaTestItemYazisiGorunurlugu;

    @FindBy(xpath = "//input[@id='c-test-item-name']")
    public WebElement nameTestItems;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement saveTestItems;

    @FindBy(xpath = "(//*[@class='is-touched is-pristine av-valid form-control'])[1]")
    public WebElement descrictionTestItems;
    @FindBy(xpath = "(//*[@class='is-touched is-pristine av-valid form-control'])[2]")
    public WebElement defaultminValueTestItems;

    @FindBy(xpath = "(//*[@class='is-touched is-pristine av-valid form-control'])[3]")
    public WebElement defaultmaxValuedescrictionTestItems;

    @FindBy(xpath = "(//*[@class='is-touched is-pristine av-invalid is-invalid form-control'])[2]")
    public WebElement priceTestItems;

    @FindBy(xpath = "//*[@class='form-control is-touched is-pristine av-valid form-control']")
    public WebElement creadDataTestItems;


}

package Stage.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomProducts {

    WebDriver driver;
    WebDriverWait wait;
    public CustomProducts(WebDriver driver) {
        //`driver` you pass when you create an instance of `CustomProducts` is saved and used later for methods like `switchToIFrame()`.
        this.driver = driver;
        this.wait = new WebDriverWait(driver,45);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "cpb")
    @CacheLookup
    WebElement iFrame;

    @FindBy(xpath = "//*[@id=\"product-builder\"]/div/div/div/div[2]/div/div/ul/li[1]/div/div[2]/div[2]")
    @CacheLookup
    WebElement editButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/h2/div/button")
    @CacheLookup
    WebElement createNewButton;

    @FindBy(id = "productTitle")
    @CacheLookup
    WebElement productTitle;

    @FindBy(id = "productDescription")
    @CacheLookup
    WebElement productDescription;

    @FindBy(id = "productBasePrice")
    @CacheLookup
    WebElement productBasePrice;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/div/div/div[2]/div[3]/div/input")
    @CacheLookup
    WebElement uploadField;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/div/div/div[3]/div/div[1]/button/span/span")
    @CacheLookup
    WebElement createButton;

    @FindBy(xpath = "//*[@id=\"product-builder\"]/div[1]/div/div/div[1]/div[2]/button[1]")
    @CacheLookup
    WebElement adminMode;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/div/ul/li[82]/div/div[2]/div[2]/a")
    @CacheLookup
    WebElement editSweatshirtProduct;


    public void switchToIFrame() {
        driver.switchTo().frame(iFrame);
    }

    public void clickEditButton() {
        wait.until(ExpectedConditions.visibilityOf(editButton));
        editButton.click();
    }
    public void clickCreateNewButton() {
        wait.until(ExpectedConditions.visibilityOf(createNewButton));
        createNewButton.click();
    }

    public void enterProductTitle(String productTitle) {
        this.productTitle.sendKeys(productTitle);
    }

    public void enterProductDescription(String productDescription) {
        this.productDescription.sendKeys(productDescription);
    }

    public void enterProductBasePrice(String productBasePrice) {
        this.productBasePrice.sendKeys(productBasePrice);
    }

    public void uploadImage() {
        String filePath = "/Users/ilonakutuzova/IdeaProjects/CPB/src/test/java/Stage/testData/sweatshirt_image.jpg";
        uploadField.sendKeys(filePath);
    }

    public void clickCreateButton() {
//        createButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", createButton);
    }

    public void clickAdminMode() {
        wait.until(ExpectedConditions.elementToBeClickable(adminMode));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", adminMode);
    }

    public void clickEditSweatshirtProduct() {
        wait.until(ExpectedConditions.visibilityOf(editSweatshirtProduct));
        editSweatshirtProduct.click();
    }
}

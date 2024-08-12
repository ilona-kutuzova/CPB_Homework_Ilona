package Stage.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AdminMode {
    WebDriver driver;

    WebDriverWait wait;

    public AdminMode(WebDriver driver) {
        //`driver` you pass when you create an instance of `CustomProducts` is saved and used later for methods like `switchToIFrame()`.
        this.driver = driver;
        this.wait = new WebDriverWait(driver,60);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]")
    @CacheLookup
    WebElement addNewCustomOption;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]")
    @CacheLookup
    WebElement addFirstCustomOption;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div[1]/input")
    @CacheLookup
    WebElement customOptionTitle;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div[1]/input")
    @CacheLookup
    WebElement secondCustomOptionTitle;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div[2]/div[1]/div/div[3]/div/div[1]/div[3]/div[1]")
    @CacheLookup
    WebElement inputFieldOption;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div[2]/div[1]/div/div[3]/div/div[1]/div[4]/div[1]")
    @CacheLookup
    WebElement fontSelectorOption;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div[1]/div[2]/button[3]")
    @CacheLookup
    WebElement saveCustomOptionButton;

//    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]")
//    @CacheLookup
//    WebElement addNewCustomOptionButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div[1]/div[2]/button[3]")
    @CacheLookup
    WebElement saveProductButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]")
    @CacheLookup
    WebElement reorderToggle;

    public void clickOnAddNewCustomOption() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewCustomOption));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", addNewCustomOption);
    }

    public void clickOnAddFirstCustomOption() {
        wait.until(ExpectedConditions.elementToBeClickable(addFirstCustomOption));
        addFirstCustomOption.click();
    }

    public void enterCustomOptionTitle(String optionTitle) {
        wait.until(ExpectedConditions.elementToBeClickable(customOptionTitle));
        customOptionTitle.sendKeys(optionTitle);
    }

    public void clickOnInputFieldOption() {
        wait.until(ExpectedConditions.elementToBeClickable(inputFieldOption));
        inputFieldOption.click();
    }

    public void clickOnSaveCustomOptionButton() {
        wait.until(ExpectedConditions.elementToBeClickable(saveCustomOptionButton));
        saveCustomOptionButton.click();
    }

    public void clickOnAddNewCustomOptionButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewCustomOption));
        addNewCustomOption.click();
    }

    public void enterSecondCustomOptionTitle(String optionTitle) {
        wait.until(ExpectedConditions.elementToBeClickable(secondCustomOptionTitle));
        secondCustomOptionTitle.sendKeys(optionTitle);
    }

    public void clickOnFontSelectorOption() {
        wait.until(ExpectedConditions.elementToBeClickable(fontSelectorOption));
        fontSelectorOption.click();
    }

    public void clickOnSaveProductButton() {
        wait.until(ExpectedConditions.elementToBeClickable(saveProductButton));
        saveProductButton.click();
    }

    public void clickReorderToggle() {
        wait.until(ExpectedConditions.elementToBeClickable(reorderToggle));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", reorderToggle);
    }
}

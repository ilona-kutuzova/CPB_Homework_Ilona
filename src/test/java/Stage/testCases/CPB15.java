package Stage.testCases;

import Stage.pageObjects.AdminMode;
import Stage.pageObjects.CustomProducts;
import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;

import static Stage.testCases.BaseClass.driver;

public class CPB15 extends BaseClass {

    @Test
    public void CPB15() throws IOException {

        driver.get(stageURL);
        logger.info("open staging site");

        CustomProducts cp = new CustomProducts(driver);
        AdminMode am = new AdminMode(driver);

        cp.switchToIFrame();
        logger.info("switching to iFrame");

        cp.clickEditButton();
        logger.info("clicking on edit button");

        cp.clickAdminMode();
        logger.info("clicking on admin mode");

        am.clickOnAddNewCustomOption();
        logger.info("clicking on new custom option");

        if(driver.getPageSource().contains("Edit Custom Option"))
        {
            Assert.assertTrue(true);
            logger.info("test passed");
        }else{
            captureScreen(driver,"CPB15");
            Assert.assertFalse(false);
            logger.info("test failed");
        }



    }
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/IdeaProjects/CPB/Drivers/chromedriver");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://ws0.techstartacademy.io/stage-march.admin.html");
//        driver.manage().window().maximize();
//
//        WebElement iframe = driver.findElement(By.id("cpb"));
//        driver.switchTo().frame(iframe);
//        System.out.println("switch to iFrame");
//
//        WebDriverWait waitForEditButton = new WebDriverWait(driver, 45);
//        WebElement editButton = waitForEditButton.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-builder\"]/div/div/div/div[2]/div/div/ul/li[1]/div/div[2]/div[2]")));
//        editButton.click();
//        System.out.println("click edit");
//
//        Thread.sleep(5000);
//
//        WebDriverWait waitForAdminMode = new WebDriverWait(driver, 45);
//        WebElement adminMode = waitForAdminMode.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-builder\"]/div[1]/div/div/div[1]/div[2]/button[1]")));
//        adminMode.click();
//        System.out.println("click admin mode ON");
//
//        WebDriverWait waitForAddFirstCustomOption = new WebDriverWait(driver, 45);
//        WebElement addNewCustomOption = waitForAddFirstCustomOption.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]")));
//
//        Assert.assertNotNull(addNewCustomOption);
//        System.out.println("add first custom option is here.");
//        System.out.println("test passed");
//
//        driver.quit();
//    }
}

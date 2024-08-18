package Stage.testCases;

import Stage.pageObjects.AdminMode;
import Stage.pageObjects.CustomProducts;
import org.testng.annotations.Test;

public class CPB5 extends BaseClass {

    @Test
    public void CPB5() {

        driver.get(stageURL);
        logger.info("open staging site");

        CustomProducts cp = new CustomProducts(driver);
        AdminMode am = new AdminMode(driver);

        cp.switchToIFrame();
        logger.info("switching to iFrame");

        cp.clickCreateNewButton();
        logger.info("clicking on create new button");

        cp.enterProductTitle("Sweatshirt");
        logger.info("entering product title");

        cp.enterProductDescription("100% organic cotton with a custom print");
        logger.info("entering product description");

        cp.enterProductBasePrice("59.99");
        logger.info("entering product price base");

        cp.uploadImage();
        logger.info("uploading image");

        cp.clickCreateButton();
        logger.info("clicking on create button");

        cp.clickAdminMode();
        logger.info("clicking on admin mode");

        am.clickOnAddFirstCustomOption();
        logger.info("clicking on add first custom option");

        am.enterCustomOptionTitle("Please enter the text to print on your sweatshirt");
        logger.info("entering the first custom option title");

        am.clickOnInputFieldOption();
        logger.info("clicking on input field option");

        am.clickOnSaveCustomOptionButton();
        logger.info("clicking on save custom option button");

        am.clickOnAddNewCustomOptionButton();
        logger.info("clicking on add new custom option button");

        am.enterSecondCustomOptionTitle("Please choose the font");
        logger.info("entering the custom option title");

        am.clickOnFontSelectorOption();
        logger.info("clicking on font selector option");

        am.clickOnSaveCustomOptionButton();
        logger.info("clicking on save custom option button for the second custom option");

        am.clickOnSaveProductButton();
        logger.info("saving the product");

        try {
            am.clickPreviewButton();
            logger.info("clicking on preview button worked -> product was created successfully");
        } catch (Exception e) {
            logger.info("clicking on preview button failed -> product was not created");
        }



    }



}

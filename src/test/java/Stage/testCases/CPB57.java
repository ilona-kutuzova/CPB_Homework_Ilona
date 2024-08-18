package Stage.testCases;

import Stage.pageObjects.AdminMode;
import Stage.pageObjects.CustomProducts;
import org.testng.annotations.Test;

import java.io.IOException;

public class CPB57 extends BaseClass {

    @Test
    public void CPB57() throws IOException {

        driver.get(stageURL);
        logger.info("open staging site");

        CustomProducts cp = new CustomProducts(driver);
        AdminMode am = new AdminMode(driver);

        cp.switchToIFrame();
        logger.info("switching to iFrame");

        cp.clickEditSweatshirtProduct();
        logger.info("choosing edit sweatshirt product");

        cp.clickAdminMode();
        logger.info("clicking on admin mode");

        am.clickReorderToggle();
        logger.info("clicking on reorder toggle");
        captureScreen(driver, "CPB57 - reorder mode on");

        am.clickReorderToggle();
        logger.info("clicking on reorder toggle");
        captureScreen(driver, "CPB57 - reorder mode off");




    }


}

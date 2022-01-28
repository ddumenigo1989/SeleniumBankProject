package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BasePage;
import pageObjects.LoginPage;


public class TC_LoginTest_001 extends BasePage {

    @Test
    public void loginTest(){
        driver.get(baseUrl);


        logger.info("URL is opened");

        LoginPage lp = new LoginPage(driver);
        lp.setTxtUserName(userName);
        lp.setTxtPassword(pwd);
        lp.clickLogin();

        if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
            Assert.assertTrue(true);
            logger.info("Loggin test passed");
        }else{
            Assert.fail();
            logger.info("Loggin test failed");
        }


    }


}

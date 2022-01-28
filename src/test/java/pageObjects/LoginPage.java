package pageObjects;

import org.bouncycastle.jcajce.provider.symmetric.ARC4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {


    WebDriver ldriver;

    public LoginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

    @FindBy(how = How.XPATH, using = "//*[@name = 'uid']")
    @CacheLookup
    WebElement txtUserName;

    @FindBy(how = How.XPATH, using = "//*[@name = 'password']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'My Account')]")
    @CacheLookup
    WebElement btnLogin;


    public void setTxtUserName(String userName) { //username mngr373709
        txtUserName.sendKeys(userName);
    }

    public void setTxtPassword(String pwd) {    //password dYsepuz
        txtPassword.sendKeys(pwd);
    }

    public void setBtnLogin(WebElement btnLogin) {
        this.btnLogin = btnLogin;
    }

    public void clickLogin() {
        btnLogin.click();
    }
}

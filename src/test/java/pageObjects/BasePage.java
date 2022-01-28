package pageObjects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.ReadConfig;

import java.util.concurrent.TimeUnit;


public class BasePage extends ReadConfig {

    ReadConfig readConfig = new ReadConfig();
    public String baseUrl = readConfig.getBaseUrl();
    public String userName = readConfig.getUserName();
    public String pwd = readConfig.getPassword();
    public static WebDriver driver;

    public static Logger logger;


    @Parameters("browser")
    @BeforeClass

    public void setup(String br) {

        if ("chrome".equals(br)) {
            System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
            }


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        logger = Logger.getLogger("OpenCart");
        PropertyConfigurator.configure("Log4j.properties");


    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}

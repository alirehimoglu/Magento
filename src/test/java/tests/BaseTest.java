package tests;



import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.ConfigReader;
import utils.Driver;
import utils.UiUtil;
import utils.XpathUtil;

public class BaseTest {


    static Logger log = Logger.getLogger(BaseTest.class);


    @BeforeClass
    public void setUp() {
        log.info("Starting Test Automation");
        log.info("Browser type ::"+ ConfigReader.readFromConfig("browser"));
        String URL=ConfigReader.readFromConfig("url");
        log.info("Environment ::"+URL);
        Driver.getDriver().get(URL);
        log.info("Starting browser");
        UiUtil.getElement(XpathUtil.usernameField).sendKeys(ConfigReader.readFromConfig("customerusername"));
        UiUtil.getElement(XpathUtil.passwordField).sendKeys(ConfigReader.readFromConfig("customerpassword"));
        UiUtil.clickElement(XpathUtil.loginButton);
        log.info("logging into app");
    }


    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
        log.info("browser closed");
    }


}





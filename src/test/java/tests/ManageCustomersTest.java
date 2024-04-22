package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.ConfigReader;
import utility.FunctionLibrary;
import utility.XpathUtility;

public class ManageCustomersTest {

    ChromeDriver driver;
    FunctionLibrary functionLibrary;
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        functionLibrary = new FunctionLibrary(driver);
        driver.manage().window().maximize();
        driver.get(ConfigReader.readFromConfig("url"));
    }

    @Test
    public void login(){
        WebElement username = driver.findElement(By.xpath(XpathUtility.usernameField));
        functionLibrary.waitForElementPresent(username);
        username.sendKeys(ConfigReader.readFromConfig("customerusername"));
        WebElement password = driver.findElement(By.xpath(XpathUtility.passwordField));
        functionLibrary.waitForElementPresent(password);
        password.sendKeys(ConfigReader.readFromConfig("customerpassword"));
        WebElement login = driver.findElement(By.xpath(XpathUtility.loginButton));
        functionLibrary.waitForElementPresent(login);
        login.click();
        functionLibrary.wait_(5);
    }

    @Test(dependsOnMethods = "login")
    public void manageCustomersTest(){
        WebElement customers = driver.findElement(By.xpath(XpathUtility.customersTab));
        functionLibrary.waitForElementPresent(customers);
        functionLibrary.moveToElement(customers);
        functionLibrary.wait_(3);
        WebElement manageCustomers = driver.findElement(By.xpath(XpathUtility.manageCustomerLink));
        functionLibrary.waitForElementPresent(manageCustomers);
        manageCustomers.click();
        functionLibrary.wait_(5);
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}

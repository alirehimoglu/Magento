package utils;

import net.datafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.TakesScreenshot;
import java.util.List;
import java.util.Random;

public class UiUtil {
    Actions actions;
    Faker faker;
    public static WebElement getElement(String locator ){
        return Driver.getDriver().findElement(By.xpath(locator));
    }

    public static void clickElement (String locator ){
        getElement(locator).click();
    }

    public static void sendKeys(String locator,String text ){

        getElement(locator).sendKeys(text);

    }

    public static String getText(String locator ){
        return getElement(locator).getText();
    }

    public static boolean isDisplayed(String locator){
        return getElement(locator).isDisplayed();
    }

    public static WebElement SelectFromDropDown(String locator) {
        WebElement DropDown = getElement(locator);
        Select select = new Select(DropDown);
        List<WebElement> options = select.getOptions();

        return DropDown;
    }
    public static void switchToFrame(String locator){
        WebElement frame=getElement(locator);
        Driver.getDriver().switchTo().frame(frame);
        //and to switch back:
        Driver.getDriver().switchTo().defaultContent();

    }

    public static void dragAndDrop(String locator1,String locator2){
        WebElement dragElement=getElement(locator1);
        WebElement dropElement=getElement(locator2);
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(dragElement,dropElement).build().perform();
    }
    public static void moveToElementUtil(WebDriver driver, WebElement webElementA , WebElement webElementB){
        Actions actions=new Actions(driver);
        actions.moveToElement(webElementA).moveToElement(webElementB).build().perform();
    }
    public void scrollToElement(WebElement element){
        actions.scrollToElement(element);
    }

    public UiUtil() {
        faker = new Faker();
    }

    public String generateFakeFirstName() {
        String firstName = faker.name().firstName();
        return firstName;
    }

    public String generateFakeLastName() {
        String lastName = faker.name().firstName();
        return lastName;
    }

    public String generateEmail() {
        String email = faker.internet().emailAddress();
        return email;
    }
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void waitForElementPresent(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForAlertPresent(){
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(7));

    }

    public void wait_(int second){
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void takeScreenShot(String fileName, ChromeDriver driver ){
        DateTime dateTime= new DateTime();
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yy-MM-dd-HH-mm");
        String timeStamp= dateTime.toString(formatter);
        fileName= fileName+"_"+timeStamp;
        File imageFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String imageFolder="screenshoots";
        try {
            FileUtils.copyFile(imageFile,new File(imageFolder+File.separator+fileName+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

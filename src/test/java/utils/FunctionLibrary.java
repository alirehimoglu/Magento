package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FunctionLibrary {

    ChromeDriver driver;

    Actions actions;

    public FunctionLibrary(ChromeDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }

    public void waitForElementPresent(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void wait_(int second){
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void moveToElement(WebElement element){
        actions.moveToElement(element).build().perform();
    }

    public void scrollToElement(WebElement element){
        actions.scrollToElement(element);
    }


}

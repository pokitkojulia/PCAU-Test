package pages;

import pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utils.RemoteDriverManager;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class CorporateQuotes {

    private WebDriver driver;

    public CorporateQuotes(WebDriver driver) {
        this.driver = driver;
    }

    public CorporateQuotes openTab() {
        WebElement openQuotesTab = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/ng-component/app-header/mat-toolbar/nav/div/a[4]")));
        openQuotesTab.click();
        return this;
    }

    public CorporateQuotes FilterByStatus() throws InterruptedException {

        WebElement Filter = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-button-toggle-0")));
        Filter.click();

        WebElement Status = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cdk-accordion-child-1\"]/div/div/app-dynamic-form/form/mat-form-field[7]")));
        Status.click();

        WebElement ActionRequired = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-option-4\"]")));
        ActionRequired.click();

        WebElement Search = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cdk-accordion-child-1\"]/div/div/button[2]")));
        Search.click();

        Thread.sleep(15000);

        return this;
    }

        public CorporateQuotes FilterByCompanyName() {


        //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        WebElement Filter1 = (new WebDriverWait(driver, 10))
               .until(ExpectedConditions.elementToBeClickable(By.id("mat-button-toggle-0")));
        Filter1.click();


        WebElement Clear = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cdk-accordion-child-1\"]/div/div/button[1]")));
        Clear.click();

        WebElement CompanyName = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-3\"]")));
        CompanyName.click();
        CompanyName.sendKeys("TestOlga");

        WebElement Search1 = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cdk-accordion-child-1\"]/div/div/button[2]")));
        Search1.click();

        return this;

    }

}

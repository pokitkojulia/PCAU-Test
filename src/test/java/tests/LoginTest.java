package pages;
import org.testng.annotations.BeforeMethod;
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

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import utils.RemoteDriverManager;


public class LoginTest {

    private WebDriver driver;
    private String URL = "http://broker.pcau.qa.cpart.co.il/home";


    @BeforeTest
    public void setupTest (){
        this.driver = new ChromeDriver();

        driver.navigate().to(URL);
    }



    @Test(priority = 1)
    public void LoginTest() {
        LoginPage LoginPage1 = new LoginPage(driver);
        //LoginPage1.setupTest();
        LoginPage1.enterLoginEmail();
        LoginPage1.enterPassword();
        LoginPage1.clickLogin();
        //LoginPage1.teardownTest();
    }


    @Test(priority = 2)
    public void CorporateQuotesByStatus() {
        CorporateQuotes NewTab = new CorporateQuotes(driver);
        NewTab.openTab();
        NewTab.FilterByStatus();
        //NewTab.FilterByCompanyName();
    }

  //  @Test (priority = 3)
  //  public void CorporateQuotesByName () {
  //      CorporateQuotes NewTab = new CorporateQuotes(driver);
  //      NewTab.FilterByCompanyName();
  //  }

}




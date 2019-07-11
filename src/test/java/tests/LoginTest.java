package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import utils.RemoteWebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest {
    WebDriver driver = null;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Olga\\Desktop\\PCAU-Test\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();

    }

    @Test
    public void successfulLoginTest() throws InterruptedException {
        driver.navigate().to("http://broker.pcau.qa.cpart.co.il/home");
        String appTitle = driver.getTitle();
        System.out.println("Application title is :: " + appTitle);

        String expectedTitle = "TravelCard Agency";
        assertEquals(appTitle, expectedTitle);

        LoginPage loginPage1 = new LoginPage();
        loginPage1.enterLoginEmail();
        loginPage1.enterPassword();
        loginPage1.clickLogin();

    }
}

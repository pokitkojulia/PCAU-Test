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

//    @BeforeTest
//    public void setUp(){
//        System.setProperty("webdriver.gecko.driver", "D:/fakeUITest/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().fullscreen();
//
//    }

    @Test
    public void successfulLoginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.setUpTest();
       loginPage.enterLoginEmail();
       loginPage.enterPassword();
       loginPage.clickLogin();
//        driver.findElement(By.id("mat-input-0")).sendKeys("zoyam@passportcard.com");
//        driver.findElement(By.id("mat-input-1")).sendKeys("ABCabc123");
//        driver.findElement(By.className("mat-button-wrapper")).click();


    }
}

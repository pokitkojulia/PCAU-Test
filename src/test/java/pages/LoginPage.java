package pages;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.RemoteDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class LoginPage {
    static WebDriver driver = null;
    private String URL = "http://broker.pcau.qa.cpart.co.il/home";
    String loginEmail_id = "mat-input-0";
    static String loginPassword_id = "mat-input-1";
    static String loginbtn_id = "mat-button-wrapper";
    static String welcomeText = "/html/body/app-root/ng-component/div/app-home/div/mat-card/h1";

    @BeforeMethod
    public void setUpTest(){
        driver = new ChromeDriver();
        driver.navigate().to(URL);
    }

    @AfterMethod
    public void teardownTest(){
        //driver.quit();
    }


    public LoginPage() {
        this.driver = RemoteDriverManager.getDriver();
    }

    public LoginPage enterLoginEmail() {
        WebElement loginEmail = driver.findElement(By.id(loginEmail_id));
        loginEmail.sendKeys("yoely@passportcard.com");
        return this;
    }

    public LoginPage enterPassword() {
        WebElement loginPassword = driver.findElement(By.id(loginPassword_id));
        loginPassword.sendKeys("yoelY123");
        return this;
    }

    public LoginPage clickLogin() {
        driver.findElement(By.className(loginbtn_id)).click();
        return this;
    }



//    public boolean atThisPage() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        return driver.findElement(By.xpath(welcomeText)).isDisplayed();
//    }
}



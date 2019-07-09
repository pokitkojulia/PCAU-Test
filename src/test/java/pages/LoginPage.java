package pages;
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

    public LoginPage() {
        this.driver = RemoteDriverManager.getDriver();
    }

    public LoginPage enterLoginEmail() {
        driver.findElement(By.id("mat-input-0")).sendKeys("zoyam@passportcard.com");
        return this;
    }

    public LoginPage enterPassword() {
        driver.findElement(By.id("mat-input-1")).sendKeys("ABCabc123");
        return this;
    }

    public LoginPage clickLogin() {
        driver.findElement(By.className("mat-button-wrapper")).click();
        return this;
    }



    public boolean atThisPage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return driver.findElement(By.xpath(welcomeText)).isDisplayed();
    }
}

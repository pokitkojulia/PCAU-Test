package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {
    static WebDriver driver = null;
    private String URL = "http://broker.pcau.qa.cpart.co.il/home";
    String loginEmail_id = "mat-input-0";
    static String loginPassword_id = "mat-input-1";
    static String loginbtn_id = "mat-button-wrapper";
    static String welcomeText = "/html/body/app-root/ng-component/div/app-home/div/mat-card/h1";

    @BeforeMethod
    public void setupTest (){
        driver = new ChromeDriver();

        driver.navigate().to(URL);
    }

    /*@Test
    public void firstTest () {
        enterLoginEmail();
        enterPassword();
        clickLogin();
    }
*/
    @AfterMethod
    public void teardownTest (){
        //driver.quit();
    }

    public LoginPage enterLoginEmail() {
        WebElement loginEmail = driver.findElement(By.id(loginEmail_id));
        loginEmail.sendKeys("yoely@passportcard.com");
        return this;
    }

    public LoginPage enterPassword() {
        driver.findElement(By.id(loginPassword_id)).sendKeys("yoelY123");
        return this;
    }

    public LoginPage clickLogin() {
        driver.findElement(By.className(loginbtn_id)).click();
        return this;
    }
}
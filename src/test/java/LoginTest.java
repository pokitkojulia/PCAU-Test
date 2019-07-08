import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;



public class LoginTest {

    WebDriver driver = null;

    // выполниться прежде чем методы с аннотацией @Test
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "D:/fakeUITest/chromedriver.exe");
        driver = new ChromeDriver();
    }

    // отделяем обычный метод в Java от метода, которые будет содержать проверки
    // так же помогает библиотеке формировать отчеты отделя методы, которые просто выполнились
    // от методов, которые будут отображать результат прохождения тестов
    @Test
    public void successfulLoginTest() throws InterruptedException {
        driver.navigate().to("http://broker.pcau.qa.cpart.co.il/home"); // переходим на сайт
        String appTitle = driver.getTitle();
        System.out.println("Application title is :: " + appTitle);

        String expectedTitle = "TravelCard Agency";

        assertEquals(appTitle, expectedTitle); // с помощью библиотеки TestNG выполняем сравнение занчений.


        driver.findElement(By.id("mat-input-0")).sendKeys("zoyam@passportcard.com");
        driver.findElement(By.id("mat-input-1")).sendKeys("ABCabc123");
        driver.findElement(By.className("mat-button-wrapper")).click();
        openTab();

    }

    public void openTab() {
        WebElement openTab = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/ng-component/app-header/mat-toolbar/nav/div/a[4]")));
        openTab.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement newQuotes = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/ng-component/div/app-quotes/mat-table/mat-row[1]/mat-cell[8]/button/span/mat-icon")));
        newQuotes.click();

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        WebElement editQuote = (new WebDriverWait(driver, 10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[span='Edit Quote']")));
//        editQuote.click();

//            new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div/button[4]/span"))).click();

//        cloneQuote.click();
//        Select drpIssue = new Select(driver.findElement(By.xpath("/html/body/app-root/ng-component/div/app-quotes/mat-table/mat-row[1]/mat-cell[8]/button/span")));
//        drpIssue.selectByValue("View Quote");
    }



        //driver.close();// закрываем окно браузера


    @Test
    public void failedTest() {

    }

}

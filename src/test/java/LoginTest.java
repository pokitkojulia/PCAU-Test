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



public class LoginTest {

    WebDriver driver = null;

    // выполниться прежде чем методы с аннотацией @Test
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "D:/fakeUITest/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();

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
        //filterButton();

    }

    public void openTab() {
        WebElement openClientsTab = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/ng-component/app-header/mat-toolbar/nav/div/a[4]")));
        openClientsTab.click();

        WebElement newQuotes = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='control-btn mat-raised-button mat-primary'][.//span[contains(text(), 'New')]]")));
        newQuotes.click();

    }

        //driver.close();// закрываем окно браузера





    }



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by macbook on 11/14/17.
 */

public class LoginTest {

    Driver driver = null;

    // выполниться прежде чем методы с аннотацией @Test
    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver(); // выбираем с каким браузером запуститься всем тестам в этом класса
    }

    // отделяем обычный метод в Java от метода, которые будет содержать проверки
    // так же помогает библиотеке формировать отчеты отделя методы, которые просто выполнились
    // от методов, которые будут отображать результат прохождения тестов
    @Test
    public void successfulLoginTest() {
        driver.get("http://google.com"); // переходим на наш сайт
        driver.findElement("Search field"); // пробуем найти элемент
        String title = driver.getTitle(); // узнаем название страницы что бы убедиться что мы именно там где ожидали быть
        String expectedTitle = "Title of the page";

        assertEquals(title, expectedTitle); // с помощью библиотеки TestNG выполняем сравнение занчений.
        // Если значения совпадут, то тесты буду зелеными
        // Если значения не совпадут, то тесты буду красными/оранжевыми

        driver.quit(); // закрываем браузер
    }

    @Test
    public void failedTest() {
        driver.get("http://google.com");
        driver.findElement("Search field");
        String title = driver.getTitle();
        String expectedTitle = "Facebook.com";

        assertEquals(title, expectedTitle);

        driver.quit();
    }

}

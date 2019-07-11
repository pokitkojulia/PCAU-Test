import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;



// пример теста в самом простом варианте

public class NewCompany {

    // обозначает, что метод нужно запустить особым образом
    // результат запуска записать в отчет с помощью библиотеки TestNG
    @Test
    public void successfulTest() {
        assertEquals(1, 1); // проверка, что ожидаемое значение соответствует тому,
                                            // что пришло от сервера в UI или BE
    }

    @Test
    public void failedTest() {
        assertEquals(1, 2);
    }

}

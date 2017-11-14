import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 * Created by macbook on 11/14/17.
 */

// пример теста в самом простом варианте

public class SampleTest {

    @Test
    public void successfulTest() {
        assertEquals(1, 1);
    }

    @Test
    public void failedTest() {
        assertEquals(1, 2);
    }

}

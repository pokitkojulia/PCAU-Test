/**
 * Created by macbook on 11/14/17.
 * <p>
 * В этом классе мы реализовали поведение Driver
 * то есть мы можем общаться с браузером.
 * Методы оставили пустыми для простоты кода и наглядности.
 */
public class ChromeDriver implements Driver {

    public void close() {
        System.out.println(getClass() + ": Close the current window, quitting the browser if it's the last window currently open.");
    }

    public void quit() {
        System.out.println(getClass() + ": Quits this driver, closing every associated window.");
    }

    public WebElement findElement(String element) {
        System.out.println(getClass() + ": Find the first WebElement using the given method.");
        return new WebElement("Some UI element");
    }

    public void get(String url) {
        System.out.println(getClass() + ": Load a new web page in the current browser window.");
    }

    public String getTitle() {
        System.out.println(getClass() + ": The title of the current page.");
        return "Title of the page";
    }
}

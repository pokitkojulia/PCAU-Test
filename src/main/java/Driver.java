/**
 * Created by macbook on 11/14/17.
 *
 * Этот интерфейс описывает поведение драйвера для браузера.
 * Любой драйвер должен уметь выполнять действия, которые здесь описаны
 * Но результат действий будет определен в каждо классе индивидуально
 * для конкретного браузера
 *
 */
public interface Driver {

    void close();
    void quit();
    WebElement findElement(String element);
    void get(String url);
    String getTitle();


}

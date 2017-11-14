/**
 * Created by macbook on 11/14/17.
 * <p>
 * Этот класс представляет собой элемент на HTML странице
 * Например, кнопка, текст, логотип - все это элементы страницы.
 * Для простоты кода оставили в элементе лишь имя. В реальности
 * элементы находятся на странице либо по ID, XPath, CSS.
 */
public class WebElement {

    String element;

    WebElement(String element) {
        this.element = element;
    }

}

package ex03;

import ex02.View;
import ex02.ViewableResult;

/**
 * шаблон проектування Factory Method
 * Об'являє метод фабрикуючий об'єкти
 *
 * @author Skorik Artem
 * @version 1.0
 */
public class ViewableTable extends ViewableResult {

    @Override
    public View getView() {
        return new ViewTable();
    }
}
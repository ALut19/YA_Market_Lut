package steps;

import pages.GoodsPage;
import pages.StartPage;
import ru.yandex.qatools.allure.annotations.Step;

public class GoodsPageSteps {

    @Step("выбрана цена от")
    public void stepSetPriceFrom(String price) {
        new GoodsPage().setPriceFrom(price);
    }

    @Step("Выбран чекбокс")
    public void stepClickCheckbox(String elementName) {
        new GoodsPage().clickCheckbox(elementName);
    }

    @Step("выполнено нажатие на кнопку Применить")
    public void stepSetApplyButton() {
        new GoodsPage().setApplyButton();
    }

    @Step("на странице отображается 12 товаров - телевизор")
    public void stepCountItems() {
        new GoodsPage().countItems();
    }

    @Step("на странице отображается 12 товаров - наушники")
    public void stepCountItems2() {
        new GoodsPage().countItems2();
    }

    @Step("сохранено название товара")
    public void stepSaveText() {
        new GoodsPage().saveText();
    }

    @Step("ожидание загрузки страницы")
    public void stepSleep() {
        new GoodsPage().sleep();
    }

    @Step("в форму поиска введено название товара")
    public void stepSetSearchBox() {
        new GoodsPage().setSearchBox();
    }

    @Step("нажата кнопка найти")
    public void stepSetSearchButton() {
        new GoodsPage().setSearchButton();
    }

    @Step("заголовок соответсвует ранее введенному в форму поиска")
    public void stepSetTitle() {
        new GoodsPage().setTitle();
    }

}



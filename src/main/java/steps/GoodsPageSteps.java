package steps;

import pages.GoodsPage;
import pages.StartPage;
import ru.yandex.qatools.allure.annotations.Step;

public class GoodsPageSteps {

    GoodsPage goodsPage = new GoodsPage();

    @Step("выбрана цена от")
    public void stepSetPriceFrom(String price) {
        goodsPage.setPriceFrom(price);
    }

    @Step("Выбран чекбокс")
    public void stepClickCheckbox(String elementName) {
        goodsPage.clickCheckbox(elementName);
    }

    @Step("выполнено нажатие на кнопку Применить")
    public void stepSetApplyButton() {
        goodsPage.setApplyButton();
    }

    @Step("на странице отображается 12 товаров - телевизор")
    public void stepCountItems(String name) {
        goodsPage.countItems(name);
    }

    @Step("Выбран чекбокс")
    public void stepSendSearchbox(String item) {
        goodsPage.sendSearchbox(item);
    }

    @Step("нажата кнопка найти")
    public void stepSetSearchButton() {
         goodsPage.setSearchButton();
    }

    @Step("заголовок соответсвует ранее введенному в форму поиска")
    public void stepSetTitle() {
        goodsPage.setTitle();
    }

}



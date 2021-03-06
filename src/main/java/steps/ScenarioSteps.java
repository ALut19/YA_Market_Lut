package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Data;

import java.util.List;

public class ScenarioSteps {

    StartPageSteps startPageSteps = new StartPageSteps();
    YaMarketPageSteps yaMarketPageSteps = new YaMarketPageSteps();
    GoodsPageSteps goodsPageSteps = new GoodsPageSteps();

    @When("^выбран пункт меню главной страницы \"(.*)\"$")
    public void stepSetMarket(String name) {
        startPageSteps.stepSetMarket();
    }

    @When("^выбран раздел \"(.*)\"$")
    public void stepSetElectronics(String name) {
        yaMarketPageSteps.stepSetElectronics();
    }

    @When("^выбран вид товара \"(.*)\"$")
    public void stepSetTvset(String name) {
        yaMarketPageSteps.stepSetTvset();
    }

    @When("^выбран тип товара \"(.*)\"$")
    public void stepSetHeadphones(String name) {
        yaMarketPageSteps.stepSetHeadphones();
    }

    @When("задана цена")
    public void stepSetPriceFrom(DataTable fields) {
        fields.asMap(String.class, String.class).forEach(
                (fieldName, price) -> goodsPageSteps.stepSetPriceFrom(price));
    }

    @When("^выбран чекбокс \"(.*)\"$")
    public void stepClickcheckbox(String elementName){
        goodsPageSteps.stepClickCheckbox(elementName);}

    @When("^выполнено нажатие на кнопку Применить")
    public void stepSetApplyButton() {
        goodsPageSteps.stepSetApplyButton();
    }

    @When("^выполнена проверка колличества товаров \"(.*)\" на странице")
    public void stepCountItems(String name) {
        goodsPageSteps.stepCountItems(name);
    }

    @When("в форму поиска введено название товара \"(.*)\"$")
    public void stepSendSearchbox(String item) {
        goodsPageSteps.stepSendSearchbox(item);
    }

    @When("^выполнено нажатие на кнопку Найти")
    public void stepSetSearchButton() {
        goodsPageSteps.stepSetSearchButton();
    }
    @When("выполнена проверка заголовка")
    public void stepSetTitle() {
        goodsPageSteps.stepSetTitle();
    }

}
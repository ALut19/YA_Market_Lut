package steps;

import pages.YaMarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class YaMarketPageSteps {

    @Step("выбран пункт меню Эдектроника")
    public void stepSetElectronics(){new YaMarketPage().setElectronics(); }

    @Step("выбран вид товара Телевизоры")
    public void stepSetTvset(){new YaMarketPage().setTvset(); }

    @Step("выбран вид товара Наушники")
    public void stepSetHeadphones(){
        new YaMarketPage().setHeadphones();
    }
}

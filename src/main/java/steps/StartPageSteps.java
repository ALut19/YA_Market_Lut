package steps;
import pages.StartPage;

import ru.yandex.qatools.allure.annotations.Step;

public class StartPageSteps {

    @Step("выполнен переход по ссылке Маркет")
    public void stepSetMarket(){
        new StartPage().setMarket();
    }


}

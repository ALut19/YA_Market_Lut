import org.junit.Test;
import pages.BaseClass;
import pages.StartPage;
import pages.TvPage;
import pages.YaMarketPage;

public class TvTest extends BaseClass{



    @Test
    public void tvTest(){
        StartPage startPage = new StartPage();
        YaMarketPage yaMarketPage = new YaMarketPage();
        TvPage tvPage = new TvPage();

        startPage.setMarket();
        yaMarketPage.setElectronics();
        yaMarketPage.setTvset();
        tvPage.setPriceFrom();
        tvPage.setCheckboxLG();
        tvPage.setCheckboxSamsung();
        tvPage.setApplyButton();
    }

}

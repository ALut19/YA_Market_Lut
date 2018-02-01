import org.junit.Test;
import pages.BaseClass;
import pages.StartPage;

public class TvTest extends BaseClass{



    @Test
    public void tvTest(){
        StartPage startPage = new StartPage();
        startPage.setMarket();
    }

}

import org.example.businessLogics.pages.HomePage;
import org.example.core.BaseTest;
import org.testng.annotations.Test;

public class WaitTest extends BaseTest
{
  @Test
  public void testWait(){
    new HomePage(getDriver()).stepClickDynamicLoading().stepClickExampleOne().stepClickStart().stepVerifyHelloWorld();
  }
}

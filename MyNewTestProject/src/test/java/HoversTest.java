import org.example.businessLogics.pages.HomePage;
import org.example.core.BaseTest;
import org.testng.annotations.Test;

public class HoversTest extends BaseTest
{
  @Test(groups="fun")
  public void testHoverslinks(){
    new HomePage(getDriver()).stepClickHovers();
  }
}

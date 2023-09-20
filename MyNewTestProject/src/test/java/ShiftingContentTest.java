import org.example.businessLogics.pages.HomePage;
import org.example.businessLogics.pages.ShiftingContentPage;
import org.example.core.BaseTest;
import org.testng.annotations.Test;

public class ShiftingContentTest extends BaseTest
{
  @Test
  public void shiftingTest(){
    new HomePage(getDriver()).stepClickShiftingContent();
    new ShiftingContentPage(getDriver()).stepClickMenuElement().stepNumberofmenuItems();
  }
}

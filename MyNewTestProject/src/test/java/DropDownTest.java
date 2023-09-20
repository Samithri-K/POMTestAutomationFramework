import org.example.businessLogics.pages.HomePage;
import org.example.core.BaseTest;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest
{
  @Test
  public void stepClickDropdown(){
    new HomePage(getDriver()).stepClickDropDown().stepSelectOption1();
  }
}

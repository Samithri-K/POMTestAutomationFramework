import org.example.businessLogics.pages.HomePage;
import org.example.businessLogics.pages.LoginPage;
import org.example.businessLogics.pages.SecureAreaPage;
import org.example.core.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest
{
  @Test
  public void testSuccessfullLogin(){
    new HomePage(getDriver())
        .stepClickAuthentication()
        .stepEnterUsername("tomsmith")
        .stepEnterPassword("SuperSecretPassword!")
        .stepClickLoginSuccessful()
        .getSuccessfulAlertText();
  }
  @Test
  public void testUnSuccessfullLogin(){
    new HomePage(getDriver())
        .stepClickAuthentication()
        .stepEnterUsername("maryJohn")
        .stepEnterPassword("SecretPassword!")
        .stepClickLoginUnSuccessful()
        .getUnsuccessfullAlertText();

  }
}

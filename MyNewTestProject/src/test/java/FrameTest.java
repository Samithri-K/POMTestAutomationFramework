import org.example.businessLogics.pages.HomePage;
import org.example.core.BaseTest;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest
{
  @Test
  public void testWysiwyg() throws InterruptedException
  {
    new HomePage(getDriver()).stepClickWISIWYG().clearTextArea().setTextArea("Hello");
  }

}

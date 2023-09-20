package org.example.businessLogics.pages;

import org.example.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;

public class SecureAreaPage extends BasePage
{
  public SecureAreaPage(WebDriver driver)
  {
    super(driver);
  }
  public String getSuccessfulAlertText(){
    By statusSuccessfullAlert = By.xpath("//div[@id='flash-messages']");
    String text2 = findElement(statusSuccessfullAlert).getText();
    assertTrue(text2.contains("Your password is invalid!"),"Alert error!");
    return findElement(statusSuccessfullAlert).getText();
  }
}

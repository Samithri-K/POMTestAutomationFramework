package org.example.businessLogics.pages;

import org.example.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShiftingContentPage extends BasePage
{
  public ShiftingContentPage(WebDriver driver)
  {
    super(driver);
  }

  public MenuElementPage stepClickMenuElement(){
    WebElement menuElement = findElement(By.linkText("Example 1: Menu Element"));
    System.out.println("Clicking on the Menu Element in the Shifting Content page");
    menuElement.click();
    return new MenuElementPage(driver);
  }
}

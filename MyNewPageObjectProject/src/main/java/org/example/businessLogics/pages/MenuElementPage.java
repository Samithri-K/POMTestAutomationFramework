package org.example.businessLogics.pages;

import java.util.List;

import org.example.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuElementPage extends BasePage
{
  public MenuElementPage(WebDriver driver)
  {
    super(driver);
  }

  public void stepNumberofmenuItems(){
    List<WebElement> menuItems = findElements(By.tagName("li"));
    System.out.println("Number of menu items: " + menuItems.size());
  }
}

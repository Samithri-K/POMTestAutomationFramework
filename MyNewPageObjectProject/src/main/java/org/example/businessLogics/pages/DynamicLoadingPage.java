package org.example.businessLogics.pages;

import org.example.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicLoadingPage extends BasePage
{
  public DynamicLoadingPage(WebDriver driver){super(driver);}

  public DynamicLoadingExampleOnePage stepClickExampleOne(){
    WebElement Example1 = findElement(By.xpath("//a[@href='/dynamic_loading/1']"));
    Example1.click();
    return new DynamicLoadingExampleOnePage(driver);
  }
}

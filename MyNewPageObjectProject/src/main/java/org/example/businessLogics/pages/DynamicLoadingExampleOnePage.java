package org.example.businessLogics.pages;

import org.example.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DynamicLoadingExampleOnePage extends BasePage
{
  WebElement Text =findElement(By.id("finish"));
  public DynamicLoadingExampleOnePage(WebDriver driver)
  {
    super(driver);
  }

  public DynamicLoadingExampleOnePage stepClickStart(){
    WebElement StartButton = findElement(By.xpath("//button[text()='Start']"));
    StartButton.click();
    waitUntilElementDisplay(Text);
    return this;
  }

  private String getLoadingText(){
    return Text.getText();
  }

  public DynamicLoadingExampleOnePage stepVerifyHelloWorld(){
    Assert.assertEquals(getLoadingText(),"Hello World!");
    return this;
  }
}

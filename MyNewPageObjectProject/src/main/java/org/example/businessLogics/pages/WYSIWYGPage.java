package org.example.businessLogics.pages;

import org.example.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WYSIWYGPage extends BasePage
{
  By textArea = By.id("tinymce");
  public WYSIWYGPage(WebDriver driver)
  {
    super(driver);
  }

  public WYSIWYGPage clearTextArea(){
    switchToEditArea();
    driver.findElement(textArea).clear();
    return this;
  }

  public WYSIWYGPage setTextArea(String text) throws InterruptedException
  {
    driver.findElement(textArea).sendKeys(text);
    Thread.sleep(5000);
    return this;
  }

  public String getTextFromEditor(){
    By verifyInput = By.xpath("//body[@id='tinymce']/p");
    String text = findElement(verifyInput).getText();
    return text;
  }

  public WYSIWYGPage verifyInputText(){
    Assert.assertEquals(getTextFromEditor(),"Hello");
    return this;
  }

  private void switchToEditArea(){
    String editorIframeid ="mce_0_ifr";
    driver.switchTo().frame(findElement(By.id(editorIframeid)));
  }

  private void switchToMainArea(){
    driver.switchTo().parentFrame();
  }

//  public WYSIWYGPage verifyTypeText(){
//    //By textArea = By.xpath("//body[@id='tinymce']");
//    String editorIframeid ="mce_0_ifr";
//    driver.switchTo().frame(findElement(By.id(editorIframeid)));
//   //findElement(textArea).sendKeys("AB");
//    driver.findElement(textArea).clear();
//    return this;
//  }
}

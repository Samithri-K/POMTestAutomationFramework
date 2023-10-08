package org.example.businessLogics.pages;

import org.example.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownPage extends BasePage
{
  public DropDownPage(WebDriver driver){
    super(driver);
  }
  public DropDownPage stepSelectOption1(){
  WebElement option1 = findElement(By.xpath("//option[@value='1']"));
  option1.click();
  System.out.println("Clicking on the first option in the dropdown");
  return new DropDownPage(driver);
}
}

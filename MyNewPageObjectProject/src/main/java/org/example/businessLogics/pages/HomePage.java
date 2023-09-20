package org.example.businessLogics.pages;

import org.example.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage
{
  public HomePage(WebDriver driver){
    super(driver);
  }

  public LoginPage stepClickAuthentication(){
    stepclickLink("Form Authentication");
    System.out.println("Clicking on the Form Authentication in the main page");
    return new LoginPage(driver);
  }
  public ShiftingContentPage stepClickShiftingContent(){
    stepclickLink("Shifting Content");
    System.out.println("Clicking on the Shifting Content in the main page");
    return new ShiftingContentPage(driver);
  }

  public DropDownPage stepClickDropDown(){
    stepclickLink("Dropdown");
    System.out.println("Clicking on the Dropdown in the main page");
    return new DropDownPage(driver);
  }

  private void stepclickLink(String text){
    findElement(By.linkText(text)).click();
  }
}
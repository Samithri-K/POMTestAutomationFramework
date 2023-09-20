package org.example.businessLogics.pages;

import org.example.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.*;
public class LoginPage extends BasePage
{
  public LoginPage(WebDriver driver){
    super(driver);
  }

  public LoginPage stepEnterUsername(String username){
    WebElement email = findElement(By.id("username"));
    email.clear();
    System.out.println("Entering the email");
    email.sendKeys(username);
    return this;
  }

  public LoginPage stepEnterPassword(String pw){
    WebElement password = findElement(By.id("password"));
    password.clear();
    System.out.println("entering the password");
    password.sendKeys(pw);
    return this;
  }

  public SecureAreaPage stepClickLoginSuccessful(){
    WebElement loginButton = findElement(By.xpath("//button[@class='radius']"));
    System.out.println("Clicking login button-Successfull");
    loginButton.click();
    return new SecureAreaPage(driver);
  }

  public LoginPage stepClickLoginUnSuccessful(){
    WebElement loginButton = findElement(By.xpath("//button[@class='radius']"));
    System.out.println("Clicking login button-Unsuccessful");
    loginButton.click();
    return this;
  }
  public LoginPage getUnsuccessfullAlertText(){
    By unsuccessfullAlert = By.xpath("//div[@class='flash error']");
    String text1 = findElement(unsuccessfullAlert).getText();
    assertTrue(text1.contains("You logged into a secure area!x"),"Alert error!");
    return this;
  }
}

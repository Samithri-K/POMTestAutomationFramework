package org.example.core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage
{
  public static WebDriver driver;
  public BasePage(WebDriver driver){
    this.driver = driver;
  }


  public static WebElement findElement(By element){
    return driver.findElement(element);
  }

  public static List<WebElement> findElements(By element){
    return driver.findElements(element);
  }

  public static String getTitle(){
    return driver.getTitle();
  }

  public static void waitUntilElementDisplay(WebElement webElement){
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.visibilityOf(webElement));
  }
}

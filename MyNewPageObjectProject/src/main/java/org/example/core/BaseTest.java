package org.example.core;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest
{
  private static WebDriver driver;

  @BeforeTest
  public void launchApp() {
    // Set the path to the ChromeDriver executable (replace with your path)
    System.setProperty("webdriver.chrome.driver", "C:\\MyNewTestAutomationFrameworkPOM\\MyNewTestProject\\src\\test"
        + "\\resources\\driver\\chromedriver.exe");

    // Initialize the WebDriver (Browser)
    this.driver = new ChromeDriver();

    String url = "https://the-internet.herokuapp.com/";

    driver.get(url);
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

  }

  @AfterTest
  public void quitBrowser(){
    // Close the browser
   driver.quit();
  }

  public static WebDriver getDriver(){
    return driver;
  }
  }






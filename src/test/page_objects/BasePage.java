package test.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BasePage {
  private WebDriver driver;

  BasePage (WebDriver driver) {
    this.driver = driver;
  }

  BasePage () {
      System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
      this.driver = new ChromeDriver();
  }

  void navigateTo(String url) {
    this.driver.navigate().to(url);
  }

  WebDriver getDriver() {
    return this.driver;
  }

  void closeNavigator() {
    getDriver().close();
  }
}

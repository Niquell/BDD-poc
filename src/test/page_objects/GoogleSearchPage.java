package test.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;

import java.util.Iterator;
import java.util.List;

public class GoogleSearchPage extends BasePage{
  public GoogleSearchPage(WebDriver driver) {
    super(driver);
  }

  public GoogleSearchPage(){
    super();
  }

  public void search(String searchTerm) {
    try {
      super.navigateTo("http://www.google.com");

      WebElement element = super.getDriver().findElement(By.name("q"));

      element.sendKeys(searchTerm);

      element.submit();
    }
    catch (RuntimeException e){
      System.out.println("Error at Google Search: \n" + e);
    }
  }

  public void getGoogleDefinition(String searchTerm) {
    search(searchTerm);
    try {
      List<WebElement> elementsList = super.getDriver().findElements(By.cssSelector("span[class='ILfuVd']"));

      if(elementsList.isEmpty()) {
        List<WebElement> Questionary = super.getDriver().findElements(By.cssSelector("div[jsname=xXq91c]"));
        if(!Questionary.isEmpty()) {
          Questionary.get(0).click();
          elementsList = super.getDriver().findElements(By.cssSelector("span[class='ILfuVd NA6bn']"));
        }
      }
      if (!elementsList.isEmpty()) {
        System.out.println(elementsList.get(0).getText());
      }
      else {
        throw new NoSuchElementException("Web Element not found.");
      }
    }
    catch (NoSuchElementException e){
      System.out.println("Google does not have a definition for '" + searchTerm + "'\n");
//      System.out.println("Error: " + e);
    }
    catch (RuntimeException e) {
      System.out.println("RuntimeException:\n");
      System.out.println("Error: " + e);
    }
  }
  public void close() {
    super.closeNavigator();
  }
}


// jsname = oQYOj
// class = mod
// class = LGOjhe
// class = ILfuVd NA6bn
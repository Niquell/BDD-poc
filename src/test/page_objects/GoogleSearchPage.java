package test.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.soap.Text;

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
    try {
      search(searchTerm);
      WebElement TextParagraph = super.getDriver().findElement(By.cssSelector("span[class=ILfuVd]"));
      System.out.println(TextParagraph);
      String definition = TextParagraph.getText();

      System.out.println("DEFINITION:\n" + definition);

    }
    catch (RuntimeException e){
      System.out.println("Google does not have a definition for " + searchTerm + "\nError: " + e);
    }
  }
// ILfuVd
  public void close() {
    super.closeNavigator();
  }
}
// XPATH
//*[@id="_i9RhXM6CItjW5OUPr6GfiA014"]/div[1]/div/span/text()[1]

// outer html
// é uma linguagem de programação criada por Guido van Rossum em 1991. Os objetivos do projeto da linguagem eram: produtividade e legibilidade. Em outras palavras,
//<div jsname="oQYOj" id="_VuFhXMXcH_C65OUPsaij6A09" data-hveid="CAUQBA" data-ved="2ahUKEwjF34nFyLTgAhVwHbkGHTHUCN0Qu04oAXoECAUQBA"><div class="mod" data-md="61" style="clear:none"><!--m--><div class="LGOjhe" aria-level="3" role="heading" data-hveid="CAUQBQ"><span class="ILfuVd NA6bn">Entenda os <b>Padrões</b> de Projeto - Design Patterns (<b>GoF</b> - GRASP) de forma simples <b>e</b> direta. ... <b>Padrões são</b> melhores práticas formalizadas que o programador pode usar para resolver problemas comuns quando projetar uma aplicação ou sistema.</span><span class="kX21rb">2 de mar de 2017</span></div><!--n--></div><div class="g"><!--m--><div data-hveid="CAUQCA" data-ved="2ahUKEwjF34nFyLTgAhVwHbkGHTHUCN0QFSgAMAR6BAgFEAg"><div class="rc"><div class="r"><a href="https://m.youtube.com/watch?v=5CgwgRHhCRM" onmousedown="return rwt(this,'','','','5','AOvVaw3Frx552ZHq8VJvreNmIsZC','','2ahUKEwjF34nFyLTgAhVwHbkGHTHUCN0QFjAEegQIBRAJ','','',event)"><h3 class="LC20lb">Padrões de Projeto - Design Patterns (GoF - GRASP) - YouTube</h3><br><div class="TbwUpd"><cite class="iUh30">https://m.youtube.com/watch?v=5CgwgRHhCRM</cite></div></a></div><div class="s"><div></div></div></div></div><!--n--></div><div class="match-mod-horizontal-padding kcHZBe">Pesquisar: <a href="/search?client=ubuntu&amp;channel=fs&amp;q=O+que+%C3%A9+o+padr%C3%A3o+GoF%3F&amp;sa=X&amp;ved=2ahUKEwjF34nFyLTgAhVwHbkGHTHUCN0Qzmd6BAgFEAo">O que é o padrão GoF?</a></div></div>
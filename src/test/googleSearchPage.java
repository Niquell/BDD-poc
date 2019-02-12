package test;

import test.page_objects.GoogleSearchPage;

public class googleSearchPage {

  public static void main(String[] args) {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    googleSearchPage.getGoogleDefinition("Qualquer coisa");

    googleSearchPage.close();
  }
}
package test;

import test.page_objects.GoogleSearchPage;

public class googleSearchPage {

  public static void main(String[] args) {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    googleSearchPage.getGoogleDefinition("Padrão de Projeto");

//    googleSearchPage.close();
  }
}


package org.example;

import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    HomePage homePage;

    @BeforeTest
    public void setup(){
        homePage = open("https://www.browserstack.com/", HomePage.class);
    }


}

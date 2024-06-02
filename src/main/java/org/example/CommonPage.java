package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class CommonPage {
    SelenideElement cookiesRejectButton = $(By.id("accept-cookie-notification-cross"));
    SelenideElement cookiesAcceptButton = $(By.id("accept-cookie-notification"));

    public void acceptAllCookies(){
        cookiesAcceptButton.shouldBe(Condition.visible).click();
    }

    public void rejectAllCookies(){
        cookiesRejectButton.shouldBe(Condition.visible).click();
    }

    public String getPageTitle(){
        return title();
    }
}

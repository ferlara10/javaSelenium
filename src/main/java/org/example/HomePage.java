package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private SelenideElement getStartedFreeButton = $(By.id("signupModalProductButton"));
    private SelenideElement contactSalesButton = $(By.xpath("//section[@id='heroUnitMainSection']//button[normalize-space()='Contact Sales']"));

    public SignUpPage getStartedFreeClick(){
        getStartedFreeButton.shouldBe(Condition.visible).click();
        return Selenide.page(SignUpPage.class);
    }

    public ContactSalesPage contactSalesClick(){
        contactSalesButton.shouldBe(Condition.visible).click();
        return Selenide.page(ContactSalesPage.class);
    }
}

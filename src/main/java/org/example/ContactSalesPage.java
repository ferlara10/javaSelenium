package org.example;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ContactSalesPage extends CommonPage{

    SelenideElement modalDialogForm = $(By.cssSelector("div.tingle-modal-box"));

    public boolean isFormPresent(){
        return modalDialogForm.isDisplayed();
    }

}

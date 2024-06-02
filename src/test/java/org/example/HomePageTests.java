package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

    @Test
    public void navigateSignUpPage(){
        SignUpPage signUpPage = homePage.getStartedFreeClick();
        Assert.assertTrue(signUpPage.getPageTitle().contains("Get Started For Free & Access"));
    }

    @Test
    public void navigateContactSalesPage(){
        ContactSalesPage salesPage = homePage.contactSalesClick();
        Assert.assertTrue(salesPage.isFormPresent(), "The element is not present in the page.");
    }

}

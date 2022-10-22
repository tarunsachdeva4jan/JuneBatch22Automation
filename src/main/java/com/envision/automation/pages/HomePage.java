package com.envision.automation.pages;

import com.envision.automation.framework.core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    public HomePage checkIfSignOutDisplayed() throws IOException {
        boolean status = isDisplayed("HomePage.lnkSignOut");
        Assert.assertTrue("Element Sign Out not displayed",status);
        return this;
    }

    public String getUsernameLoggedIn() throws IOException {
        String name =getWebElementText("HomePage.lnkUserLoggedIn");
        return name;
    }

    public HomePage checkIfUsernameLoggedInIsValid(String userLoggedIn) throws IOException {
        Assert.assertEquals(userLoggedIn,getUsernameLoggedIn());
        return this;
    }
}

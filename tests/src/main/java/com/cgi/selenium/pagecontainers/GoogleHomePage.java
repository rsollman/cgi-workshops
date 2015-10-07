package com.cgi.selenium.pagecontainers;

import com.cgi.selenium.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleHomePage implements Page {

    @FindBy(how = How.NAME, using = "q")
    private WebElement query;

    @Override
    public boolean isDisplayed() {
        return query.isDisplayed();
    }
}


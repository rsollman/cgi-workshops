package com.cgi.selenium.pagecontainers;

import com.cgi.selenium.BrowserDriver;
import com.cgi.selenium.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage implements Page {

    @FindBy(how = How.NAME, using = "q")
    private WebElement query;

    @Override
    public boolean isDisplayed() {
        return query.isDisplayed();
    }

    @Override
    public void search(String q) {
        query.sendKeys(q);
        query.sendKeys(Keys.RETURN);
    }

    @Override
    public boolean hasResults() {
        WebDriverWait webDriverWait = new WebDriverWait(BrowserDriver.getCurrentDriver(), 10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"search\"]")));
        return true;
    }
}


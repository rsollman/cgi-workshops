package com.cgi.selenium;

import com.cgi.selenium.pagecontainers.GoogleHomePage;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class PageStrategy {

    static Map<String, Page> PAGES = new HashMap<String, Page>() {{
        put(GoogleHomePage.class.getName().toLowerCase(), new GoogleHomePage());
    }};

    public Page getPage(String name) {
        final Page page = PAGES.get(name.toLowerCase());
        PageFactory.initElements(BrowserDriver.getCurrentDriver(), page);
        return page;
    }
}
package com.cgi.selenium;

import org.apache.log4j.Logger;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.UnreachableBrowserException;

/**
 * Created by sollmanr on 15-6-2015.
 */
public class BrowserDriver {

    private static final Logger LOGGER = Logger.getLogger(BrowserDriver.class);

    private static WebDriver mDriver;

    public synchronized static WebDriver getCurrentDriver() {
        if (mDriver == null) {
            try {
                FirefoxProfile ff = new FirefoxProfile();
                ff.setPreference("network.proxy.type", Proxy.ProxyType.AUTODETECT.ordinal());
                mDriver = new FirefoxDriver(ff);
            } finally {
                Runtime.getRuntime().addShutdownHook(
                        new Thread(new BrowserCleanup()));
            }
        }
        return mDriver;
    }

    private static class BrowserCleanup implements Runnable {
        public void run() {
            LOGGER.info("Closing the browser");
            close();
        }
    }

    public static void close() {
        try {
            getCurrentDriver().quit();
            mDriver = null;
            LOGGER.info("closing the browser");
        } catch (UnreachableBrowserException e) {
            LOGGER.info("cannot close browser: unreachable browser");
        }
    }

    public static void loadPage(String url) {
        LOGGER.info("Directing browser to:" + url);
        getCurrentDriver().get(url);
    }
}

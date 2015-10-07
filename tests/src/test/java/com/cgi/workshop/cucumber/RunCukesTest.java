package com.cgi.workshop.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"classpath:"},
        format={"html:target/reports/html"})
public class RunCukesTest {
}
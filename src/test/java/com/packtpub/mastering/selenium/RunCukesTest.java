package com.packtpub.mastering.selenium;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport", "json-pretty:target/cucumber-report.json"})
public class RunCukesTest {
}

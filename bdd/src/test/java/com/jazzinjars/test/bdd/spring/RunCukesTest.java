package com.jazzinjars.test.bdd.spring;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"com.jazzinjars.test.bdd.spring", "cucumber.api.spring"})
public class RunCukesTest {
}

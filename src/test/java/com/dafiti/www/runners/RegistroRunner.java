package com.dafiti.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.dafiti.www/features/registro.feature",
        glue = "com.dafiti.www.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RegistroRunner {
}

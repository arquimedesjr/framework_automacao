package br.com.automacaoWeb.runnerTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", monochrome = true, snippets = SnippetType.CAMELCASE, strict = true,features = "features/run/",glue = "br.com.automacaoWeb.stepDefinition")
public class RunnerTest {
	


}

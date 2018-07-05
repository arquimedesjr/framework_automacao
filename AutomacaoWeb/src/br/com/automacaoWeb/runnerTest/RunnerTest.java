package br.com.automacaoWeb.runnerTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/",glue = "br.com.automacaoWeb.stepDefinition")
public class RunnerTest {

}

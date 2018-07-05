package br.com.automacaoWeb.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.automacaoWeb.screenShot.ScreenShot;
import br.com.automacaoWeb.stepBusiness.StepBusinessAutoWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinitionAutoWeb {
	
	private StepBusinessAutoWeb stepB;
	
	private ScreenShot screenShot;
	
	private WebDriver driver;
	

	@Given("^inicio a aplicação \"([^\"]*)\"$")
	public void inicio_a_aplicação(String url) throws Throwable {
		stepB.getInstance().open(url);
		stepB.getInstance().takeScreenShotTest();
		
	}

	@When("^insiro um texto \"([^\"]*)\"$")
	public void insiro_um_texto(String texto) throws Throwable {
		stepB.getInstance().inserirInformação(texto);
		stepB.getInstance().takeScreenShotTest();
		
		
	}

}

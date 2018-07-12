package br.com.automacaoWeb.stepDefinition;

import br.com.automacaoWeb.stepBusiness.StepBusinessAutoWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinitionAutoWeb {

	private StepBusinessAutoWeb stepB;

	@Given("^inicio a aplicação \"([^\"]*)\"$")
	public void inicio_a_aplicação(String url) throws Throwable {
		try {

			stepB.getInstance().open(url);
			stepB.getInstance().takeScreenShotTest();
		} catch (Exception e) {
			stepB.getInstance().closeWeb();
		}
	}

	@When("^insiro um texto \"([^\"]*)\"$")
	public void insiro_um_texto(String texto) throws Throwable {
		try {

			stepB.getInstance().inserirInformação(texto);
			stepB.getInstance().takeScreenShotTest();
			stepB.getInstance().closeWeb();
		} catch (Exception e) {
			e.getStackTrace();
			stepB.getInstance().closeWeb();
		}

	}

}

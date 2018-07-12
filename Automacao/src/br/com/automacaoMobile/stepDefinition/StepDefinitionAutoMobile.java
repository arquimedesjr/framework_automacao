package br.com.automacaoMobile.stepDefinition;

import br.com.automacaoMobile.stepBusiness.StepBusinessAutoMobile;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinitionAutoMobile {

	private StepBusinessAutoMobile stepB;

	@Given("^inicio a conexao com o appium$")
	public void inicioAConexaoComOAppium() throws Throwable {
		stepB.getInstance().openAppium();
	}

	@When("^clico no menu$")
	public void clicoNoMenu() throws Throwable {
		stepB.getInstance().clicoMenu();
	}
 
	@When("^clico no numero \"([^\"]*)\"$")
	public void clicoNoNumero(String arg1) throws Throwable {
		stepB.getInstance().clicoTeclado(arg1);
		stepB.getInstance().closeApp();
	}

}

package br.com.automacaoMobile.stepDefinition;

import br.com.automacaoMobile.stepBusiness.StepBusinessAutoMobile;
import cucumber.api.java.en.Given;

public class StepDefinitionAutoMobile {
	
	private StepBusinessAutoMobile stepB;
	
	@Given("^inicio a conexao com o appium$")
	public void inicioAConexaoComOAppium() throws Throwable {
		stepB.getInstance().openAppium();
	}

}

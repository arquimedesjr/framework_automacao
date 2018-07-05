package br.com.automacaoWeb.stepBusiness;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.automacaoWeb.pages.PageHome;

public class StepBusinessAutoWeb {

	private static StepBusinessAutoWeb stepB;
	
	private WebDriver driver;

	private PageHome pageHome;

	private ResourceBundle config;

	public StepBusinessAutoWeb() {
		config = ResourceBundle.getBundle("br.com.automacaoWeb.stepBusiness/config");
	}

	public static StepBusinessAutoWeb getInstance() {
		if (stepB == null) {
			stepB = new StepBusinessAutoWeb();
		}
		return stepB;

	}
	// Resolver essa solução!!!
	public void takeScreenShotTest() {
		List<String> imagem = new ArrayList<String>();
		int pasta = 1;
		int cont = 1;
		try {
			File diretorio = new File("C:\\Evidencias\\testes" + pasta);
			File imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			if (diretorio.exists()) {
					for(String imagens: imagem) {
						imagem.add("1");
						FileUtils.copyFile(imagen, new File(diretorio.getAbsolutePath() + "//" + imagem + ".png"));
				
					}
			} else {
				diretorio.mkdir();
				FileUtils.copyFile(imagen, new File(diretorio.getAbsolutePath() + "//" + imagem + ".png"));
			}
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void open(String url) throws InterruptedException {

		System.setProperty(config.getString("package.driverWeb"), config.getString("caminho.driverWeb"));

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		Thread.sleep(10000);
	}

	public void inserirInformação(String texto) {
		driver.findElement(By.xpath(pageHome.getInstance().getBotão())).sendKeys(texto);
	}

}

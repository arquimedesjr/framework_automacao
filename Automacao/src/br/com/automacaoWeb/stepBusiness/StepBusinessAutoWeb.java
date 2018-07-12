package br.com.automacaoWeb.stepBusiness;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

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

	public static StepBusinessAutoWeb getInstance() {
		if (stepB == null) {
			stepB = new StepBusinessAutoWeb();
		}
		return stepB;

	}
	public StepBusinessAutoWeb() {

		config = ResourceBundle.getBundle("br.com.automacaoWeb.stepBusiness/config");

	}

	int nome = 1;
	int pasta = 1;

	public void takeScreenShotTest() {

		try {
			File diretorio = new File("C:\\Evidencias\\teste_" + pasta);
			File imagem = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			if (diretorio.exists()) {
				FileUtils.copyFile(imagem, new File(diretorio.getAbsolutePath() + "//" + nome + ".png"));

			} else {
				diretorio.mkdir();
				FileUtils.copyFile(imagem, new File(diretorio.getAbsolutePath() + "//" + nome + ".png"));
			}
			if (nome == 2) {
				pasta++;
				nome = 0;
			}
			nome++;
		} catch (

		IOException e) {
			e.printStackTrace();
		}
	}

	public void open(String url) {
		try {

			System.setProperty(config.getString("package.driverWeb"), config.getString("caminho.driverWeb"));

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public void inserirInformação(String texto) {
		try {

			driver.findElement(By.xpath(pageHome.getInstance().getBotão())).sendKeys(texto);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public void closeWeb() {

		driver.quit();
	}

}

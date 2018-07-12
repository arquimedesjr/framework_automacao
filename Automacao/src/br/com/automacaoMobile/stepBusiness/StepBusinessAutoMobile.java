package br.com.automacaoMobile.stepBusiness;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.automacaoMobile.pages.PageHome;
import br.com.automacaoMobile.pages.PageTeclado;
import io.appium.java_client.android.AndroidDriver;

public class StepBusinessAutoMobile {

	private static StepBusinessAutoMobile stepB;

	private AndroidDriver<WebElement> driver;

	private PageHome pageHome;

	private PageTeclado pageTeclado;

	private ResourceBundle config;

	public static StepBusinessAutoMobile getInstance() {
		if (stepB == null) {
			stepB = new StepBusinessAutoMobile();
		}
		return stepB;

	}

	public StepBusinessAutoMobile() {

		config = ResourceBundle.getBundle("br.com.automacaoMobile.stepBusiness/config");

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
			// if (nome == 2) {
			// pasta++;
			// nome = 0;
			// }
			nome++;
		} catch (

		IOException e) {
			e.printStackTrace();
		}
	}

	public void openAppium() {
		try {

			final DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "52000f65ec387481");
			capabilities.setCapability("platformName", "android");
			capabilities.setCapability("noReset", "true");
			capabilities.setCapability("appActivity", "com.simpler.ui.activities.ContactsAppActivity");
			capabilities.setCapability("appPackage", "com.simpler.dialer");
			 capabilities.setCapability("automationName", "uiautomator2");
			// capabilities.setCapability("newCommandTimeout", "100000");
			capabilities.setCapability("app", "C:\\aplicativosextraidos\\dialersimpler.apk");

			this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public void clicoMenu() {

		driver.findElement(By.id(pageHome.getInstance().getIdBotaomenu())).click();

	}

	public void clicoTeclado(String num) {

		if (num.equals("1")) {
			driver.findElement(By.id(pageTeclado.getInstance().getIdTeclado1())).click();
		} else if (num.equals("2")) {
			driver.findElement(By.id(pageTeclado.getInstance().getIdTeclado2())).click();
		} else if (num.equals("3")) {
			driver.findElement(By.id(pageTeclado.getInstance().getIdTeclado3())).click();
		} else if (num.equals("4")) {
			driver.findElement(By.id(pageTeclado.getInstance().getIdTeclado4())).click();
		} else if (num.equals("5")) {
			driver.findElement(By.id(pageTeclado.getInstance().getIdTeclado5())).click();
		} else if (num.equals("6")) {
			driver.findElement(By.id(pageTeclado.getInstance().getIdTeclado6())).click();
		} else if (num.equals("7")) {
			driver.findElement(By.id(pageTeclado.getInstance().getIdTeclado7())).click();
		} else if (num.equals("8")) {
			driver.findElement(By.id(pageTeclado.getInstance().getIdTeclado8())).click();
		} else if (num.equals("9")) {
			driver.findElement(By.id(pageTeclado.getInstance().getIdTeclado9())).click();
		} else if (num.equals("0")) {
			driver.findElement(By.id(pageTeclado.getInstance().getIdTeclado0())).click();
		} else {
			System.out.println("elemento não encontrado");
		}

	}

	public void closeApp() {

		driver.closeApp();
	}

}

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
import io.appium.java_client.android.AndroidDriver;

public class StepBusinessAutoMobile {

	private static StepBusinessAutoMobile stepB;

	private AndroidDriver<WebElement> driver;

	private PageHome pageHome;

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

			// capabilities.setCapability("noReset", "true");
			// capabilities.setCapability("appActivity", "com.spotify.music");
			// capabilities.setCapability("appPackage", "com.spotify.music.MainActivity");
			// capabilities.setCapability("automationName", "uiautomator2");
			// capabilities.setCapability("newCommandTimeout", "30000");
			final DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "LGK430C64TTSLF");
			capabilities.setCapability("platformName", "android");
			capabilities.setCapability("noReset", "true");
			capabilities.setCapability("newCommandTimeout", "100000");
			capabilities.setCapability("app", "C:\\aplicativosextraidos\\Spotify.apk");

			this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

			

		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public void inserirInformação(String texto) {

	}

	public void closeApp() {

		driver.closeApp();
	}

}

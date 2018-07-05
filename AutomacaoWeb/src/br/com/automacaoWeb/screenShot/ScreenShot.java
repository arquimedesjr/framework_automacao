package br.com.automacaoWeb.screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class ScreenShot {

	private static ScreenShot screenShot;

	private WebDriver driver;
	private static int pasta = 1;
	private static int imagem = 1;

	public static ScreenShot getInstance() {
		if (screenShot == null) {
			screenShot = new ScreenShot();
		}
		return screenShot;
	}

	public void takeScreenShotTest(WebDriver driver) {
		this.driver = driver;
		try {
			File diretorio = new File("C:\\Evidencias\\testes" + pasta);
			File imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			if (diretorio.exists()) {
				FileUtils.copyFile(imagen, new File(diretorio.getAbsolutePath() + "//" + imagem + ".png"));

			} else {
				diretorio.mkdir();
				FileUtils.copyFile(imagen, new File(diretorio.getAbsolutePath() + "//" + imagem + ".png"));
			}
			imagem++;

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
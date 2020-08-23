package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	private static WebDriver driver;
	
	public static void openBrowser(String url) {

//		System.setProperty("webdriver.firefox.driver", "driver/geckodriver.exe");
//		driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url); // Abrindo a aplicação
		driver.manage().window().maximize(); // Maximizando a tela

	}
	

	public static void closeBrowser() {
		driver.quit(); // Encerra a sessão
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUrl(String url) {
		driver.get(url);
	}

}

package desafioBase2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import core.Driver;
import pages.Page;

public class Base {
	
	Page inicialPage = new Page();

	@Before
	public void openBrowser() {

		Driver.openBrowser("http://mantis-prova.base2.com.br");

	}

	@After
	public void closeBrowser() {
		Driver.closeBrowser();
	}
	
	public void login() {
		
		inicialPage.Clean();
		inicialPage.setUsername("iuri.almeida");
		inicialPage.setPassword("bugaluga01", Keys.ENTER);
	}
	
	public void logout() {
		inicialPage.Logout();
	}
	
	public void verificarUsuarioLogado() {
		inicialPage.setVerificarUsuario("iuri.almeida");
	}
	
	public void selecionandoProjeto() {
		inicialPage.setProjeto("Iuri Almeida´s Project");
	}
	
	public void reportarErro() {
		inicialPage.newIssue();
		inicialPage.setCategory("[All Projects] General");
		inicialPage.setReproducibility("sometimes");
		inicialPage.setSeveraty("major");
		inicialPage.setPriority("high");
		inicialPage.setProfile("PlataformaTeste SiSTEMA Windows10");
		inicialPage.setSumary("Teste Base 2");
		inicialPage.setDescription("Teste de automação para um cargo na base 2. Fé em Deus!");
		inicialPage.setViewStatus("public");
		inicialPage.checkReportStay();
		inicialPage.submitReport();
		inicialPage.submitSuccessful();
		
	}
	
	public void detailsIssue() {
		inicialPage.myView();
		inicialPage.reportedByMe();
		inicialPage.applyFilter("4041", Keys.ENTER);
		inicialPage.openIssue();
		inicialPage.checkIssue();
	}
	
	public void adicionarNota() {
		inicialPage.jumpToIssue("4041");
		inicialPage.addNote("Estudando automação de testes");
	}

//	public void login() {
//
//		WebElement username = Driver.getDriver().findElement(By.xpath("//tr[2]/td[2]/input"));
//		username.clear();
//		username.sendKeys("iuri.almeida");
//		WebElement password = Driver.getDriver().findElement(By.xpath("//tr[3]/td[2]/input"));
//		password.clear();
//		password.sendKeys("bugaluga01", Keys.ENTER);
//	}

//	public void logout() {
//
//		WebElement logout = Driver.getDriver().findElement(By.xpath("//a[7]"));
//		logout.click();
//		WebElement login = Driver.getDriver().findElement(By.xpath("//form/table/tbody/tr[1]/td[1]"));
//		String sair = login.getText();
//		Assert.assertEquals("Login", sair);
//	}

}

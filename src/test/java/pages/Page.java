package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import core.Driver;
import core.Element;

public class Page  {
	
	Element element = new Element();



	public void Clean() {
		WebElement username = Driver.getDriver().findElement(By.xpath(element.getElUsername()));
		username.clear();
		WebElement password = Driver.getDriver().findElement(By.xpath(element.getElPassword()));
		password.clear();
	}

	public void setUsername(CharSequence... usuario) {
		WebElement username = Driver.getDriver().findElement(By.xpath(element.getElUsername()));
		username.sendKeys(usuario);
	}

	public void setPassword(CharSequence... senha) {
		WebElement password = Driver.getDriver().findElement(By.xpath(element.getElPassword()));
		password.sendKeys(senha);
	}

	public void Logout() {
		WebElement logout = Driver.getDriver().findElement(By.xpath(element.getElLogout()));
		logout.click();
		WebElement login = Driver.getDriver().findElement(By.xpath(element.getElLogin()));
		String sair = login.getText();
		Assert.assertEquals("Login", sair);
	}

	public void setVerificarUsuario(String username) {

		WebElement reporter = Driver.getDriver().findElement(By.xpath(element.getElVerificaUsuario()));
		String usuario = reporter.getText();
		Assert.assertEquals(username, usuario);
	}

	public void setProjeto(String projeto) {
		WebElement project = Driver.getDriver().findElement(By.xpath(element.getElSelecaoProjeto()));
		Select projtest = new Select(project);
		// projtest.selectByValue("154"); //Selecionará o projeto através de seu valor
		projtest.selectByVisibleText(projeto);
	}

	public void newIssue() {

		WebElement reportIssue = Driver.getDriver().findElement(By.xpath(element.getElNewIssue()));
		reportIssue.click();

	}

	public void setCategory(String categoria) {

		WebElement category = Driver.getDriver().findElement(By.xpath(element.getElCategoria()));
		Select selecionado = new Select(category);
		selecionado.selectByVisibleText(categoria);
	}

	public void setReproducibility(String reproduzivel) {

		WebElement reproducibility = Driver.getDriver().findElement(By.xpath(element.getElReproducibility()));
		Select selecionado = new Select(reproducibility);
		selecionado.selectByVisibleText(reproduzivel);
	}

	public void setSeveraty(String severidade) {
		WebElement severaty = Driver.getDriver().findElement(By.xpath(element.getElSeveraty()));
		Select selecionado = new Select(severaty);
		selecionado.selectByVisibleText(severidade);
	}

	public void setPriority(String prioridade) {
		WebElement priority = Driver.getDriver().findElement(By.xpath(element.getElPriority()));
		Select selecionado = new Select(priority);
		selecionado.selectByVisibleText(prioridade);
	}

	public void setProfile(String perfil) {
		WebElement profile = Driver.getDriver().findElement(By.xpath(element.getElProfile()));
		Select selecionado = new Select(profile);
		selecionado.selectByVisibleText(perfil);
	}

	public void setSumary(String sumario) {
		WebElement sumary = Driver.getDriver().findElement(By.xpath(element.getElSumary()));
		sumary.sendKeys(sumario);

	}

	public void setDescription(String descricao) {
		WebElement description = Driver.getDriver().findElement(By.xpath(element.getElDescription()));
		description.sendKeys(descricao);

	}

	public void setViewStatus(String opcao) {
		WebElement publico = Driver.getDriver().findElement(By.xpath(element.getElRadio1()));
		WebElement privado = Driver.getDriver().findElement(By.xpath(element.getElRadio2()));
		if (opcao == "public") {
			publico.click();
		} else {
			privado.click();
		}

	}

	public void checkReportStay() {
		if (!Driver.getDriver().findElement(By.id(element.getElReportStay())).isSelected()) {
			
			Driver.getDriver().findElement(By.id(element.getElReportStay())).click();
		}
	}

	public void submitReport() {

		WebElement submit = Driver.getDriver().findElement(By.xpath(element.getElSubmit()));
		submit.click();

	}

	public void submitSuccessful() {

		WebElement sucesso = Driver.getDriver().findElement(By.xpath(element.getElSucesso()));
		String msg = sucesso.getText();
		Assert.assertTrue(msg.contains("successful"));

	}

	public void myView() {

		WebElement view = Driver.getDriver().findElement(By.xpath(element.getElMyView()));
		view.click();

	}
	
	public void reportedByMe() {

		WebElement reported = Driver.getDriver().findElement(By.xpath(element.getElReported()));
		reported.click();

	}
	
	public void applyFilter(CharSequence... issue) {
		WebElement search = Driver.getDriver().findElement(By.xpath(element.getElSearch()));
		search.sendKeys(issue);
	}
	
	public void openIssue() {
		WebElement open = Driver.getDriver().findElement(By.xpath(element.getElClickIssue()));
		open.click();
	}
	
	public void checkIssue() {

		WebElement project = Driver.getDriver().findElement(By.xpath(element.getElProjetoCheck()));
		String projeto = project.getText();
		Assert.assertTrue(projeto.contains("Iuri"));
		WebElement reporter = Driver.getDriver().findElement(By.xpath(element.getElReporterCheck()));
		String relator = reporter.getText();
		Assert.assertTrue(relator.contains("iuri.almeida"));

	}
	
	public void jumpToIssue(String issue) {
		WebElement jump = Driver.getDriver().findElement(By.xpath(element.getElJumpIssue()));
		jump.clear();
		jump.sendKeys(issue);
		jump.sendKeys(Keys.ENTER);
		WebElement id = Driver.getDriver().findElement(By.xpath(element.getElIdIssue()));
		String number = id.getText();
		Assert.assertTrue(number.contains(issue));	
		
	}
	
	public void addNote(String note) {
		WebElement nota = Driver.getDriver().findElement(By.name(element.getElNote()));
		nota.sendKeys(note);
		WebElement submitNote = Driver.getDriver().findElement(By.xpath(element.getElSubmitNote()));
		submitNote.click();
		WebElement checkNote = Driver.getDriver().findElement(By.xpath(element.getElCheckNote()));
		String escrito = checkNote.getText();
		Assert.assertTrue(escrito.contains(note));
		
		
	}
}

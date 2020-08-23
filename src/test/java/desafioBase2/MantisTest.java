package desafioBase2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import core.Driver;

public class MantisTest extends Base {

	@Test
	//Logar no sistema, verificar se houve êxito e fazer logout
	public void loginMantis() {

		login();
		verificarUsuarioLogado();
		logout();

	}

	@Test
	//Acessar o sistema, selecionar um projeto e reportar um issue verificando se houve sucesso
	public void selecionarProjeto() {
		
		login();
		selecionandoProjeto();	
		reportarErro();
		logout();

	}
	
	@Test
	//Pegar os dados de um issue e abrir ele através do botão Jump. Adicionar uma nota ao Issue
	public void jumpToIssue() {
		login();
		adicionarNota();
		logout();
	}
	
	
	@Test
	//Abrir a tela MyView, clicar em Reported by Me, pesquisar um issue e abrí-lo. Fazer verificação dos detalhes
	public void detalharIssue() {
		login();
		detailsIssue();
		logout();
	}
	
	

}

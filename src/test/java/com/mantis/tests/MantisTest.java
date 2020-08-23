package com.mantis.tests;

import org.junit.Test;

public class MantisTest extends BaseTest {

	@Test

	/**
	 * 
	 * Este caso de teste vai acessar a página http://mantis-prova.base2.com.br
	 * 
	 * Inserir os dados de login previamente informados na classe "BaseTest"
	 * 
	 * Verificar se o usuário acessou corretamente o sistema
	 * 
	 * Fazer Logout e verificar se a sessão foi encerrada
	 * 
	 */

	public void test1_AcessarMantis() {

		login();
		verificarUsuarioLogado();
		logout();

	}

	@Test

	/**
	 * 
	 * Este caso de teste vai acessar a página http://mantis-prova.base2.com.br
	 * 
	 * Inserir os dados de login previamente informados na classe "BaseTest"
	 * 
	 * Selecionará um projeto previamente informado na classe BaseTest
	 * 
	 * Reportará um issue preenchendo todos os campos necessários
	 * 
	 * Clicará no botão para reporte do issue e verificará se realmente foi
	 * reportado
	 * 
	 * Fazer Logout e verificar se a sessão foi encerrada
	 * 
	 */

	public void test2_ProjetoReporteIssue() {

		login();
		selecionandoProjeto();
		reportarErro();
		logout();

	}

	@Test

	/**
	 * 
	 * Este caso de teste vai acessar a página http://mantis-prova.base2.com.br
	 * 
	 * Inserir os dados de login previamente informados na classe "BaseTest"
	 * 
	 * Inserir os dados de um issue e realizar uma pesquisa
	 * 
	 * Adicionará uma nota ao issue pesquisado
	 * 
	 * Verificará se a nota foi realmente adicionada
	 * 
	 * Fazer Logout e verificar se a sessão foi encerrada
	 * 
	 */

	public void teste3_JumpToIssue() {
		login();
		adicionarNota();
		logout();
	}

	@Test

	/**
	 * 
	 * Este caso de teste vai acessar a página http://mantis-prova.base2.com.br
	 * 
	 * Inserir os dados de login previamente informados na classe "BaseTest"
	 * 
	 * Acessará a tela MyView e clicará na opção ReportedByMe
	 * 
	 * Pesquisará por um issue previamente informado na classe BaseTest
	 * 
	 * Checar se as informações do issue estão procedentes
	 * 
	 * Fazer Logout e verificar se a sessão foi encerrada
	 * 
	 */

	public void test4_DetalharIssue() {
		login();
		detailsIssue();
		logout();
	}

}

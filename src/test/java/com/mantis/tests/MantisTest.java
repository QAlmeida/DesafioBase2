package com.mantis.tests;

import org.junit.Test;

public class MantisTest extends BaseTest {

	@Test

	/**
	 * 
	 * Este caso de teste vai acessar a p�gina http://mantis-prova.base2.com.br
	 * 
	 * Inserir os dados de login previamente informados na classe "BaseTest"
	 * 
	 * Verificar se o usu�rio acessou corretamente o sistema
	 * 
	 * Fazer Logout e verificar se a sess�o foi encerrada
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
	 * Este caso de teste vai acessar a p�gina http://mantis-prova.base2.com.br
	 * 
	 * Inserir os dados de login previamente informados na classe "BaseTest"
	 * 
	 * Selecionar� um projeto previamente informado na classe BaseTest
	 * 
	 * Reportar� um issue preenchendo todos os campos necess�rios
	 * 
	 * Clicar� no bot�o para reporte do issue e verificar� se realmente foi
	 * reportado
	 * 
	 * Fazer Logout e verificar se a sess�o foi encerrada
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
	 * Este caso de teste vai acessar a p�gina http://mantis-prova.base2.com.br
	 * 
	 * Inserir os dados de login previamente informados na classe "BaseTest"
	 * 
	 * Inserir os dados de um issue e realizar uma pesquisa
	 * 
	 * Adicionar� uma nota ao issue pesquisado
	 * 
	 * Verificar� se a nota foi realmente adicionada
	 * 
	 * Fazer Logout e verificar se a sess�o foi encerrada
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
	 * Este caso de teste vai acessar a p�gina http://mantis-prova.base2.com.br
	 * 
	 * Inserir os dados de login previamente informados na classe "BaseTest"
	 * 
	 * Acessar� a tela MyView e clicar� na op��o ReportedByMe
	 * 
	 * Pesquisar� por um issue previamente informado na classe BaseTest
	 * 
	 * Checar se as informa��es do issue est�o procedentes
	 * 
	 * Fazer Logout e verificar se a sess�o foi encerrada
	 * 
	 */

	public void test4_DetalharIssue() {
		login();
		detailsIssue();
		logout();
	}

}

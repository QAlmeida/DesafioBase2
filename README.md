# Projeto DesafioBase2

> Esse projeto consiste em avaliar a capacidade técnica no quesito de testes automatizados a partir da implementação de um projeto

## Configurando Ambiente

Para configurar o ambiente será necessário baixar algumas ferramentas.

* Java JDK - (https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
    * Baixar o Java referente ao seu Sistema Operacional. Após baixar é só executar a instalação e clicar em Next até o final

* Eclipse IDE - (https://www.eclipse.org/downloads/)
    * Fazer o download referente ao seu Sistema Operacional. Uma vez baixado, o eclipse será uma pasta, talvez zipado e deverá ser descompactado. Dentro desta pasta vai ter o arquivo Eclipse (no caso do Windows será o Eclipse.exe).

> OBS: Junit e Selenium, que são pré-requisitos, já estão inseridos no arquivo "pom.xml" do projeto e serão carregados automaticamente seguindo os próximos passos.

## Descompactar o Projeto

Após baixar o projeto na sua máquina, é recomendado descompactar dentro da pasta "eclipse-workspace", que geralmente fica no caminho detalhado abaixo.

> C:\Users\USUARIO\eclipse-workspace

## Configurando o Projeto

1. Acessar o Eclipse, menu File > Import…

2. Na tela de importação, selecionar a opção “Existing Maven Projects” e clicar em Next. Na próxima visão, no campo “Root Directory” informar o caminho do Workspace (onde você descompactou o projeto) e teclar Enter.

3. Verificar se o projeto está selecionado e clicar em Finish.

4. Após a importação do projeto, clicar com botão direito no projeto e em seguida clicar em Properties.

5. Na tela de Propriedade do projeto, clicar em Java Build Path, selecionar na aba Libraries, o jdk 1.5 e clicar em Remove.
 
6. Em seguida clicar em “Add Library…”, selecionar JRE System Library (caso não esteja selecionada), clicar em Next, selecionar “Workspace default JRE (jdk1.8.0_144)” (ou a versão do Java 8 que você baixou) e clicar em Finish. Depois clicar em Apply.

7. Feito isto, clicar em Java Compiler (no menu esquedo da tela Propriedade) e no ComboBox Compiler compliance level selecionar 1.8 e clicar em Apply.

8. Ainda no menu esquerdo, clicar em Resource e verificar se o Text file encoding está UTF-8. Caso não esteja, selecionar Other e selecionar o UTF-8 no ComboBox, clicar em Apply and Close ou Ok.

9. Clicar com botão direito no projeto e em seguida clicar em Maven > Update Project. 

## Executando os testes

1. De volta no Project Explorer do Eclipse, clicar no Projeto.

2. Clicar em "src/test/java", clicar na seta da pasta.

3. Clicar em "com.mantis.tests", clicar na seta da pasta.

4. Duplo-clique na classe MantisTests.java.

5. Clicar com o botão direito na classe (arquivo) MantisTests.java, ir na opção “Run As” e clicar em “JUnit Test”.

> No final deste processo o sistema deverá abrir o navegador e executar os testes.

## Meta

Iuri Lima de Almeida – [Iuri Almeida - CTFL, SFC™](https://www.linkedin.com/in/iuri-almeida-ctfl-sfc/) – iuri.almeida@yahoo.com

Licença não se aplica.





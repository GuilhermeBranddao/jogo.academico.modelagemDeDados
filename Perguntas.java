package jogoModelagemDeDados;
import java.util.Random;
	public class Perguntas {
		int num;
		public void alternativas() {
			Random aleatorio = new Random();
			
			int valor = aleatorio.nextInt(52); //depois mudar para 52
			System.out.println("________________________________________________________________________________________________________________________________________________________________________________________");
					System.out.println("Pergunta N?° "+valor);
					this.num = valor;
					switch(valor) {
					case 0: System.out.println("Que sorte, Ganhe mais um ponto");break;
					case 1: System.out.println("O que é Modelo de Dados?");break;
					case 2: System.out.println("O que é SGBD?");break;
					case 3: System.out.println("O que é Administrador de dados?");break;
					case 4: System.out.println("Quais as funções do DBA?");break;
					case 5: System.out.println("O que é visões no SGBD?");break;
					case 6: System.out.println("O que é Transação no SGBD?");break;
					case 7: System.out.println("O que é Integridade Referencial no SGBD?");break;
					case 8: System.out.println("O que é Instância no SGBD?");break;
					case 9: System.out.println("O que é Esquema no SGBD?");break;
					case 10: System.out.println("Com relação a arquitetura do banco de dados, o que é nível externo?");break;
					case 11: System.out.println("Com relação a arquitetura do banco de dados, o que é nível interno?");break;
					case 12: System.out.println("Com relação a arquitetura do banco de dados, o que é nível conceitual?");break;
					case 13: System.out.println("Explique o que é DDL?");break;
					case 14: System.out.println("Explique o que é DML?");break;
					case 15: System.out.println("Explique o que é DCL?");break;
					case 16: System.out.println("O que é dado?");break;
					case 17: System.out.println("O que é Informação?");break;
					case 18: System.out.println("O que é dado Persistente?");break;
					case 19: System.out.println("O que é conhecimento?");break;
					case 20: System.out.println("O que é redundância de dados no banco de dados?");break;
					case 21: System.out.println("O que é Inconsistência de dados no banco de dados?");break;
					case 22: System.out.println("O que é compartilhamento de dados no banco de dados?");break;
					case 23: System.out.println("O que é restrição de segurança?");break;
					case 24: System.out.println("O que é Independência dos dados no banco de dados?");break;
					case 25: System.out.println("O que é no Banco de Dados – Padronização de Dados?");break;
					case 26: System.out.println("O que é chave primária?");break;
					case 27: System.out.println("O que é chave estrangeira?");break;
					case 28: System.out.println("O que é Entidade Fraca no MER?");break;
					case 29: System.out.println("O que é Entidade no MER?");break;
					case 30: System.out.println("O que é atributo composto?");break;
					case 31: System.out.println("O que é atributo derivado?");break;
					case 32: System.out.println("O que é Domínio de um Atributo?");break;
					case 33: System.out.println("O que é Chave Candidata?");break;
					case 34: System.out.println("O que é Relacionamento ou Tabela de associação?");break;
					case 35: System.out.println("O que é Cardinalidade do MER?");break;
					case 36: System.out.println("O que é Classe no MER Estendido?");break;
					case 37: System.out.println("O que é Objeto no MER Estendido?");break;
					case 38: System.out.println("O que é especialização no MER Estendido?");break;
					case 39: System.out.println("o que é generalização no MER Estendido?");break;
					case 40: System.out.println("O que é Herança no MER Estendido?");break;
					case 41: System.out.println("O que é Normalização de dados?");break;
					case 42: System.out.println("O que é Dependência funcional?");break;
					case 43: System.out.println("O que é Dependência funcional parcial?");break;
					case 44: System.out.println("O que é dependência funcional transitiva?");break;
					case 45: System.out.println("O que é 1. Forma Normal?");break;
					case 46: System.out.println("O que é 2. Forma Normal?");break;
					case 47: System.out.println("O que é 3. Forma Normal?");break;
					case 48: System.out.println("O que é FNBC – Forma Normal de Boyce-Codd?");break;
					case 49: System.out.println("O que é Dependência Multifuncional?");break;
					case 50: System.out.println("O que é 4. Forma Normal?");break;
					case 51: System.out.println("O que é Dependência de Junção?");break;
					case 52: System.out.println("O que é 5. Forma Normal?");break;
					}
					System.out.println("");
					}
		public void respostas() {
			
				int valor = num;
				System.out.println("");
						System.out.println("Resposta N?° "+valor);
						
						switch(valor) { 
						case 0: System.out.println("Nada");break;
						case 1: System.out.println("É uma definição abstrata, autônoma e lógica dos objetos,\r\n operadores e outros elementos que, juntos,\r\n constituem a máquina abstrata com a qual os usuários interagem.");break;
						case 2: System.out.println("É o software responsável pelo gerenciamento (armazenamento e recuperação)\r\n dos dados no Banco de Dados. (Sistema gerencial de Banco de Dados.)");break;
						case 3: System.out.println("São analistas que identificam os dados a serem armazenados em um banco de\r\n dados e pela forma como estes serão representados. É a pessoa que toma as\r\n decisões estratégicas e de normas com relação aos dados da empresa.");break;
						case 4: System.out.println("1- Definir o esquema conceitual\r\n" + 
								"2 -DBA defini DDL => Ling. defin. Dados\r\n" + 
								"3 - Definir o esquema interno\r\n" + 
								"4 - Qual o Servidor\r\n" + 
								"5 - DDL relacionamentos (campos)\r\n" + 
								"6 - Dar acessos aos dados para usuário	\r\n" + 
								"7 - Definir normas descarga e recarga Backup\r\n" + 
								"8 - Falha de Entrada de dados Contingência\r\n" + 
								"9 -Monitoramento de Desempenho Sintonia fina (tuning) performance\r\n" + 
								"");break;
						case 5: System.out.println("É um conjunto resultado de uma consulta armazenada sobre os dados,\r\n em que os usuários do banco de dados podem consultar simplesmente como eles \r\nfariam em um objeto de coleção de banco de dados persistente.");break;
						case 6: System.out.println("Na área de banco de dados, uma transação é uma sequência de operações num\r\n sistema de gerência de banco de dados que são tratadas como um bloco\r\n único e indivisível (atômico) durante uma recuperação de falhas e também prover isolamento entre acessos concorrentes na mesma massa de dados.");break;
						case 7: System.out.println("Um SGBD deve gerenciar completamente a integridade referencial definida em seu\r\n esquema, sem precisar em tempo algum, do auxílio do programa aplicativo.");break;
						case 8: System.out.println("É onde os dados armazenados em um banco de dados em um determinado instante do\r\n tempo formam um conjunto chamado de “instância do banco de dados”.");break;
						case 9: System.out.println("É a descrição de um banco de dados é chamada de “esquema de um banco de dados”\r\n e é especificada durante o projeto do banco de dados. Geralmente,\r\n poucas mudanças ocorrem no esquema do banco de dados.");break;
						case 10: System.out.println("Modelo Lógico: descrição de como as informações estão organizadas internamente,\r\\ visão do usuário do SGBD;");break;
						case 11: System.out.println("Modelo Físico: descreve os dados no nível mais baixo (interno); trata dos aspectos\r\n de implementação do SGBD.");break;
						case 12: System.out.println("Modelo Conceitual: não contém detalhes sobre a representação em meio físico das informações;");break;
						case 13: System.out.println("Linguagem que define as aplicações. arquivos e campos que irão compor o banco de dados.\r\n São comandos de criação e atualização da estruturas dos campos dos arquivos.");break;
						case 14: System.out.println("Linguagem que define os  comandos de manipulação e operação dos dados \r\n(comandos de consulta e atualização dos dados dos arquivos).");break;
						case 15: System.out.println("Usado para controle de acesso aos dados em um banco de dados. Todos acessos podem ser sobre,\r\n por exemplo, tabelas, views, functions.");break;
						case 16: System.out.println("Dados incluem os itens que representam fatos, textos, gráficos, imagens estáticas, sons,\r\n segmentos de vídeo analógicos ou digitais etc\r\n" + 
								" Os dados são coletados, por meio de processos de processos organizacionais, nos ambientes internos e externos.\r\n" + 
								" Em suma, dados são sinais que não forem processados, correlacionados, integrados, avaliados ou interpretados de qualquer forma. \r\n" + 
								" Os dados representam a matéria-prima a ser utilizada na produção de informação.\r\n" + 
								" Uma definição bem simples de dados é “uma abstração formal que pode ser representada e transformada por um computador” ou seja a sequência de símbolos quantificados ou quantificáveis.\r\n" + 
								"");break;
						case 17: System.out.println("O processo de transformação envolve a aplicação de procedimentos, que incluem\r\n formatação, tradução, fusão, impressão e assim por diante. a maior parte deste processo pode ser executada automaticamente.");break;
						case 18: System.out.println("Um dado que permanece no sistema");break;
						case 19: System.out.println("Definido como sendo “informação que foram analisadas e avaliadas sobre a sua\r\n confiabilidade, sua relevância e sua importância”\r\n" + 
								" É obtido pela interpretação e integração de vários dados e informações.");break;
						case 20: System.out.println("Redundância é o meio mais simples de obter um sistema de alta disponibilidade....\r\n Um exemplo de redundância é no sistema de um Banco. Quando um sistema\r\nsai do ar, automaticamente usa-se a redundância para dar continuidade no\r\n processo que teria sido paralisado.");break;
						case 21: System.out.println("Inconsistência de dados: muitos programadores diferentes e programas implementados\r\n em linguagens diferentes podem gerar arquivos de formatos diferentes.");break;
						case 22: System.out.println("O SGBD deve permitir acesso simultâneo para os usuários acessarem ao mesmo tempo o\r\n banco de dados. Sendo assim os dados sempre tem que estar armazenados\r\n em um único base de dados.");break;
						case 23: System.out.println("A tabela de log deverá registrar as transações de inclusão, alteração e exclusão.");break;
						case 24: System.out.println("São regras impostas para que o banco de dados seja o mais seguro possível.");break;
						case 25: System.out.println("A padronização de objetos em banco de dados é utilizada em larga escala em projetos\r\n onde são utilizados modelos de qualidade como: CMMI, PMI, ISO9005, entre\r\n outros. Muitas das empresas que não possuem esse tipo de metodologia implementada,\r\n constantemente buscam novas práticas de gerenciamento para diminuir seus\r\n custos diretos de desenvolvimento e manutenção de software.");break;
						case 26: System.out.println("Chave primária é simples, ou seja, é formada por um único campo da tabela, esse campo\r\n não pode ter dois ou mais registros de mesmo valor, e também não pode\r\n conter nenhum registro nulo.");break;
						case 27: System.out.println("Coluna de uma tabela que estabelece um relacionamento com a chave primária (PK) de outra tabela\r\n" + 
								" -É a partir da chave estrangeira (FK) que sabemos com qual registro em outra tabela um registro será relacionado");break;
						case 28: System.out.println("Conjunto de entidades que não possui identificação própria.\r\n" + 
								"Entidade que não tem atributos que possam identificá-la univocamente.\r\n" + 
								"Entidades fortes: Possuem identificação própria: chave primária está relacionada\r\n com a chave estrangeira (sempre ocorrerá).\r\n" + 
								"");break;
						case 29: System.out.println("Entidade - Identifica o objeto de interesse do sistema e tem \"vida\" própria, ou seja, a representação\r\n abstrata de um objeto do mundo real sobre o qual desejamos guardar informações.\r\n" + 
								"Modela o “mundo real” como uma coleção de entidades e relacionamentos. \r\n" + 
								"-Entidade: uma “coisa” ou “objeto” no mundo real que é distinguível dos outros objetos.\r\n" + 
								"-Descrito por um conjunto de atributos. \r\n" + 
								"-Relacionamento: uma associação entre várias entidades \r\n" + 
								"-Técnica mais difundida de modelagem conceitual.\r\n" + 
								"");break;
						case 30: System.out.println("Atributo Composto:quando o atributo tem vários subcampos.");break;				
						case 31: System.out.println("Atributo Derivado: quando o valor de um atributo é obtido por meio de valores de outros atributos. Ex: tempo_de_casa pode ser derivado do valor da data_contratação.");break;
						case 32: System.out.println("Domínio do Atributo - Universo de valores que um atributo pode armazenar.\r\n" + 
								"Exemplo:\r\n" + 
								"Conjunto de valores do atributo Sexo do funcionário: M ou F;\r\n" + 
								"Conjunto de valores do atributo Nome do aluno: 40 caracteres alfanumérico.\r\n" + 
								"Conjunto de valores do atributo salário: inteiro maior que 5000\r\n" + 
								"");break;
						case 33: System.out.println("Chave candidata\r\n" + 
								"Chave candidata é um atributo ou um conjunto de atributos de uma tabela que identifica uma única linha da tabela. \r\n" + 
								"A chave primária é extraída a partir do conjunto de chaves candidatas de uma tabela.\r\n" + 
								"");break;
						case 34: System.out.println("Um dado por si só não faz uma informação, pois não tem sentido próprio; é necessário que haja uma associação de dados para que a informação seja obtida. \r\n" + 
								" Os relacionamentos representam fatos ou situações da realidade, onde as entidades interagem de alguma forma.\r\n" + 
								"");break;
						case 35: System.out.println("Cardinalidade é a frequência do relacionamento \r\n" + 
								"Todo campo chave tem a cardinalidade 1 x N.\r\n" + 
								"");break;
						case 36: System.out.println("Classe - Uma classe especifica uma estrutura de dados e os métodos operacionais permissíveis que se aplicam a cada um de seus objetos.\r\n" + 
								"MER Estendido - Introduz uma semântica adicional no MER.");break;
						case 37: System.out.println("Objeto - Um objeto é capaz de armazenar estados através de seus atributos.\r\n" + 
								" -Exemplo de objetos da classe Humanos: João, José, Maria.\r\n" + 
								"");break;
						case 38: System.out.println("Especialização: Resultado da separação de um tipo-entidade de nível mais alto (superclasse), formando vários tipos-entidade de nível mais baixo\r\n (subclasse).\r\n" + 
								"-Existem relacionamentos dos quais participam apenas entidade de alguns subconjuntos específicos.\r\n" + 
								"");break;
						case 39: System.out.println("Pode ser visto como o processo inverso à especificação.\r\n" + 
								"-Resultado de união de dois ou mais tipos entidades de nível mais baixo (subclasse), produzidos um tipo entidade de níveis mais altos (superclasse) \r\n" + 
								"");break;
						case 40: System.out.println("Conjunto de entidades mais específicos herdam todos os atributos do conjunto de entidades mais genérico.\r\n" + 
								"A chave primária dos conjuntos de entidades mais específicos é herdada de conjunto de entidades mais genérico. ou seja, a chave é definida implicante.\r\n" + 
								"");break;
						case 41: System.out.println("Um conjunto de regras para evitar anomalias usando decomposição.\r\n" + 
								"Objetivos:Entender os conceitos, características e regras de modelagem de dados.\r\n" + 
								"Entender e fazer uso das regras de normalização.\r\n" + 
								"4.FN e 5.FN.\r\n" + 
								"");break;
						case 42: System.out.println("Ocorre quando um atributo ou conjunto de atributos depende funcionalmente de outro atributo.");break;
						case 43: System.out.println("Ocorre quando em um identificador composto (concatenado), um atributo ou conjunto de atributos depende de forma parcial deste identificador composto\r\n (concatenado), ou seja apresenta dependência de parte do identificador composto.");break;
						case 44: System.out.println("Uma dependência funcional transitiva ocorre quando uma coluna, além de depender da chave primária da tabela, e depende de outra coluna também Chave\r\n Primária para ter significado.");break;
						case 45: System.out.println("Foi definida para não permitir atributos multivalorados ou atributos compostos.\r\n" + 
								"- Uma está em 1FN se e somente se todos os seus atributos contêm apenas valores atômicos (simples, indivisíveis)\r\n" + 
								" - 1 domínio é atômico se os elementos desse domínio são considerados como unidades indivisíveis.\r\n" + 
								"");break;
						case 46: System.out.println("Estar na 1FN e todos atributos não chave forem totalmente dependentes da chave Primária.\r\n" + 
								"-  Estar na 1.FN e todos atributos não chave Não tem dependência Parcial.\r\n" + 
								"");break;
						case 47: System.out.println(" Uma relação está em 3FN se e somente se estiver na 1FN e na 2FN e, não contém dependências transitivas.");break;
						case 48: System.out.println("Uma tabela está na forma normal de Boyce-Codd quando todo determinante existente na tabela é chave candidata.");break;
						case 49: System.out.println("Consiste em associações de muitos para muitos entre os atributos.");break;
						case 50: System.out.println("Consistem em retirar (decompor) a dependência multifuncional em duas ou mais entidades.");break;
						case 51: System.out.println("É um caso mais raro, uma relação existe uma dependência de junção se, dadas algumas projeções sobre essa relação.\r\n" + 
								"Apenas se reconstrói a relação inicial através de algumas junções bem específicas, mas pode não ser todas relações.\r\n" + 
								"-Deve produzir a instância inicial através de junções de várias tabelas de relacionamento.\r\n" + 
								"");break;
						case 52: System.out.println("Uma relação está 5. FN se ela estiver na 3. FN e existe dependência de Junção para voltar a instância inicial de junção das entidades.");break;	
						}
						System.out.println("");
}
	}

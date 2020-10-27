# CRUD Java com Maven, Hibernate e PostgreSQL

Esse é um projeto em que consiste em um CRUD completo com Cadastro de Clientes na linguagem Java SE (Desktop) utilizando a IDE Netbeans com o padrão de projetos Maven, o banco de dados utilizado é o Postgres e sua persistência se dá pelo framework Hibernate, além de conter relatórios do cadastro de Clientes armazenados no banco de dados.

A tecnologia aplicada no desenvolvimento foi através da linguagem de programação Java na JDK versão 8, IDE Netbeans 8.2, Maven, framework Hibernate 5.1.3, banco de dados Postgres versão 12 e relatório gerado através do jasperreport na IDE JasperSoft Studio versão 6.13.


## Pré Requisitos

Os Pré Requisitos para rodar este projeto são:

- Java JDK 8 ou superior;
- PostgresSQL;
- Netbeans IDE 8.2 ou superior;
- Framework Hibernate.


## Configurando o Projeto

Para iniciarmos será necessário compilar o projeto no Netbeans (Build e Clean) para que as dependências sejam baixadas e instaladas através do arquivo **pom.xml**.

Crie um banco de dados no PostgresSQL com o nome de **martinello**, ou seja, no Postgres iremos criar apenas o banco, pois as tabelas e campos serão criados através do Hibernate com a classe mapeada.

Localize o arquivo **hibernate.cfg.xml** que está na pasta **src/main/resources** e altere em **Propriedades de JDBC** os campos **hibernate.connection.username** e **hibernate.connection.password**, com as suas credenciais do seu servidor PostgresSQL.

Com as configurações realizadas, o seu projeto está pronto para rodar.


## Características do Projeto

O projeto consiste em uma Tela Principal, onde há a opção de acesso a Tela de Cadastro de Clientes, nesta tela há algumas validações:

O campo CPF/CNPJ contém máscaras que alternam de acordo com a escolha de Pessoa Física ou Jurídica, além disso, contém validação de CPF e CNPJ, onde só pode ser inserido CPF e CNPJ legítimos.

O campo CEP utiliza API do ViaCEP, assim, basta digitar o CEP de seu endereço e clicar no botão de pesquisa, que automaticamente irá carregar os campos de Endereço, Complemento, Cidade e UF.

O campo Email contém validação, assim o email deverá ter pelo menos @, . e .com.

O campo Telefone tem máscara para DDD e celular com 9 dígitos.


## Iniciando

O projeto contém a classe Principal que está no pacote com.lucas.projectmartinello, esta classe é responsável por executar o carregamento do JForm ViewPrincipal de nosso projeto.

# vendas
 Spring Boot Expert - JPA, RESTFul API, Security, JWT e Mais

Incluir no arquivo pom.xml o parent:

- Spring Boot Starter Parent

Link: https://mvnrepository.com/

Adicionar também as dependências e builds


Criar a classe Principal: VendasApplication

Adicionar Dependências Starter, dependências mais comums e usadas


Spring Boot Framework


Container IOC (Inversion of Control)

Configuration: classe de configuração
Component: classe com métodos e operações

MVC: Model - View - Controller

```
Container IOC -> @Configuration -> @Bean

Container IOC -> @Component -----> @Controller
                            \----> @Repository
                            \----> @Service
```
Acesso Spring Boot: http://localhost:8080/
Acesso H2: http://localhost:8080/h2-console


Propriedades Spring Boot Properties: https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html

http://localhost:8080/h2-console

create table cliente (
    id int not null primary key,
    nome varchar(100)
)

Spring Boot utiliza HikariCP como DataSource (Pool de conexões): https://github.com/brettwooldridge/HikariCP


# Persistência e Acesso a Dados com Spring Data JPA

## 13. O que Você Será Capaz de Fazer ao Concluir este Módulo

## 14. Configurando e Obtendo Conexões com Bases de Dados

## 15. O Modelo de Negócio

## 16. Scripts de Criação do Banco de Dados

Para criar automaticamente as tabelas ao iniciar o Spring Boot, criar o arquivo data.sql na pasta resource com os scripts.

## 17. Criando as Classes de Modelo

Criados em java/io.github.dougllasfps/domain.entity/

## 18. Salvando e Recuperando Clientes

Criados métodos para listar e criar cliente

## 19. Concluindo o Cadastro de Clientes

Criando métodos para update e delete de cliente

## 20. Mapeando a Entidade Cliente para JPA

Mudando a Classe Cliente incluindo as notations

## 21. Persistindo Entidades com Entity Manager

Refatorado List e Insert

## 22. Refatorando as Outras Operações para o JPA

Refatorado todo o Clientes.java

## 23. Introdução aos Repositórios Spring Data

Limpeza dos Códigos para usar o JPA Repository

## 24. Query Methods

Métodos customizados do JPA

## 25. Logando o SQL Gerado no Console

Inserir as linhas abaixo no application.properties para melhor visualizar os dados:

```
spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.format_sql=true
```

## 26. Trabalhando com @Query

Exemplos de Consultas: JPQL e SQL Nativa

## 27. Mapeando a Entidade Produto

Mapeamento Classe Produto

## 28. Mapeando a Entidade Pedido

Mapeamento Classe Pedido

## 29. Mapeando ItemsPedido

## 30. Criando os Repositorios das Entidades

## 31. Fazendo Consultas com Relacionamentos JPA

## 32. Carregando os Pedidos por Cliente
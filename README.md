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

Para criar automaticamente as tabelas ao iniciar o Spring Boot, criar o arquivo data.sql na pasta resource com os scripts.


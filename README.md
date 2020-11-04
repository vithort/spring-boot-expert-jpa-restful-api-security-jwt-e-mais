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

## 29. Mapeando ItemPedido

Mapeamento Classe ItemPedido

## 30. Criando os Repositorios das Entidades

Criando demais repositórios

## 31. Fazendo Consultas com Relacionamentos JPA

## 32. Carregando os Pedidos por Cliente

Correção da aula anterior...

# Spring Web: Desenvolvimento de API RESTFUL

## 34. Criando o Controller de Clientes

Limpeza do Código VendasApplication e Criação / configuração do Controller

## 35. Mapeando as Requisições com Request Mapping

## 36. Requisição GET com Parâmentros e Response Entity

## 37. Requisicão POST e Request Body

## 38. Delete Mapping: Deletando um Recurso no Servidor

## 39. Put Mapping - Atualizando um Cliente

## 40. Pesquisa de Clientes por Parâmetros

## 41. @ResponseStatus e @RestController: Refatorando API de Clientes

## 42. Testando a Api de Clientes no Postman

## 43. Desafio da API de Produtos

## 44. Implementando a API de Produtos

## 45. Testando a API de Produtos no Postman

## 46. Criação do Controller e Serviço de Pedidos

## 47. Trabalhando com o Modelo DTO

## 48. Utilizando o Projeto Lombok

## 49. Método para Realização de um Pedido

## 50. Realizando um Pedido Através do Postman

## 51. Spring Boot Dev Tools

## 52. Utilizando o Controller Advice e os ExceptionHandlers para Tratar Erros na API

## 53. Obtendo os Detalhes de um Pedido

## 54. Criando o Status do Pedido

## 55. Patch Mapping - Realizando Cancelamento de Pedidos

# Bean Validation

## 57. Utilizando e Testando o Bean Validation

## 58. Validando a Entidade cliente

## 59. Validando a Entidade Produto

## 60. Validando a Entidade Pedido

## 61. Criando uma Annotation de Validação Customizada

## 62. Internacionalização

# Spring Security e JWT

## 64. Adicionando o Módulo Security

## 65. Criando a Classe de Configuração do Security

## 66. Password Encoder

## 67. Configurando Autenticação em Memória

## 68. Configurando a Autorização de URLs

## 69. Configurando as Roles e Authorities

## 70. Autenticação Basic

## 71. Implementação do UserDetailsService

## 72. Implementando o Cadastro de Usuários

## 73. Testando a Autenticação com Cadastro de Usuários

## 74. Introdução ao JWT

## 75. Gerando o Token

## 76. Decodificando o Token

## 77. Implementando o Filtro do JWT

## 78. Finalizando a Configuração do JWT no Spring Security

## 79. Implementando o Método de Autenticação de Usuários

## 80. Testando o Token JWT no Postman

# Migração para o Banco MySQL

## 81. Conectando com o MySQL

## 82. Fazendo a migração para o Banco MySQL

# Documentação de API com SWAGGER

## 83. Configurando o Swagger

## 84. Configurando o Security no Swagger

## 85. Customizando a UI da Documentação da API

# Build e Deploy

## 86. Gerando o JAR

## 87. Gerando um Arquivo WAR

## 88. Profiles Maven para Builds Diferentes

# Bakcend capaz de ler e apresentar dados sobre os gastos do Recife

### Visão Geral
---

Criado em java com o framework SpringBoot, o projeto tem como objetivo ler e apresentar dados sobre os gastos do Recife.

 -> http://dados.recife.pe.gov.br/dataset/despesas-orcamentarias/resource/d4d8a7f0-d4be-4397-b950-f0c991438111


### Sobre o desafio

 [x] Criar um backend capaz de ler e apresentar dados sobre os gastos do Recife.
 [x] Para facilitar o trabalho, os dados foram baixados e imprtados para a criação de um banco de dados em mysql.
 [x] A escolha acima foi feita, por conta das instabilidades contantes na API do Recife.
 [x] O banco de dados foi criado com o nome de **recife_dados**.
 [x] A tabela foi criada com o nome de **despesas_2017**.
 [x] Foram criadas 3 rotas para a apresentação dos dados.
    [x] A primeira rota apresenta todas as despesas líquidas, empenhadas e pagas. agrupadas por categoria. /total-per-category
    [x] A segunda rota apresenta a soma das despesas líquidas, empenhadas e pagas, agrupadas por mês. /total-per-month
    [x] A terceira rota apresenta os valores de receita e despesa, agrupados por fonte. /total-per-source

#### Rotas

> http://localhost:8080/expenses/etotal-per-category;
> http://localhost:8080/expenses/total-per-month;
> http://localhost:8080/expenses/total-per-source;

        
### Tecnologias utilizadas

- [x] Java 17
- [x] SpringBoot
- [x] MySQL
          
### ⚙️ Como executar o backend

``` mvn spring-boot:run ```

### 📚 Documentação

A documentação foi feita com o Swagger e pode ser acessada através do link abaixo:

> http://localhost:8080/swagger-ui/index.html

### 📝 Autor

Brenno Araújo.


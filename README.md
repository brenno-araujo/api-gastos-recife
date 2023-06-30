# Backend capaz de ler e apresentar dados sobre os gastos do Recife

## Visão Geral

Este projeto foi criado em Java com o framework Spring Boot tem como objetivo ler e apresentar dados sobre os gastos do Recife. Os dados foram obtidos a partir do seguinte link: [Dados de Gastos do Recife](http://dados.recife.pe.gov.br/dataset/despesas-orcamentarias/resource/d4d8a7f0-d4be-4397-b950-f0c991438111).

Os dados foram importados para um banco de dados MySQL para facilitar o trabalho, devido às instabilidades constantes na API do Recife. O banco de dados utilizado recebeu o nome de **recife_dados** e a tabela foi nomeada como **despesas_2017**.

Para importar baixar os dados via csv para poder criar a base de dados, basta acessar o seguinte link: [Dados de Gastos do Recife em CSV](http://dados.recife.pe.gov.br/datastore/dump/d4d8a7f0-d4be-4397-b950-f0c991438111?bom=True).

Foram criadas quatro rotas para apresentação dos dados:

- Rota para apresentar todas as despesas líquidas, empenhadas e pagas agrupadas por categoria: `GET /expenses/total-per-category`
- Rota para apresentar a soma das despesas líquidas, empenhadas e pagas agrupadas por mês: `GET /expenses/total-per-month`
- Rota para apresentar os valores de receita e despesa agrupados por fonte: `GET /expenses/info-source`
- Rota para apresentar os valores podendo selecionar o mês: `GET /expenses/total-per-month/{month}`

## Tecnologias utilizadas

- :coffee: Java 17
- :gear: Spring Boot
- :floppy_disk: MySQL

## Como executar o backend

Para executar o backend, execute o seguinte comando: `mvn spring-boot:run`

## Documentação

A documentação foi criada utilizando o Swagger e pode ser acessada no seguinte link: [Documentação Swagger](http://localhost:8080/swagger-ui/index.html)

## Autor

- [Brenno Araújo](https://br.linkedin.com/in/brennoaraujo).

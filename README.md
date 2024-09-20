# Tarefa-POO

Concessionária de Veículos - Modelo Orientado a Objetos em Java
Este projeto implementa um modelo simples de uma concessionária de veículos utilizando conceitos de orientação a objetos (OO) em Java. 

Estrutura do Projeto
O projeto contém as seguintes classes principais:

Produto: Representa um veículo vendido na concessionária.
Concessionaria: Representa a concessionária que vende veículos.
Vendedor: Representa o vendedor que trabalha na concessionária.
Cliente: Representa o cliente que compra veículos na concessionária.
Pessoa: Classe abstrata que define atributos comuns a Vendedor e Cliente, como nome e cpf.
Conceitos Aplicados
Classe: Cada entidade do modelo (Produto, Concessionaria, Vendedor, Cliente) foi implementada como uma classe.
Herança: A classe abstrata Pessoa define atributos comuns (nome e CPF) para Vendedor e Cliente, que a estendem.
Agregação: A relação entre Concessionaria e Produto é uma agregação, onde uma concessionária possui vários veículos, mas os veículos podem existir independentemente.
Composição: A relação entre Concessionaria e Vendedor é uma composição, onde o vendedor faz parte da concessionária e depende dela.
Diagrama UML

Como Funciona
O sistema permite adicionar veículos à concessionária, listar os veículos disponíveis e realizar a compra de um veículo por um cliente. A seguir, uma visão geral das principais funcionalidades:

Concessionaria:

addVeiculo(Produto veiculo): Adiciona um veículo à lista de veículos da concessionária.
removeVeiculo(Produto veiculo): Remove um veículo da lista de veículos.
Vendedor:

verificaProduto(): Verifica se há veículos disponíveis na concessionária.
Cliente:

compraVeiculo(Concessionaria veiculo): Permite ao cliente comprar um veículo de uma concessionária.

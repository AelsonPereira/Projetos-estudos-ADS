<<<<<<< HEAD
# Calculadora Strategy

Aplicação Java para realizar as quatro operações básicas da matemática
(soma, subtração, multiplicação e divisão) entre dois números, utilizando
o **padrão de projeto Strategy**.

## Estrutura do projeto

```
CalculadoraStrategy/
└── src/
    └── com/
        └── fabrica/
            └── calculadora/
                ├── Operacao.java        -> Interface Strategy (contrato das operações)
                ├── Soma.java            -> Estratégia concreta: adição
                ├── Subtracao.java       -> Estratégia concreta: subtração
                ├── Multiplicacao.java   -> Estratégia concreta: multiplicação
                ├── Divisao.java         -> Estratégia concreta: divisão (trata divisão por zero)
                ├── Calculadora.java     -> Contexto do Strategy (delega o cálculo à estratégia atual)
                └── Controle.java        -> Classe de controle (main), instancia e testa tudo
```

## Padrão de projeto aplicado: Strategy

- **Operacao** — interface que define o contrato `calcular(numero1, numero2)`
  que toda estratégia de cálculo deve seguir.
- **Soma, Subtracao, Multiplicacao, Divisao** — implementações concretas da
  interface `Operacao`, cada uma encapsulando o algoritmo de uma operação
  matemática específica.
- **Calculadora** — classe de contexto. Mantém uma referência a uma
  `Operacao` e delega a ela a execução do cálculo, permitindo trocar a
  estratégia em tempo de execução através de `setOperacao(...)`.
- **Controle** — classe de controle com o método `main`, responsável por
  instanciar a `Calculadora` e cada uma das estratégias, alternando entre
  elas e exibindo os resultados no console (inclui também um teste de
  divisão por zero, para validar o tratamento de exceção).

## Como compilar e executar

A partir da raiz do projeto (`CalculadoraStrategy/`):

```bash
javac -d bin src/com/fabrica/calculadora/*.java
java -cp bin com.fabrica.calculadora.Controle
```

## Saída esperada

```
=========================================
 Calculadora - Padrão de Projeto Strategy 
=========================================
Número 1: 10.0
Número 2: 5.0
-----------------------------------------
Soma (+)             => 15.00
Subtração (-)        => 5.00
Multiplicação (*)    => 50.00
Divisão (/)          => 2.00
-----------------------------------------
Testando divisão por zero:
Erro esperado capturado: Não é possível dividir por zero.
=========================================
```
=======
# Projetos-estudos-ADS
Repositório com estudos realizados durante a minha faculdade

# 🏫 Sistema de Gestão de Matrículas - Escola XYZ

[![Java](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

Projeto desenvolvido para automatizar o processo de cadastro e gestão de alunos da **Escola XYZ**, substituindo o formulário impresso por uma solução digital orientada a objetos (POO).

---

## 📌 Sobre o Projeto

O objetivo deste sistema é permitir o cadastro rápido e organizado de novos alunos, coletando informações essenciais de formulário e garantindo o encapsulamento e a estrutura de dados apropriada.

### 📋 Requisitos do Sistema
O sistema realiza o registro dos seguintes campos obrigatoriamente:
* **Nome do aluno**
* **Endereço residencial**
* **Telefone de contato**
* **Endereço de e-mail**
* **Matrícula**

---

## 🏗️ Arquitetura e Estrutura do Código

O projeto foi dividido em etapas claras seguindo o padrão **Entrada, Processamento e Saída**, garantindo legibilidade e boas práticas de Orientação a Objetos:

1. **Entrada de Dados:** Captura interativa via terminal dos dados digitados pelo usuário utilizando a classe `Scanner`.
2. **Processamento:** Instanciação da classe `Aluno` e atribuição dos dados capturados através dos métodos *setters* (Encapsulamento).
3. **Saída de Dados:** Exibição formatada da ficha cadastral na tela através do método `exibirInformacoes()`.

```text
src/
 └── escola/
      ├── Aluno.java       # Classe modelo contendo atributos, encapsulamento e métodos
      └── Principal.java   # Classe principal (Entrada, Processamento e Saída)
>>>>>>> 49b028be1cf06641ecc40508b063c8f6f564daa6

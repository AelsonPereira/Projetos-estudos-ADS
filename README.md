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

## Repositório para Desafio Sintaxe Básica Java

**Introdução**

Este repositório GitHub serve como solução para o Desafio Sintaxe Básica Java da trilha [Trilha Java Básico](https://www.dio.me/) da Digital Innovation One (DIO). O objetivo do desafio é criar um programa em Java que simula a criação de uma conta bancária através da coleta de informações do usuário via terminal.

**Funcionalidades**

O programa implementa as seguintes funcionalidades:

1. **Criação de projeto:** O projeto `ContaBanco` é criado para abrigar a classe `ContaTerminal.java` que contém a lógica principal do programa.
2. **Coleta de dados do usuário:** O programa solicita ao usuário as informações da conta bancária, como número da conta, agência, nome do cliente e saldo, através de prompts no terminal.
3. **Validação de entrada:** O programa implementa validações básicas para garantir que os dados inseridos pelo usuário estejam no formato correto.
4. **Exibição de mensagem de confirmação:** Após a coleta e validação dos dados, o programa exibe uma mensagem de confirmação para o cliente, informando os detalhes da conta criada e o saldo disponível.

**Observações**

* Este repositório apresenta uma solução básica para o desafio. Implementações mais complexas podem incluir recursos adicionais, como validações mais rigorosas, tratamento de erros e interfaces gráficas.
* O código Java foi escrito de forma clara e concisa, utilizando boas práticas de programação.

**Conclusão**

O repositório fornece uma solução completa para o Desafio Sintaxe Básica Java da DIO, demonstrando a compreensão dos conceitos básicos de sintaxe, variáveis, entrada de dados, concatenação e formatação de strings em Java.

**Exemplo de Execução**

```
Programa: Por favor, digite o número da conta:
Usuário: 1234

Programa: Por favor, digite o número da agência:
Usuário: 054-9

Programa: Por favor, digite o nome do cliente:
Usuário: João Silva

Programa: Por favor, digite o saldo inicial:
Usuário: 1500.50

Olá João Silva, obrigado por criar uma conta em nosso banco, sua agência é 0001, conta 12345 e seu saldo R$ 1500.50 já está disponível para saque.
```

**Regras de Negócio**

* **Número da conta:** Deve ser um número inteiro positivo e possuir 4 dígitos.
* **Número da agência:** Deve ser um texto com 4 caracteres alfanuméricos. Ex.: 067-8.
* **Nome do cliente:** Deve ser um texto com no mínimo 3 caracteres.
* **Saldo:** Deve ser um valor decimal positivo.

**Aprimoramentos Futuros**

O programa pode ser aprimorado nas seguintes áreas:

* **Validações mais rigorosas:** As validações de entrada podem ser aprimoradas para garantir que os dados inseridos pelo usuário estejam no formato correto e atendam a regras de negócio mais complexas.
* **Tratamento de erros:** O programa pode ser implementado para tratar de erros de forma robusta, como entrada de dados inválidos ou
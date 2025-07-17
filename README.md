## 🧩 Jogo de Sudoku em Java

Projeto desenvolvido como parte do **Desafio "Criando um Jogo do Sudoku em Java"** do **Bootcamp Back-End Java 2025**, promovido pela **DIO (Digital Innovation One)** em parceria com o **Santander**.

---

## ❓ O que é Sudoku?

**Sudoku** é um quebra-cabeça de lógica com origem no Japão, jogado em um tabuleiro de 9x9 casas, dividido em nove subgrades de 3x3. O objetivo do jogo é preencher todas as células com números de 1 a 9, respeitando as seguintes regras:

- Cada linha deve conter todos os números de 1 a 9, sem repetições;
- Cada coluna deve conter todos os números de 1 a 9, sem repetições;
- Cada uma das nove subgrades 3x3 também deve conter todos os números de 1 a 9, sem repetições.

O Sudoku estimula o raciocínio lógico, a concentração e a resolução de problemas — habilidades essenciais no desenvolvimento de software.

---

## 🎯 Objetivo do Projeto

Este projeto tem como finalidade reforçar os conhecimentos em:

- Programação Orientada a Objetos (POO)
- Estruturas de Dados em Java (como arrays bidimensionais)
- Entrada e saída de dados pelo terminal
- Validação de regras lógicas
- Boas práticas com classes, métodos e organização de código

---

## 💡 Relacionamento com a Aula: Coleções e Stream em Java

Durante a aula sobre **Coleções e Stream**, aprendemos a manipular conjuntos de dados com maior flexibilidade e legibilidade. Embora o Sudoku utilize principalmente arrays fixos, os conceitos de **validação de dados**, **filtragem** e **verificação de duplicidade** são os mesmos aplicados em coleções como `List`, `Set` e `Map`.

➡️ Exemplos práticos de como os conhecimentos da aula se aplicam ao projeto:

- A verificação de valores repetidos em linhas, colunas e blocos 3x3 é análoga ao uso de `Set` para evitar duplicatas.
- A validação de células poderia ser feita com `Stream` para tornar o código mais conciso (ex: `IntStream.range(...)`).
- A organização dos dados do tabuleiro poderia futuramente utilizar `List<List<Integer>>`, ampliando o uso das coleções da linguagem.

> 💭 **Dica:** Para evoluir o projeto, experimente usar `HashSet` para validar se há duplicatas nas linhas/colunas/blocos com mais eficiência!

---

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/SeuUsuario/sudoku-java.git
   cd sudoku-java
Compile os arquivos:

javac SudokuBoard.java SudokuGame.java Main.java

Execute o jogo:

java Main

📷 Exemplo no Terminal

      1 2 3   4 5 6   7 8 9
   
     +-------+-------+-------+
  
1    | 5 3   |   7   |       | 

2    | 6     | 1 9 5 |       | 

3    |   9 8 |       |   6   | 

  +-------+-------+-------+

...
📚 Aprendizados
✅ Prática com estrutura de dados e validação lógica
✅ Consolidação dos conceitos de POO com múltiplas classes
✅ Integração entre entrada de usuário, verificação e atualização do estado
✅ Aplicação de boas práticas de codificação

🛠 Tecnologias Utilizadas
Java 8+

Terminal / Console

Paradigma de Programação Orientada a Objetos (POO)

✍️ Autor
Projeto desenvolvido por [Seu Nome] durante o bootcamp Back-End Java 2025 da Digital Innovation One (DIO).

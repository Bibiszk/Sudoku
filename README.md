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

## 📷 Exemplo no Terminal

```bash
Execute o jogo:

          S U D O K U   -   E X E M P L O

        C1 C2 C3   C4 C5 C6   C7 C8 C9
            +-------+-------+-------+-
         L1 |  5 3 _ | _ 7 _ | _ _ _ |
         L2 |  6 _ _ | 1 9 5 | _ _ _ |
         L3 |  _ 9 8 | _ _ _ | _ 5 _ |
            +-------+-------+-------+-
         L4 |  8 _ _ | _ 6 _ | _ _ 3 |
         L5 |  4 _ _ | 8 _ 3 | _ _ 1 |
         L6 |  7 _ _ | _ 2 _ | _ _ 6 |
            +-------+-------+-------+-
         L7 |  _ 6 _ | _ _ _ | 2 8 _ |
         L8 |  _ _ _ | 4 1 9 | _ _ 5 |
         L9 |  _ _ _ | _ 8 _ | _ 7 9 |
            +-------+-------+-------+-
🔍 As células vazias estão representadas por "_" para facilitar a visualização dos espaços que o jogador deve preencher.

## 📚 Aprendizados
✅ Prática com estrutura de dados e validação lógica
✅ Consolidação dos conceitos de POO com múltiplas classes
✅ Integração entre entrada de usuário, verificação e atualização do estado
✅ Aplicação de boas práticas de codificação

🛠 Tecnologias Utilizadas
Java 8+

Terminal / Console

Paradigma de Programação Orientada a Objetos (POO)

## ✍️ Autor
Projeto desenvolvido por [Seu Nome] durante o bootcamp Back-End Java 2025 da Digital Innovation One (DIO).

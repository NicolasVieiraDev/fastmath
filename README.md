FastMath

O FastMath é uma ferramenta educativa que automatiza cálculos de Matemática e Física do Ensino Médio.
A proposta é transformar fórmulas reais em operações diretas, organizadas e rápidas — sem depender de calculadoras genéricas.

Este projeto foi criado como meu primeiro sistema real em Java, com foco em POO, modularização e separação de responsabilidades.

🚀 Funcionalidades

Cálculos de Física (MRU, MRUV, força, energia etc.)

Cálculos matemáticos comuns no ensino médio

Estrutura 100% orientada a objetos

Terminal simples e direto

Arquitetura preparada para expansão futura (GUI, Web e novos módulos)

---

🛠️ Tecnologias

Java 17

IntelliJ IDEA

Git & GitHub

<img align="left" width="30" style="margin-right:10px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" />
<img align="left" width="30" style="margin-right:10px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-original.svg" />

<br/><br/>

---

📦 Arquitetura do Projeto
src/
 └── fastmath/
      ├── application/
      │    ├── FastMathApp.java   # Núcleo da aplicação
      │    └── Main.java          # Ponto de entrada
      │
      ├── util/
      │    └── InputUtils.java    # Controle de entrada de dados
      │
      ├── physics/
      │    ├── Mru.java           # Cálculo de MRU
      │    └── ...                # Outros módulos físicos
      │
      └── math/
           └── ...                # Módulos matemáticos


Pontos fortes da arquitetura:

Responsabilidade única

Pacotes separados por domínio

Código limpo e fácil de expandir

---

▶️ Como Executar
# Clone o repositório
git clone https://github.com/NicolasVieiraDev/fastmath

# Abra no IntelliJ e execute:
src/fastmath/application/Main.java


O programa roda direto no terminal da IDE.

----

📸 Demonstração

<img width="800" alt="FastMath Screenshot" src="https://github.com/user-attachments/assets/9a4f59d3-6a0a-43a8-871d-66ab88a228b6" />
👤 Autor

Nicolas Vieira
Estudante de Engenharia de Software | Java Developer em formação
LinkedIn: https://www.linkedin.com/in/nicolas-vieira-bb3514335/

GitHub: https://github.com/NicolasVieiraDev

---

⭐ Contribuição

Sugestões e melhorias são bem-vindas.
Sinta-se livre para abrir issues e pull requests.

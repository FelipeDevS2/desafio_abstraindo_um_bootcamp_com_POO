# Desafio: abstraindo um bootcamp usando Orientação a Objeto em Java

## Descrição do Projeto

Este projeto em Java foi desenvolvido como resposta a um desafio proposto no bootcamp Backend Java realizado pela [Digital 
Inovation One (DIO)](https://web.dio.me/). Consiste em abstrair com base em Orientação a Objetos as classes, atributos 
 e métodos de um bootcamp. O projeto inclui métodos que permitem desenvolvedores se inscreverem em bootcamps, concluir
conteúdos (cursos e mentorias), e acumularem experiência (XP). O projeto aplica os quatro pilares da Programação Orientada 
a Objetos (POO): abstração, encapsulamento, herança e polimorfismo.

## Detalhamento das Classes

### Classe `Bootcamp`

A classe `Bootcamp` representa um programa de treinamento com as seguintes propriedades e métodos:

- **Propriedades**:
    - `nome`: Nome do bootcamp.
    - `descricao`: Descrição do bootcamp.
    - `dataInicial`: Data de início do bootcamp.
    - `dataFinal`: Data de término do bootcamp.
    - `devsInscritos`: Conjunto de desenvolvedores inscritos.
    - `devsConcluintes`: Conjunto de desenvolvedores que concluíram o bootcamp.
    - `conteudos`: Conjunto de conteúdos do bootcamp.

- **Métodos**:
    - Construtor `Bootcamp(String nome, String descricao)`: Inicializa um novo bootcamp.
    - `getNome()`: Retorna o nome do bootcamp.
    - `getDescricao()`: Retorna a descrição do bootcamp.
    - `getDataInicial()`: Retorna a data inicial do bootcamp.
    - `getDataFinal()`: Retorna a data final do bootcamp.
    - `getDevsInscritos()`: Retorna os desenvolvedores inscritos.
    - `getConteudos()`: Retorna os conteúdos do bootcamp.
    - `setConteudos(Conteudo conteudo)`: Adiciona um conteúdo ao bootcamp.
    - `getDevsConcluintes()`: Retorna os desenvolvedores que concluíram o bootcamp.
    - `equals(Object o)`: Compara dois objetos `Bootcamp` para igualdade.
    - `hashCode()`: Retorna o código hash do objeto `Bootcamp`.
    - `toString()`: Retorna uma representação em string do objeto `Bootcamp`.

### Classe `Conteudo`

A classe abstrata `Conteudo` representa um conteúdo genérico (curso ou mentoria) com as seguintes propriedades e métodos:

- **Propriedades**:
    - `titulo`: Título do conteúdo.
    - `descricao`: Descrição do conteúdo.
    - `cargaHoraria`: Carga horária do conteúdo.
    - `XP_PADRAO`: XP padrão para cálculo.

- **Métodos**:
    - Construtor `Conteudo(String titulo, String descricao, int cargaHoraria)`: Inicializa um novo conteúdo.
    - `calcularXP()`: Método abstrato para calcular o XP do conteúdo.
    - `getTitulo()`: Retorna o título do conteúdo.
    - `getDescricao()`: Retorna a descrição do conteúdo.
    - `getCargaHoraria()`: Retorna a carga horária do conteúdo.

### Classe `Curso`

A classe `Curso` herda de `Conteudo` e representa um curso com as seguintes propriedades e métodos:

- **Métodos**:
    - Construtor `Curso(String titulo, String descricao, int cargaHoraria)`: Inicializa um novo curso.
    - `calcularXP()`: Calcula o XP do curso.
    - `toString()`: Retorna uma representação em string do curso.

### Classe `Mentoria`

A classe `Mentoria` herda de `Conteudo` e representa uma mentoria com as seguintes propriedades e métodos:

- **Propriedades**:
    - `dataInicial`: Data de início da mentoria.
    - `dataFinal`: Data de término da mentoria.

- **Métodos**:
    - Construtor `Mentoria(String titulo, String descricao, int cargaHoraria, LocalDate dataInicial, LocalDate dataFinal)`: Inicializa uma nova mentoria.
    - `getDataInicial()`: Retorna a data inicial da mentoria.
    - `getDataFinal()`: Retorna a data final da mentoria.
    - `calcularXP()`: Calcula o XP da mentoria.
    - `toString()`: Retorna uma representação em string da mentoria.

### Classe `Dev`

A classe `Dev` representa um desenvolvedor inscrito em um bootcamp com as seguintes propriedades e métodos:

- **Propriedades**:
    - `nome`: Nome do desenvolvedor.
    - `bootcamp`: Bootcamp ao qual o desenvolvedor está inscrito.
    - `conteudosInscritos`: Conjunto de conteúdos inscritos.
    - `conteudosConcluidos`: Conjunto de conteúdos concluídos.

- **Métodos**:
    - Construtor `Dev(String nome)`: Inicializa um novo desenvolvedor.
    - `getNome()`: Retorna o nome do desenvolvedor.
    - `inscrverBootcamp(Bootcamp bootcamp)`: Inscreve o desenvolvedor em um bootcamp.
    - `progredir()`: Marca o próximo conteúdo como concluído.
    - `calcularTotalXP()`: Calcula o XP total acumulado pelo desenvolvedor.
    - `adicionarAosConcluintes(Dev dev)`: Adiciona o desenvolvedor à lista de concluintes do bootcamp.
    - `getConteudosInscritos()`: Retorna os conteúdos inscritos.
    - `getConteudosConcluidos()`: Retorna os conteúdos concluídos.
    - `equals(Object o)`: Compara dois objetos `Dev` para igualdade.
    - `hashCode()`: Retorna o código hash do objeto `Dev`.
    - `toString()`: Retorna uma representação em string do desenvolvedor.

---

## Princípios de POO Aplicados

### Abstração:
As classes Bootcamp, Conteudo, Curso, Dev e Mentoria abstraem conceitos do domínio do problema, focando apenas
nos atributos e métodos essenciais.

### Encapsulamento:
Atributos privados e métodos públicos (getters e setters) garantem o encapsulamento dos dados.

### Herança:
Conteudo é uma superclasse abstrata para Curso e Mentoria, permitindo a reutilização de código.

### Polimorfismo:
Métodos abstratos e coleções genéricas permitem que diferentes tipos de objetos sejam tratados de forma uniforme.


## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.



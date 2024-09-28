# Depth First Search (DFS) - Busca em Profundidade
Este projeto implementa o algoritmo de Busca em Profundidade (DFS) em Java. A DFS é um algoritmo de travessia de grafos que começa em um nó de origem e explora o máximo possível ao longo de cada ramo antes de retroceder. Neste exemplo, a estrutura de grafo é representada por vértices conectados e a busca é implementada utilizando uma pilha.

## Estrutura do Projeto
- **Vertex**: Representa um vértice no grafo, com um nome, uma lista de vizinhos (arestas que conectam a outros vértices) e um status de visitação.
- **DepthFirstSearch**: Implementa o algoritmo DFS. Ele utiliza uma pilha para realizar a travessia do grafo de forma iterativa, ao invés da abordagem recursiva usual.
- **App**: O ponto de entrada do programa, onde são criados os vértices e a estrutura do grafo é montada. O DFS é então executado a partir de um conjunto de vértices.

## Como Funciona
1. Estrutura do Grafo:

- Os vértices (nós) são representados pela classe Vertex. Cada vértice tem uma lista de vizinhos (outros vértices conectados a ele).
- A função addNeighbor é usada para adicionar conexões (arestas) entre os vértices.

2. Busca em Profundidade (DFS):

- O algoritmo DFS é executado pela classe DepthFirstSearch. Ele percorre os vértices do grafo, explorando cada vértice e seus vizinhos de maneira profunda antes de voltar.
- A DFS é controlada por uma pilha. Cada vez que um vértice é visitado, ele é marcado como "visitado" e seus vizinhos são empilhados para visitação futura.
- A travessia continua até que todos os vértices acessíveis tenham sido visitados.

3. App.java:

- No App, um grafo simples é criado, conectando os vértices:
  - A está conectado a B e C.
  - C está conectado a D, e D está conectado a E.
- A lista de vértices é então passada para o método dfs, que executa a busca.

## Exemplo de Grafo Criado:
```mathematic
A
/   \
B     C
|
D
|
E
```
A DFS começa no vértice A, explora B, e em seguida explora C, D, e E.

## Saída Esperada:
Quando o programa é executado, ele realiza a DFS e imprime os vértices na ordem em que são visitados:

```mathematic
A
C
D
E
B
```

## Instalação e Execução

1. Clone o repositório:

```bash
git clone https://github.com/RobsonTrasel/depth-first-search.git
cd depth-first-search
```
2. Compile o código:

```bash
javac -d bin src/com/robsonf/*.java
```

3. Execute o programa:

```bash
java -cp bin com.robsonf.App
```
A saída mostrará os vértices do grafo conforme eles são visitados pelo algoritmo DFS.

### Observações
Este é um exemplo simples de DFS, adequado para aprendizado. Para grafos maiores ou mais complexos, pode ser necessário otimizar o código.
O algoritmo DFS pode ser implementado de forma recursiva ou iterativa (c**omo neste exemplo,** usando uma pilha).
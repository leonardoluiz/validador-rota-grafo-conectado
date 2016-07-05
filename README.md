## Problema

Dada uma lista de estados da federação, não ordenada, validar se é possível traçar uma rota contínua, passando por todos os estados, através das suas
fronteiras territoriais.

## Solução

Considerando cada estado como um vertice a as fronteiras entre eles como sendo arestas, podemos utilizar a teoria dos grafos para
resolver o problema acima.

Se o grafo formado pelos estados e suas fronteiras for um grafo conexo a rota é válida caso contrário a rota é inválida.

Para validar se o grafo é conectado podemos fazer uma busca em largura (Breadth-first search)
e caso o número de vértices (estados) visitados seja igual ao número todas de estados da rota, podemos considerar a rota como válida.

## Código

### EstadoRepositorio.java

Foi criado um repositório "mock" para representar a fonte de dados de estados e fronteiras.

### ValidadorFronteira.java

Implementação do algorítimo

### Testes unitários para validação do algorítmo.

ValidadorTeste.java

### Como executar

Pré-requisitos: JDK e maven.

Para executar use o comando: **mvn test**
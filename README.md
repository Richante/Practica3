#Práctica 3: ##Entrega 3:

Practica 3

Este código define una clase llamada Graph, que representa un grafo no dirigido. Un grafo es una estructura de datos que consta de un conjunto de vértices y un conjunto de aristas que conectan esos vértices. Cada vértice está representado por un objeto de tipo V, que es un tipo genérico. La clase Graph tiene los siguientes métodos públicos:

addVertex(V v): añade un vértice al grafo. Si el vértice ya existe en el grafo, no se añade y el método devuelve false. Si el vértice no existía en el grafo, se añade y el método devuelve true.
addEdge(V v1, V v2): añade una arista entre dos vértices del grafo. Si alguno de los vértices no existe en el grafo, se añade antes de añadir la arista. Si la arista ya existía en el grafo, no se añade y el método devuelve false. Si la arista no existía en el grafo, se añade y el método devuelve true.
obtainAdjacents(V v): devuelve un conjunto de los vértices adyacentes al vértice v en el grafo. Si el vértice no existe en el grafo, se lanza una excepción.
containsVertex(V v): devuelve true si el vértice v existe en el grafo, false en caso contrario.
toString(): devuelve una cadena de texto que representa el grafo en formato de lista de adyacencia.
onePath(V v1, V v2): devuelve una lista que representa un camino entre los vértices v1 y v2. El camino es calculado usando el algoritmo de búsqueda en profundidad (DFS). Si no existe un camino entre los vértices, devuelve null.


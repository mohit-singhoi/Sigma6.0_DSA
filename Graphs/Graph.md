## What is a Graph?

A **Graph** is a non-linear data structure consisting of a set of **vertices (nodes)** and **edges** that connect pairs of vertices.

Graphs are used to represent relationships between objects, such as:
- Social Networks
- Maps and Navigation Systems
- Computer Networks
- Recommendation Systems

---

## Basic Terminology

### 1. Vertex (Node)
A point in the graph.

Example:
A, B, C, D

### 2. Edge
A connection between two vertices.

Example:
A ── B

### 3. Degree
Number of edges connected to a vertex.

### 4. Path
A sequence of vertices connected by edges.

### 5. Cycle
A path that starts and ends at the same vertex.

---

## Graph Representation

### Example Graph

```
      A
     / \
    B   C
   / \
  D   E
```

Vertices = {A, B, C, D, E}

Edges = {(A,B), (A,C), (B,D), (B,E)}

---

## Types of Graphs

### 1. Undirected Graph

Edges have no direction.

```
A ----- B
|       |
|       |
C ----- D
```

---

### 2. Directed Graph (Digraph)

Edges have direction.

```
A ---> B
|      ^
|      |
v      |
C ---> D
```

---

### 3. Weighted Graph

Edges contain weights (cost, distance, etc.).

```
A --5-- B
|       |
2       3
|       |
C --4-- D
```

---

### 4. Cyclic Graph

Contains at least one cycle.

```
A ---- B
|      |
|      |
D ---- C
```

Cycle:
A → B → C → D → A

---

### 5. Acyclic Graph

Contains no cycles.

```
A
|
B
|
C
|
D
```

---

## Graph Representation Methods

### 1. Adjacency Matrix

For Graph:

```
A --- B
|     |
|     |
C --- D
```

|   | A | B | C | D |
|---|---|---|---|---|
| A | 0 | 1 | 1 | 0 |
| B | 1 | 0 | 0 | 1 |
| C | 1 | 0 | 0 | 1 |
| D | 0 | 1 | 1 | 0 |

**Space Complexity:** O(V²)

---

### 2. Adjacency List

```
A → B, C
B → A, D
C → A, D
D → B, C
```

**Space Complexity:** O(V + E)

---

## Graph Traversal

### 1. Breadth First Search (BFS)

Visits nodes level by level.

Example:

```
      A
     / \
    B   C
   / \
  D   E
```

Traversal:

```
A → B → C → D → E
```

Uses:
- Queue
- Shortest path in unweighted graphs

Time Complexity: O(V + E)

---

### 2. Depth First Search (DFS)

Visits nodes as deep as possible before backtracking.

Traversal:

```
A → B → D → E → C
```

Uses:
- Stack (or Recursion)
- Cycle Detection
- Topological Sorting

Time Complexity: O(V + E)

---

## Applications of Graphs

1. Social Media Networks
2. Google Maps Navigation
3. Computer Networks
4. Web Page Ranking
5. Recommendation Systems
6. Airline Route Systems
7. Network Routing
8. Dependency Management

---

## Advantages

- Represents complex relationships efficiently.
- Supports various traversal algorithms.
- Useful in real-world network problems.

---

## Disadvantages

- Can consume large memory for dense graphs.
- Some graph algorithms are computationally expensive.

---

## Complexity Summary

| Operation | Complexity |
|------------|------------|
| BFS | O(V + E) |
| DFS | O(V + E) |
| Adjacency Matrix Space | O(V²) |
| Adjacency List Space | O(V + E) |

---

## Key Points

- Graph = Vertices + Edges
- Graphs can be Directed or Undirected
- Graphs can be Weighted or Unweighted
- BFS uses Queue
- DFS uses Stack/Recursion
- Adjacency List is generally preferred for sparse graphs
- Adjacency Matrix is preferred for dense graphs
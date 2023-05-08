package com.practica3;

import java.util.*;

public class Graph<V> {
    
    private Map<V, Set<V>> adjacencyList = new HashMap<>();

    public boolean addVertex(V v) {
        if (adjacencyList.containsKey(v)) {
            return false;
        }
        adjacencyList.put(v, new HashSet<V>());
        return true;
    }

    public boolean addEdge(V v1, V v2) {
        if (!adjacencyList.containsKey(v1)) {
            adjacencyList.put(v1, new HashSet<V>());
        }
        if (!adjacencyList.containsKey(v2)) {
            adjacencyList.put(v2, new HashSet<V>());
        }
        return adjacencyList.get(v1).add(v2);

    }

    public Set<V> obtainAdjacents(V v) throws Exception {
        if (!adjacencyList.containsKey(v)) {
            throw new Exception("No existe el vértice " + v);
        }
        return adjacencyList.get(v);
    }

    public boolean containsVertex(V v) {
        return adjacencyList.containsKey(v);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (V v : adjacencyList.keySet()) {
            sb.append(v.toString() + ": ");
            Set<V> adj = adjacencyList.get(v);
            for (V w : adj) {
                sb.append(w.toString() + ", ");
            }
            sb.append("\n");
        }
        return sb.toString();

    }

    public List<V> onePath(V v1, V v2) {
        Map<V, V> trace = new HashMap<>();
        trace.put(v1, null);
        if (onePathHelper(v1, v2, trace)) {
            List<V> path = new ArrayList<>();
            V v = v2;
            while (v != null) {
                path.add(v);
                v = trace.get(v);
            }
            Collections.reverse(path);
            return path;
        } else {
            return null;
        }
    }
    
    private boolean onePathHelper(V current, V destination, Map<V, V> trace) {
        if (current.equals(destination)) {
            return true;
        }
        for (V s : adjacencyList.get(current)) {
            if (!trace.containsKey(s)) {
                trace.put(s, current);
                if (onePathHelper(s, destination, trace)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    }

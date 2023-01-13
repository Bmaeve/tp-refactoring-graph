package org.acme.graph.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Path {
    private List<Edge> edges;

    public Path(List<Edge> e) {
        this.edges = e;
    }

    public double getLength() {
        double sum = 0;
        for (Edge e : this.edges) {
            sum += e.getCost();
        }
        return sum;
    }

    public Edge getEdgeN(int n) {
        return this.edges.get(n);
    }

    public List<Edge> getEdges() {
        return this.edges;
    }
}

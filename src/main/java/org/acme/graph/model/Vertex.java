package org.acme.graph.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.locationtech.jts.geom.Coordinate;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Un sommet dans un graphe
 * 
 * @author MBorne
 *
 */
public class Vertex {

	/**
	 * Identifiant du sommet
	 */
	private String id;

	/**
	 * Position du sommet
	 */
	private Coordinate coordinate;

	/**
	 * dijkstra - Liste des edges entrants
	 */
	private List<Edge> inEdges;

	/**
	 * dijkstra - Liste des edges sortants
	 */
	private List<Edge> outEdges;

	Vertex() {
		this.inEdges = new ArrayList<>();
		this.outEdges = new ArrayList<>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	@JsonIgnore
	public List<Edge> getInEdges() {
		return this.inEdges;
	}

	@JsonIgnore
	public List<Edge> getOutEdges() {
		return this.outEdges;
	}

	@Override
	public String toString() {
		return id;
	}

}

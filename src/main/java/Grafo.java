import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultDirectedGraph;

public class Grafo {
	private static int v;
	public LinkedList<String> adj[];
	/** criação do meu grafo sempre do mesmo jeito **/
	
	public Grafo(int v) {
		this.v = v;
		adj = new LinkedList[v];
		
		for(int i = 0; i <v; i++) {
			adj[i] = new LinkedList();
		}
		
	}
	
	public void setVertice(int v) {
		this.v = v;
	}

	public int getVertice() {
		return v;
	}
	
	 
	void addEdge(int v, String w) {
		adj[v].add(w);
		}

/** Até aqui foi minha classe Grafoh para eu conseguir adicionar eles certinho, vc é foda */
	public static void main(String[] args) {
	DefaultDirectedGraph < Integer , String > g = new  DefaultDirectedGraph< Integer, String>(String.class);
	
	g.addVertex(1); g.addVertex(2); g.addVertex(3); g.addVertex(4); g.addVertex(5); g.addVertex(6); g.addVertex(7); g.addVertex(8);
	g.addVertex(9); g.addVertex(10); g.addVertex(11); g.addVertex(12); g.addVertex(13); g.addVertex(14); g.addVertex(15); g.addVertex(16);
	g.addVertex(17); g.addVertex(18); g.addVertex(0); g.addVertex(19);
	
	
	g.addEdge(0, 1, "Cantinho da Criança");
	g.addEdge(1, 2, "Fraldário");
	g.addEdge(1, 8, "Kids Car");
	g.addEdge(2, 3, "WC Família");
	g.addEdge(3, 4, "Ambulatório");
	g.addEdge(4, 5, "Colombo");
	g.addEdge(5, 6, "Elevador");
	g.addEdge(6, 7, "Hering");
	g.addEdge(6, 10, "Empório Santa");
	g.addEdge(6, 9, "Empório Santa");
	g.addEdge(7, 9, "Kids Car");
	g.addEdge(9, 8,"Kids Car");
	g.addEdge(8, 1,"Cantinho da Criança");
	g.addEdge(8, 2,"Fraldário");
	g.addEdge(8, 3,"WC Família");
	g.addEdge(8, 4,"Ambulatório");
	g.addEdge(8, 9,"Kids Car");
	g.addEdge(9, 10,"Empório Santa");
	g.addEdge(10, 11,"Cema V");
	g.addEdge(11, 12, "Burger King");
	g.addEdge(12, 13, "R&B Acessório");
	g.addEdge(13, 14, "Suissa");
	g.addEdge(13, 16, "Triton");
	g.addEdge(13, 15, "Saraiva");
	g.addEdge(13, 17, "White Platunu");
	g.addEdge(13, 18, "MC Donald's");
	g.addEdge(14, 13, "Suissa");
	g.addEdge(14, 15, "Triton");
	g.addEdge(14, 16, "Grão Expresso");
	g.addEdge(15, 14, "Triton");
	g.addEdge(15, 16, "Grão Expresso");
	g.addEdge(15, 17, "Saraiva");
	g.addEdge(16, 15, "Triton");
	g.addEdge(16, 15, "Saraiva");
	g.addEdge(16, 19, "Grão Expresso");
	g.addEdge(17, 15, "Saraiva");
	g.addEdge(17, 18, "White Platunu");
	g.addEdge(18, 13, "MC Donald's");
	g.addEdge(18, 17, "White Platunu");
	
	
	System.out.println(" Mapeamento dos grafos de pontos");
	System.out.println("Grafo: " + g.toString());
	System.out.println();
	

	DijkstraShortestPath<Integer, String> dijkstraShortestPath = new DijkstraShortestPath<Integer, String>(g);
	List<Integer>shortestPath = dijkstraShortestPath.getPath(1, 13).getVertexList();
	System.out.println(shortestPath);
	
}
}


import java.util.*;

public class DeverKA11 {

	
	public static void main(String[] args) {
	
		String[] vertices = {"Harry Potter", "Hermione Granger", "Neville Longbottom", "Ron Weasley", "Luna Lovegood"};
		
	
		int[][] edges = {
				{0, 1}, {0, 2}, {0, 3}, {0, 4},
				{1, 0}, {1, 2}, {1, 3},
				{2, 0}, {2, 1}, {2, 3},
				{3, 0}, {3, 1}, {3, 2}, {3, 4},
				{4, 0}, {4, 3} };
		
		Graph <String> PartyGraph = new UnweightedGraph<>(vertices, edges);
		System.out.println("The number of verticies in the party graph is " + PartyGraph.getSize());
		System.out.println("The value at the first index is " + PartyGraph.getVertex(0));
		System.out.println("The value at the last index is " + PartyGraph.getVertex(4));
		
		UnweightedGraph<String>.SearchTree dfs = PartyGraph.dfs(PartyGraph.getIndex("Harry Potter"));
		
		java.util.List<Integer> searchOrders = dfs.getSearchOrder();
		System.out.println(dfs.getNumberOfVerticesFound() + " vertices are searched in this DFS order: ");
		for(int i =0; i < searchOrders.size(); i++) {
			if (dfs.getParent(i) != -1) {
				System.out.println("parent of " + PartyGraph.getVertex(i) +
					" is " + PartyGraph.getVertex(dfs.getParent(i)));
			
				
			}
		}
	}
}

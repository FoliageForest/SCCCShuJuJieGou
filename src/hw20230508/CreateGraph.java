package hw20230508;

import java.util.Scanner;

public class CreateGraph {
    public int vertexListIndex(Graph graph, String str) { // line: 12
        for (int i = 0; i < graph.vertexNum; i++) {
            if (graph.vertexList.get(i).vertexName.equals(str)) {
                return i;
            }
        }
        return -1;
    } // line: 19

    public void initialGraph(Graph graph) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("有向图顶点数: ");
        graph.vertexNum = scanner.nextInt();
        System.out.print("有向图边数: ");
        graph.edgeNum = scanner.nextInt();

        System.out.println("顶点名称:");
        for (int i = 0; i < graph.vertexNum; i++) {
            Vertex vertex = new Vertex();
            vertex.vertexName = scanner.next();
            vertex.firstEdge = null;
            graph.vertexList.add(vertex);
        }

        System.out.println("边:");
        for (int i = 0; i < graph.edgeNum; i++) {
            String preV = scanner.next();
            String folV = scanner.next();
            int v1 = vertexListIndex(graph, preV);
            int v2 = vertexListIndex(graph, folV);
            if (v1 == -1 || v2 == -1) System.out.println("输入有误");
            Edge edge1 = new Edge();
            edge1.edgeInt = v2;
            edge1.next = graph.vertexList.get(v1).firstEdge;
            graph.vertexList.get(v1).firstEdge = edge1;
        }
    }

    public void outputGraph(Graph graph) {
        Edge edge;
        System.out.println("邻接表示:");
        for (int i = 0; i < graph.vertexNum; i++) {
            System.out.print(graph.vertexList.get(i).vertexName);
            edge = graph.vertexList.get(i).firstEdge;
            while (edge != null) {
                System.out.print(" --> " + graph.vertexList.get(edge.edgeInt).vertexName);
                edge = edge.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CreateGraph createGraph = new CreateGraph();
        Graph graph = new Graph();
        createGraph.initialGraph(graph);
        createGraph.outputGraph(graph);
    }
}

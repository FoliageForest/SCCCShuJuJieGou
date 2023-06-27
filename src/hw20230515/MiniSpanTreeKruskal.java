package hw20230515;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;

/*
四川化院数据结构课程, 课堂演示代码, 做了部分修改
 */

public class MiniSpanTreeKruskal {
    private final List<Edge> edgeList = new ArrayList<>();
    private int[][] matrix;

    public static void main(String[] args) {
        MiniSpanTreeKruskal graph = new MiniSpanTreeKruskal();
        graph.createEdges();
        graph.createGraph();
        graph.kruskal();
    }

    private void createGraph() {
        this.matrix = new int[9][9];
        for (int i = 0; i < this.matrix.length; i++) {
            Arrays.fill(this.matrix[i], MAX_VALUE);
            this.matrix[i][i] = 0;
        }
        for (Edge edge : this.edgeList) {
            this.matrix[edge.getBegin()][edge.getEnd()] = edge.getWeight();
            this.matrix[edge.getEnd()][edge.getBegin()] = edge.getWeight();
        }
    }

    private void createEdges() {
        Edge v0 = new Edge(4, 7, 7);
        Edge v1 = new Edge(2, 8, 8);
        Edge v2 = new Edge(0, 1, 10);
        Edge v3 = new Edge(0, 5, 11);
        Edge v4 = new Edge(1, 8, 12);
        Edge v5 = new Edge(3, 7, 16);
        Edge v6 = new Edge(1, 6, 16);
        Edge v7 = new Edge(5, 6, 17);
        Edge v8 = new Edge(1, 2, 18);
        Edge v9 = new Edge(6, 7, 19);
        Edge v10 = new Edge(3, 4, 20);
        Edge v11 = new Edge(3, 8, 21);
        Edge v12 = new Edge(2, 3, 22);
        Edge v13 = new Edge(3, 6, 24);
        Edge v14 = new Edge(4, 5, 26);

        this.edgeList.add(v0);
        this.edgeList.add(v1);
        this.edgeList.add(v2);
        this.edgeList.add(v3);
        this.edgeList.add(v4);
        this.edgeList.add(v5);
        this.edgeList.add(v6);
        this.edgeList.add(v7);
        this.edgeList.add(v8);
        this.edgeList.add(v9);
        this.edgeList.add(v10);
        this.edgeList.add(v11);
        this.edgeList.add(v12);
        this.edgeList.add(v13);
        this.edgeList.add(v14);

    }

    private void kruskal() {
        // 不知道怎么实现的
        int[] parent = new int[9];
        int sum = 0;
        for (int i = 0; i < this.edgeList.size(); i++) {
            Edge edge = this.edgeList.get(i);
            int beginParent = findParent(parent, edge.getBegin());
            int endParent = findParent(parent, edge.getEnd()); // line: 98

            if (beginParent != endParent) {
                parent[beginParent] = endParent;
                System.out.println("(" + edge.getBegin() + "," + edge.getEnd() + ")" + edge.getWeight());
                sum += edge.getWeight(); // line: 105
            }
        }
        System.out.println("权值总和为: " + sum);
    }

    private int findParent(int[] parent, int index) {
        while (parent[index] > 0) {
            index = parent[index];
        }
        return index;
    }

}

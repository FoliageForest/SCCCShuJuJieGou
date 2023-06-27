package hw20230515;

import java.util.ArrayList;

public class Test {
    private final ArrayList<Graph> testKruskalGraphList = new ArrayList<>();
    private final ArrayList<Graph> testGraphAddEdgeGraphList = new ArrayList<>();

    private Test() {
        this.init1();
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("源图: " + test.testKruskalGraphList.get(0));
        System.out.println("最小生成树: " + test.testKruskalGraphList.get(0).myGraphKruskal());
        System.out.println("参考的最小生成树: " + "Graph{ (4, 7, 7), (2, 8, 8), (0, 1, 10), (0, 5, 11), (1, 8, 12), (3, 7, 16), (1, 6, 16), (6, 7, 19) }");
        System.out.println("权重: " + test.testKruskalGraphList.get(0).myGraphKruskal().getWeightSum());
        System.out.println("===========");
        System.out.println("源图: " + test.testKruskalGraphList.get(1));
        System.out.println("最小生成树: " + test.testKruskalGraphList.get(1).myGraphKruskal());
        System.out.println("参考的最小生成树: " + "Graph{ (0, 2, 1), (3, 5, 2), (1, 4, 3), (2, 5, 4), (1, 2, 5) }");
        System.out.println("权重: " + test.testKruskalGraphList.get(1).myGraphKruskal().getWeightSum());
    }

    private void init1() {
        // 测试数据 01, index: 0
        Graph graph = new Graph(9);

        graph.addEdge(4, 7, 7);
        graph.addEdge(2, 8, 8);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 5, 11);
        graph.addEdge(1, 8, 12);
        graph.addEdge(3, 7, 16);
        graph.addEdge(1, 6, 16);
        graph.addEdge(5, 6, 17);
        graph.addEdge(1, 2, 18);
        graph.addEdge(6, 7, 19);
        graph.addEdge(3, 4, 20);
        graph.addEdge(3, 8, 21);
        graph.addEdge(2, 3, 22);
        graph.addEdge(3, 6, 24);
        graph.addEdge(4, 5, 26);

        this.testKruskalGraphList.add(graph);

        // 测试数据 02, index: 1
        graph = new Graph(6);

        graph.addEdge(0, 2, 1);
        graph.addEdge(3, 5, 2);
        graph.addEdge(1, 4, 3);
        graph.addEdge(2, 5, 4);
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 5);
        graph.addEdge(0, 1, 6);
        graph.addEdge(2, 4, 6);
        graph.addEdge(4, 5, 6);

        this.testKruskalGraphList.add(graph);
    }

    private void init2Manual() {
        Graph graph = new Graph(2);
        graph.addEdge(0, 1, 1);
        this.testGraphAddEdgeGraphList.add(graph);

        graph = new Graph(3);
        graph.addEdge(0, 1, 1);
        graph.addEdge(1, 2, 2);
        this.testGraphAddEdgeGraphList.add(graph);

        graph = new Graph(4);
        graph.addEdge(0, 1, 1);
        graph.addEdge(1, 2, 2);
        graph.addEdge(2, 3, 3);
        this.testGraphAddEdgeGraphList.add(graph);
    }

    private void init2AutoGenerate() {
        for (int edgesSize = 1; edgesSize < 2; edgesSize++) { // edgesSize: Graph 中 edges 的不同大小
            for (int lastIndex = 0; lastIndex < edgesSize; lastIndex++) { // lastIndex: 最后加入的 edge 对应索引
                init2AutoAddGraph(edgesSize, lastIndex);
            }
        }
    }

    private void init2AutoAddGraph(int edgesSize, int lastIndex) {
        Graph graph = new Graph(edgesSize + 1);
        for (int i = 0; i < edgesSize; i++) {
            if (i == lastIndex) continue;
            graph.addEdge(i, i + 1, i + 1);
        }
        graph.addEdge(lastIndex, lastIndex + 1, lastIndex + 1);
        this.testGraphAddEdgeGraphList.add(graph);
    }
}

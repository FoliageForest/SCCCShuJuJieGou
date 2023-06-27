package hw20230515;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;

public class Graph {
    private final ArrayList<Edge> edges = new ArrayList<>();
    private final int[][] matrix;

    public Graph(int vertexNum) {
        this.matrix = new int[vertexNum][vertexNum];
        for (int i = 0; i < this.matrix.length; i++) {
            Arrays.fill(this.matrix[i], MAX_VALUE);
            this.matrix[i][i] = 0;
        }
    }

    /**
     * 添加边。添加边时自动按权值排序
     */
    public void addEdge(int begin, int end, int weight) {
        // 自动按 weight 排序
        Edge newEdge = new Edge(begin, end, weight);
        this.matrix[begin][end] = weight;
        this.matrix[end][begin] = weight;

        for (int i = 0; i < this.edges.size(); i++) {
            Edge edge = this.edges.get(i);
            if (weight > edge.getWeight()) continue;
            this.edges.add(i, newEdge);
            return;
        }
        this.edges.add(newEdge);
    }

    public int getWeightSum() {
        int returnInt = 0;
        for (Edge edge : this.edges) {
            returnInt += edge.getWeight();
        }
        return returnInt;
    }

    public Graph myGraphKruskal2() {
        int[] refInts = new int[this.matrix.length + 1];
        Arrays.fill(refInts, 0);
        Graph returnGraph = new Graph(this.matrix.length);
        for (Edge edge : this.edges) {
            int begin = edge.getBegin();
            int end = edge.getEnd();
            int weight = edge.getWeight();

            if (refInts[begin] == 0 && refInts[end] == 0) {
                refInts[this.matrix.length]++;
                refInts[begin] = refInts[this.matrix.length];
                refInts[end] = refInts[this.matrix.length];
            } else if (refInts[begin] == 0) {
                // refInts[begin] == 0 && refInts[end] != 0
                refInts[begin] = refInts[end];
            } else if (refInts[end] == 0) {
                // refInts[begin] != 0 && refInts[end] == 0
                refInts[end] = refInts[begin];
            } else if (refInts[begin] != refInts[end]) {
                // refInts[begin] != 0 && refInts[end] != 0 && refInts[begin] != refInts[end]
                int searchInt = refInts[end];
                for (int i = 0; i < refInts.length; i++) {
                    if (refInts[i] == searchInt) {
                        refInts[i] = refInts[begin];
                    }
                }
            } else {
                // refInts[begin] != 0 && refInts[end] != 0 && refInts[begin] == refInts[end]
                continue;
            }
            returnGraph.addEdge(begin, end, weight);
        }
        return returnGraph;
    }

    public Graph myGraphKruskal() {
        Graph returnGraph = new Graph(this.matrix.length);
        int[] parents = new int[this.matrix.length];
        for (Edge edge : this.edges) {
            int beginRoot = findRoot(parents, edge.getBegin());
            int endRoot = findRoot(parents, edge.getEnd());

            if (beginRoot != endRoot) {
                parents[beginRoot] = endRoot;
                returnGraph.addEdge(edge.getBegin(), edge.getEnd(), edge.getWeight());
            }
        }
        return returnGraph;
    }

    private int findRoot(int[] parents, int nodeIndex) {
        while (parents[nodeIndex] > 0) {
            nodeIndex = parents[nodeIndex];
        }
        return nodeIndex;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder("Graph{ ");
        boolean boo = false;
        for (Edge edge : this.edges) {
            if (boo) {
                stringBuffer.append(", (");
            } else {
                stringBuffer.append("(");
                boo = true;
            }
            stringBuffer.append(edge.getBegin());
            stringBuffer.append(", ");
            stringBuffer.append(edge.getEnd());
            stringBuffer.append(", ");
            stringBuffer.append(edge.getWeight());
            stringBuffer.append(")");
        }
        stringBuffer.append(" }");
        return String.valueOf(stringBuffer);
    }
}

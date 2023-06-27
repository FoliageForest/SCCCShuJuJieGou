package hw20230515;

public class Edge {
    private final int begin;
    private final int end;
    private final int weight;

    public Edge(int begin, int end, int weight) {
        // 左顶点标号小于右顶点标号
        if (begin > end) {
            int temp = end;
            end = begin;
            begin = temp;
        }
        this.begin = begin;
        this.end = end;
        this.weight = weight;
    }

    public int getBegin() {
        return begin;
    }

    public int getEnd() {
        return end;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Edge{" + "begin=" + begin + ", end=" + end + ", weight=" + weight + '}';
    }
}

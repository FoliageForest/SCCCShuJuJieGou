package hw20230424;// package

import java.util.ArrayList;

class TestNode {
    // zhishi
    private String data;
    // zhushi
    private TestNode lchild;
    // zhs
    private TestNode rchild;

    TestNode() {
    }

    TestNode(String data) {
        this.data = data;
    }

    TestNode(String data, TestNode lchild, TestNode rchild) {
        this.data = data;
        this.lchild = lchild;
        this.rchild = rchild;
    }

    // Getter and Setter


    public String getData() {
        return data;
    }

    public TestNode getLchild() {
        return this.lchild;
    }

    public TestNode getRchild() {
        return this.rchild;
    }
}

public class ariBinaryTreetest { // line: 39
    private String s = "";
    private TestNode root;

    public void createTree(String str) { // line: 46
        ArrayList<String> operList = new ArrayList<>();
        ArrayList<TestNode> numList = new ArrayList<>(); // line: 49
        for (int i = 0; i < str.length(); i++) { // line: 51
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                s += ch;
            } else {
                numList.add(new TestNode(s));
                s = "";
                operList.add(ch + "");
            }
        } // line: 62
        numList.add(new TestNode(s)); // line: 64
        while (operList.size() > 0) { // line: 66
            TestNode left = numList.remove(0);
            TestNode right = numList.remove(0);
            String oper = operList.remove(0); // line: 70
            TestNode runNode = new TestNode(oper, left, right);
            numList.add(0, runNode); // line: 73
        }
        root = numList.get(0);
    }

    public void output() {
        output(root);
    }

    public void output(TestNode node) { // line: 87
        if (node.getLchild() != null) {
            output(node.getLchild());
        }
        System.out.print(node.getData());
        if (node.getRchild() != null) {
            output(node.getRchild());
        } // line: 97
    }

    public static void main(String[] args) { // line: 102
        ariBinaryTreetest tree = new ariBinaryTreetest();
        tree.createTree("1*2+3-4");
        System.out.print("ÖÐÐò: ");
        tree.output();
    }

}

package dsa.example.tree;

public class TNode {

    private int data;
    private TNode leftNode;
    private TNode rightNode;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TNode leftNode) {
        this.leftNode = leftNode;
    }

    public TNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TNode rightNode) {
        this.rightNode = rightNode;
    }
}

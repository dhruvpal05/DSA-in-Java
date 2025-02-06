public class Node {
    int data;
    int hd;
    Node left, right;

    public Node(int data) {
        this.data = data;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}

package br.com.s2it.binarytree;

/**
 * @author lucas.souza
 */
public class Node {

    private Integer value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    void setValue(Integer value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    void setRight(Node right) {
        this.right = right;
    }

}

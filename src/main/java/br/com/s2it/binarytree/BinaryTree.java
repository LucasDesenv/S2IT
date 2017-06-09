package br.com.s2it.binarytree;

/**
 * @author lucas.souza
 */
public class BinaryTree {

    private Node root;

    public BinaryTree(Node node) {
        this.root = node;
    }

    public Integer sumOfAllNodes() {
        Integer sumLeft = sumAllNodesInTheLeft(this.root.getLeft());
        Integer sumRight = sumAllNodesInTheRight(this.root.getRight());
        return sumRight + sumLeft + root.getValue();
    }

    private Integer sumAllNodesInTheRight(Node startingNode) {
        Integer sum = 0;
        while (startingNode != null) {
            sum += startingNode.getValue();
            startingNode = startingNode.getRight();
        }
        return sum;
    }

    private Integer sumAllNodesInTheLeft(Node startingNode) {
        Integer sum = 0;
        while (startingNode != null) {
            sum += startingNode.getValue();
            startingNode = startingNode.getLeft();
        }
        return sum;
    }

    public void insert(Integer value) {
        fillTheTree(root, value);
    }

    private void fillTheTree(Node node, Integer value) {
        if (value < node.getValue()) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(value));
            } else {
                fillTheTree(node.getLeft(), value);
            }
            return;
        }

        if (node.getRight() == null) {
            node.setRight(new Node(value));
        } else {
            fillTheTree(node.getRight(), value);
        }
    }

    public Node getRoot() {
        return root;
    }
    //
    // public Node findMyNode(Integer value) {
    // if (value < root.getValue()) {
    // return findInTheLeft(root, value);
    // }
    // return findInTheRight(root, value);
    // }
    //
    // private Node findInTheRight(Node node, Integer value) {
    // if (node == null) {
    // throw new IllegalArgumentException("Node not found!");
    // }
    // if (value.compareTo(node.getValue()) == 0) {
    // return node;
    // }
    // return findInTheRight(node.getRight(), value);
    // }
    //
    // private Node findInTheLeft(Node node, Integer value) {
    // if (node == null) {
    // throw new IllegalArgumentException("Node not found!");
    // }
    // if (value.compareTo(node.getValue()) == 0) {
    // return node;
    // }
    // return findInTheRight(node.getLeft(), value);
    // }

}

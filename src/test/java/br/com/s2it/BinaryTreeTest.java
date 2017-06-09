package br.com.s2it;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.com.s2it.binarytree.BinaryTree;
import br.com.s2it.binarytree.Node;

/**
 * @author lucas.souza
 */
public class BinaryTreeTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void mustInsertNewNodeInTheLeft() {
        BinaryTree binaryTree = new BinaryTree(new Node(Integer.MAX_VALUE));
        binaryTree.insert(958);
        Assertions.assertThat(binaryTree.getRoot().getLeft().getValue()).isEqualTo(958);
        Assertions.assertThat(binaryTree.getRoot().getRight()).isNull();
    }

    @Test
    public void mustInsertNewNodeInTheRight() {
        BinaryTree binaryTree = new BinaryTree(new Node(Integer.MIN_VALUE));
        binaryTree.insert(958);
        Assertions.assertThat(binaryTree.getRoot().getRight().getValue()).isEqualTo(958);
        Assertions.assertThat(binaryTree.getRoot().getLeft()).isNull();
    }

    @Test
    public void mustInsertNewNodeInTheRightAndLeft() {
        BinaryTree binaryTree = new BinaryTree(new Node(9));
        binaryTree.insert(10);
        binaryTree.insert(8);
        Assertions.assertThat(binaryTree.getRoot().getRight().getValue()).isEqualTo(10);
        Assertions.assertThat(binaryTree.getRoot().getLeft().getValue()).isEqualTo(8);
    }

    @Test
    public void mustInsertManyChildNodes() {
        BinaryTree binaryTree = new BinaryTree(new Node(9));
        binaryTree.insert(10);
        binaryTree.insert(8);
        binaryTree.insert(7);
        binaryTree.insert(17);
        Assertions.assertThat(binaryTree.getRoot().getRight().getValue()).isEqualTo(10);
        Assertions.assertThat(binaryTree.getRoot().getRight().getRight().getValue()).isEqualTo(17);
        Assertions.assertThat(binaryTree.getRoot().getLeft().getValue()).isEqualTo(8);
        Assertions.assertThat(binaryTree.getRoot().getLeft().getLeft().getValue()).isEqualTo(7);
    }

    // @Test
    // public void mustFindMyNodeInTheRight() {
    // BinaryTree binaryTree = new BinaryTree(new Node(9));
    // binaryTree.insert(10);
    // binaryTree.insert(8);
    // final Node nodeFound = binaryTree.findMyNode(10);
    // Assertions.assertThat(nodeFound.getValue()).isEqualTo(10);
    // }
    //
    // @Test
    // public void mustFindMyNodeInTheLeft() {
    // BinaryTree binaryTree = new BinaryTree(new Node(9));
    // binaryTree.insert(10);
    // binaryTree.insert(8);
    // final Node nodeFound = binaryTree.findMyNode(8);
    // Assertions.assertThat(nodeFound.getValue()).isEqualTo(8);
    // }
    //
    // @Test
    // public void mustThrowExceptionWhenNodeInTheLeftNotFound() {
    // BinaryTree binaryTree = new BinaryTree(new Node(9));
    // binaryTree.insert(10);
    // binaryTree.insert(8);
    // expectedException.expect(IllegalArgumentException.class);
    // expectedException.expectMessage("Node not found!");
    // binaryTree.findMyNode(1);
    // }
    //
    // @Test
    // public void mustThrowExceptionWhenNodeInTheRightNotFound() {
    // BinaryTree binaryTree = new BinaryTree(new Node(9));
    // binaryTree.insert(10);
    // binaryTree.insert(8);
    // expectedException.expect(IllegalArgumentException.class);
    // expectedException.expectMessage("Node not found!");
    // binaryTree.findMyNode(47);
    // }

    @Test
    public void mustSumAllNodesChild() {
        BinaryTree binaryTree = new BinaryTree(new Node(9));
        binaryTree.insert(10);
        binaryTree.insert(5);
        final Integer sum = binaryTree.sumOfAllNodes();
        Assertions.assertThat(sum).isEqualTo(24);
    }

    @Test
    public void mustSumAllNodesWhenNoChild() {
        BinaryTree binaryTree = new BinaryTree(new Node(9));
        final Integer sum = binaryTree.sumOfAllNodes();
        Assertions.assertThat(sum).isEqualTo(9);
    }
}

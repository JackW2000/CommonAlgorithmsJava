package com.jackw.structures;

/**
 * The Node class represents a node in a doubly linked list. It contains a value and references to
 * the previous and next nodes in the list.
 */
public class Node {

  private int value;
  private Node previousNode;
  private Node nextNode;

  /**
   * Constructs a Node with the specified value.
   *
   * @param value the value of the node
   */
  public Node(int value) {
    this.value = value;
  }

  /**
   * Returns the previous node.
   *
   * @return the previous node
   */
  public Node getPreviousNode() {
    return previousNode;
  }

  /**
   * Sets the previous node.
   *
   * @param previousNode the node to set as the previous node
   */
  public void setPreviousNode(Node previousNode) {
    this.previousNode = previousNode;
  }

  /**
   * Returns the next node.
   *
   * @return the next node
   */
  public Node getNextNode() {
    return nextNode;
  }

  /**
   * Sets the next node.
   *
   * @param nextNode the node to set as the next node
   */
  public void setNextNode(Node nextNode) {
    this.nextNode = nextNode;
  }

  /**
   * Returns the value of the node.
   *
   * @return the value of the node
   */
  public int getValue() {
    return value;
  }

  /**
   * Sets the value of the node.
   *
   * @param value the value to set
   */
  public void setValue(int value) {
    this.value = value;
  }
}

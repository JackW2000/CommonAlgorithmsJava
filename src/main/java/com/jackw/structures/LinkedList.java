package com.jackw.structures;

import java.util.logging.Logger;

/**
 * The LinkedList class represents a doubly linked list data structure. It provides methods to
 * manipulate the list, such as appending, prepending, and removing nodes.
 */
public class LinkedList {
  static Logger logger = Logger.getLogger("Main");
  private Node firstNode;
  private Node lastNode;
  private int listLength;

  /**
   * Constructs a LinkedList with an initial node.
   *
   * @param node the initial node of the linked list
   */
  public LinkedList(Node node) {
    this.firstNode = node;
    this.lastNode = node;
    this.listLength = 1;
  }

  /**
   * Returns the first node of the linked list.
   *
   * @return the first node
   */
  public Node getFirstNode() {
    return firstNode;
  }

  /**
   * Sets the first node of the linked list.
   *
   * @param firstNode the node to set as the first node
   */
  public void setFirstNode(Node firstNode) {
    this.firstNode = firstNode;
  }

  /**
   * Returns the last node of the linked list.
   *
   * @return the last node
   */
  public Node getLastNode() {
    return lastNode;
  }

  /**
   * Sets the last node of the linked list.
   *
   * @param lastNode the node to set as the last node
   */
  public void setLastNode(Node lastNode) {
    this.lastNode = lastNode;
  }

  /**
   * Returns the length of the linked list.
   *
   * @return the length of the list
   */
  public int getListLength() {
    return listLength;
  }

  /** Increments the length of the linked list by 1. */
  public void incrementListLength() {
    this.listLength += 1;
  }

  /** Decrements the length of the linked list by 1. */
  public void decrementListLength() {
    this.listLength -= 1;
  }

  /**
   * Appends a node to the end of the linked list.
   *
   * @param node the node to append
   */
  public void appendNode(Node node) {
    node.setPreviousNode(this.getLastNode());
    this.getLastNode().setNextNode(node);
    this.setLastNode(node);
    this.incrementListLength();
  }

  /**
   * Appends a node with a specified value to the end of the linked list.
   *
   * @param value the value of the node to append
   */
  public void appendNodeByValue(int value) {
    Node node = new Node(value);
    node.setPreviousNode(this.getLastNode());
    this.getLastNode().setNextNode(node);
    this.setLastNode(node);
    this.incrementListLength();
  }

  /**
   * Inserts a node at the beginning of the linked list.
   *
   * @param node the node to prepend
   */
  public void prependNode(Node node) {
    node.setNextNode(this.getFirstNode());
    this.getFirstNode().setPreviousNode(node);
    this.setFirstNode(node);
    this.incrementListLength();
  }

  /**
   * Inserts a node with a specified value at the beginning of the linked list.
   *
   * @param value the value of the node to prepend
   */
  public void prependNodeByValue(int value) {
    Node node = new Node(value);
    node.setNextNode(this.getFirstNode());
    this.getFirstNode().setPreviousNode(node);
    this.setFirstNode(node);
    this.incrementListLength();
  }

  /** Removes the first node from the linked list. */
  public void removeFirstNode() {
    logger.info("Removed node value: " + this.getFirstNode().getValue());
    this.setFirstNode(this.getFirstNode().getNextNode());
    this.getFirstNode().setPreviousNode(null);
    this.decrementListLength();
  }

  /** Removes the last node from the linked list. */
  public void removeEndNode() {
    logger.info("Removed node value: " + this.getLastNode().getValue());
    this.setLastNode(this.getLastNode().getPreviousNode());
    this.getLastNode().setNextNode(null);
    this.decrementListLength();
  }

  /** Prints the values of all nodes in the linked list. */
  public void printLinkedList() {
    String formattedLogMessage;
    logger.info("Linked list values:");
    if (this.getFirstNode() != null) {
      Node currentNode = this.getFirstNode();
      int counter = 0;
      while (currentNode.getNextNode() != null) {
        formattedLogMessage = String.format("%s: %s", counter, currentNode.getValue());
        logger.info(formattedLogMessage);
        currentNode = currentNode.getNextNode();
        counter++;
      }
      formattedLogMessage = String.format("%s: %s", counter, currentNode.getValue());
      logger.info(formattedLogMessage);
    }
  }
}

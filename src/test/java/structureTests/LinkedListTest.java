package structureTests;

import com.jackw.structures.LinkedList;
import com.jackw.structures.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListTest {

    @Test
    void whenAppendNodeCalled_thenNodeAddedToLinkedList() {
        Node nodeA = new Node(10);
        LinkedList link = new LinkedList(nodeA);

        link.printLinkedList();

        link.appendNode(new Node(20));

        assertEquals(10, link.getFirstNode().getValue());
        assertEquals(20, link.getLastNode().getValue());
        assertEquals(2, link.getListLength());
    }

    @Test
    void whenPrependNodeCalled_thenNodeAddedToLinkedList() {
        Node nodeA = new Node(10);
        LinkedList link = new LinkedList(nodeA);

        link.printLinkedList();

        link.prependNode(new Node(20));

        assertEquals(10, link.getLastNode().getValue());
        assertEquals(20, link.getFirstNode().getValue());
        assertEquals(2, link.getListLength());
    }

    @Test
    void whenRemoveFirstNodeCalled_thenFirstNodeRemovedFromLinkedList() {
        Node nodeA = new Node(10);
        LinkedList link = new LinkedList(nodeA);

        link.printLinkedList();

        link.prependNode(new Node(20));

        assertEquals(10, link.getLastNode().getValue());
        assertEquals(20, link.getFirstNode().getValue());
        assertEquals(2, link.getListLength());

        link.removeFirstNode();

        assertEquals(10, link.getFirstNode().getValue());
        assertEquals(1, link.getListLength());
    }

    @Test
    void whenRemoveEndNodeCalled_thenEndNodeRemovedFromLinkedList() {
        Node nodeA = new Node(10);
        LinkedList link = new LinkedList(nodeA);

        link.printLinkedList();

        link.prependNode(new Node(20));

        assertEquals(10, link.getLastNode().getValue());
        assertEquals(20, link.getFirstNode().getValue());
        assertEquals(2, link.getListLength());

        link.removeEndNode();

        assertEquals(20, link.getFirstNode().getValue());
        assertEquals(1, link.getListLength());
    }

    @Test
    void whenAppendNodeByValueCalled_thenNodeAddedToLinkedList() {
        Node nodeA = new Node(10);
        LinkedList link = new LinkedList(nodeA);

        link.printLinkedList();

        link.appendNodeByValue(20);

        assertEquals(10, link.getFirstNode().getValue());
        assertEquals(20, link.getLastNode().getValue());
        assertEquals(2, link.getListLength());
    }

    @Test
    void whenPrependNodeByValueCalled_thenNodeAddedToLinkedList() {
        Node nodeA = new Node(10);
        LinkedList link = new LinkedList(nodeA);

        link.printLinkedList();

        link.prependNodeByValue(20);

        assertEquals(10, link.getLastNode().getValue());
        assertEquals(20, link.getFirstNode().getValue());
        assertEquals(2, link.getListLength());
    }
}

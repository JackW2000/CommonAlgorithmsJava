package structureTests;

import com.jackw.structures.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class NodeTest {

    @Test
    void whenNodeIsInitialisedWithValue_thenGetValueReturnsThatValue() {
        Node nodeA = new Node(10);

        assertEquals(10, nodeA.getValue());
    }

    @Test
    void whenNodeIsInitialisedWithValueAndThenUpdated_thenGetValueReturnsUpdatedValue() {
        Node nodeA = new Node(10);

        nodeA.setValue(20);

        assertEquals(20, nodeA.getValue());
    }

    @Test
    void whenSetNextNodeCalled_thenNodeAfterCurrentIsAsExpected() {
        Node nodeA = new Node(10);
        Node nodeB = new Node(20);

        nodeA.setNextNode(nodeB);

        assertEquals(nodeB, nodeA.getNextNode());
    }

    @Test
    void whenPreviousNextNodeCalled_thenNodeBeforeCurrentIsAsExpected() {
        Node nodeA = new Node(10);
        Node nodeB = new Node(20);

        nodeA.setPreviousNode(nodeB);

        assertEquals(nodeB, nodeA.getPreviousNode());
    }

    @Test
    void whenGetNextNodeCalledAndNextNodeIsNull_thenNullIsReturned() {
        Node nodeA = new Node(10);

        assertNull(nodeA.getNextNode());
    }

    @Test
    void whenGetPreviousNodeCalledAndNextNodeIsNull_thenNullIsReturned() {
        Node nodeA = new Node(10);

        assertNull(nodeA.getPreviousNode());
    }
}

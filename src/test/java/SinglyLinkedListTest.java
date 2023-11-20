
import codefinity.Node;
import codefinity.SinglyLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {

    @Test
    public void testSize() {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        assertEquals(0, linkedList.size());

        linkedList.append(1);
        assertEquals(1, linkedList.size());

        linkedList.append(2);
        linkedList.append(3);
        assertEquals(3, linkedList.size());

        linkedList.delete(0);
        assertEquals(2, linkedList.size());

        linkedList.delete(1);
        assertEquals(1, linkedList.size());
    }

    @Test
    public void testDelete() {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        linkedList.delete(1);
        assertListEquals(linkedList, new int[]{1, 3, 4});

        linkedList.delete(0);
        assertListEquals(linkedList, new int[]{3, 4});

        linkedList.delete(1);
        assertListEquals(linkedList, new int[]{3});

        linkedList.delete(0);
        assertNull(linkedList.getHead());
    }

    private void assertListEquals(SinglyLinkedList linkedList, int[] expectedArray) {
        Node current = linkedList.getHead();
        for (int value : expectedArray) {
            assertNotNull(current);
            assertEquals(value, current.getData());
            current = current.getNext();
        }
        assertNull(current);
    }
}

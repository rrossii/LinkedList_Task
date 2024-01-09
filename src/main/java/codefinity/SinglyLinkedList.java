//ToDo: Implement the size() and delete() method in the SinglyLinkedList class, then you can test it through the Main class.

package codefinity;

public class SinglyLinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public SinglyLinkedList() {
        this.head = null;
    }

    // Method to add an element to the end of the list (Create)
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Method to display the content of the list (Read)
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to update a value by index (Update)
    public void update(int index, int newData) {
        if (index < 0 || index >= size()) {
            System.out.println("Invalid index");
            return;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.data = newData;
    }

    // Method to delete an element by index (Delete)
    public void delete(int index) {
        Node toDelete = head;

        if (index < size() && index >= 0) {
            for (int i = 0; i < index - 1; i++) {
                toDelete = toDelete.next;
            }
            if (index == 0) {
                head = head.next;
            } else {
                toDelete.next = toDelete.next.next;
            }
        } else {
            System.out.println("Invalid Index");
        }
    }

    // Method to get the size of the list
    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size += 1;
            current = current.next;
        }

        return size;
    }
}

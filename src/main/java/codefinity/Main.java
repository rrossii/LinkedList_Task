//ToDo: I've written the test template here, you can use it, or write your own testing method. You can also use SinglyLinkedListTest to check your solution.

package codefinity;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        // Adding elements to the end of the list (Create)
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        // Displaying the content of the list (Read)
        System.out.println("Contents of the list:");
        linkedList.display();

        // Updating a value by index (Update)
        linkedList.update(2, 10);
        System.out.println("List after updating the value at index 2:");
        linkedList.display();

        // Deleting an element by index (Delete)
        linkedList.delete(1);
        System.out.println("List after deleting the element at index 1:");
        linkedList.display();
    }
}

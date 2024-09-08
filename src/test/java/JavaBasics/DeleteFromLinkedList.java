package JavaBasics;

public class DeleteFromLinkedList {

    Node head;

    // Node class
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to delete the Nth node from the end
    public Node deleteNth(int n) {
        if (head == null) {
            System.out.println("List is empty.");
            return null;
        }

        Node cur = head;
        int size = 0;

        // Calculate the size of the list
        while (cur != null) {
            size++;
            cur = cur.next;
        }

        // If n is greater than the size of the list
        if (n > size) {
            System.out.println("Invalid value of n: larger than list size.");
            return head;
        }

        // If we need to delete the head node
        if (n == size) {
            head = head.next;
            return head;
        }

        // Traverse to the node before the one to be deleted
        Node prev = head;
        int searchIndex = size - n;
        for (int i = 1; i < searchIndex; i++) {
            prev = prev.next;
        }

        // Remove the nth node from the end
        prev.next = prev.next.next;

        return head;
    }

    // Function to add a new node at the end
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    // Function to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main function to test the code
    public static void main(String[] args) {
        DeleteFromLinkedList list = new DeleteFromLinkedList();

        // Adding elements to the linked list
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println("Original List:");
        list.printList();

        int n = 2; // Delete the 2nd node from the end
        list.deleteNth(n);

        System.out.println("List after deleting " + n + "th node from the end:");
        list.printList();
    }
}

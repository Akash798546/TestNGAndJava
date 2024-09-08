package CollectionFramework;

public class ReverseLinkedList {

 static	class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
		public static class LinkedList {

			Node head;

			public Node reverse(Node head) {
				Node prev = null;
				Node current = head;
				Node next = null;

				while (current != null) {
					next = current.next;
					current.next = prev;
					prev = current;
					current = next;

				}
				return prev;
			}

			public static void printList(Node node) {
				while (node != null) {
					System.out.print(node.data + " ");
					node = node.next;
				}

			}

		}



	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);

		System.out.println("Original List");
		list.printList(list.head);

		list.head = list.reverse(list.head);
System.out.println();
		System.out.println("Reverse linked List");
		list.printList(list.head);

	}

}

package level2;

public class LinkedListTraversal {
	Node head;
	Node tail;

	/*
	 * Linked list Node. This inner class is made static so that main() can access
	 * it
	 */
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		} // Constructor
	}

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListTraversal linkedList = new LinkedListTraversal();
		System.out.println("add data.......... ");
		linkedList.addNode(2);
		linkedList.addNode(2);
		linkedList.addNode(8);
		linkedList.addNode(4);
		linkedList.addNode(4);
		linkedList.addNode(5);
		linkedList.addNode(8);
		linkedList.addNode(5);
		System.out.println("display data ");
		linkedList.display();
		System.out.println("sort data ");
		linkedList.sortLinkedList();
		System.out.println("sorted display data ");
		linkedList.display();
		System.out.println("remove duplicate data ");
		linkedList.removeDuplicateFromLinkedList();
		System.out.println("after duplicated display data ");
		linkedList.display();
		// second way in exam
		removeDuplicateFromLinkedList2ndWay(linkedList.head);
		System.out.println("removeDuplicateFromLinkedList2ndWay data ");
		linkedList.display();
	}

	private static Node removeDuplicateFromLinkedList2ndWay(Node head) {
		// TODO Auto-generated method stub
		Node currentNode = head;
		while (currentNode != null) {
			Node nextNode = currentNode.next;
			while (nextNode != null) {
				if (currentNode.data == nextNode.data) {
					nextNode = nextNode.next;
				} else {
					break;
				}
			}
			currentNode.next = nextNode;
			currentNode = nextNode;
		}
		return currentNode;
	}

	private void removeDuplicateFromLinkedList() {
		// TODO Auto-generated method stub
		Node currentNode = head;
		while (currentNode != null) {
			Node nextNode = currentNode.next;
			while (nextNode != null) {
				if (currentNode.data == nextNode.data) {
					nextNode = nextNode.next;
				} else {
					break;
				}
			}
			currentNode.next = nextNode;
			currentNode = nextNode;
		}
	}

	private void sortLinkedList() {
		Node currentNode = head;
		while (currentNode != null) {
			Node nextNode = currentNode.next;
			while (nextNode != null) {
				int temp;
				// current value is less than next - then ok else not ok
				if (currentNode.data > nextNode.data) {
					temp = currentNode.data;
					currentNode.data = nextNode.data;
					nextNode.data = temp;
				}
				nextNode = nextNode.next;
			}
			currentNode = currentNode.next;
		}
		// TODO Auto-generated method stub
	}
}

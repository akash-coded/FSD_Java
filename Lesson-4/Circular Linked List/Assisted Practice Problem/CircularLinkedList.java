public class CircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    CircularLinkedList() {
        head = null;
    }

    void sortedInsert(Node newNode) {
        Node current = head;
        if (current == null) {
            newNode.next = newNode;
            head = newNode;
        } else if (current.data >= newNode.data) {
            while (current.next != head)
                current = current.next;
            current.next = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            while (current.next != head && current.next.data < newNode.data)
                current = current.next;
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    void printList() {
        if (head != null) {
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        int[] arr = new int[] { 12, 56, 2, 11, 1, 90 };
        Node temp = null;
        for (int i = 0; i < 6; i++) {
            temp = new Node(arr[i]);
            list.sortedInsert(temp);
        }
        list.printList();
    }
}

public class SinglyLinkedList {
    Node head; // head of list

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static SinglyLinkedList insert(SinglyLinkedList list, int data) {
        // Create a new node with given data
        Node newNode = new Node(data);
        newNode.next = null;
        // If the Linked List is empty, then make the new node as head
        if (list.head == null) {
            list.head = newNode;
        } else {
            // Else traverse till the last node and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // Insert the new_node at last node
            last.next = newNode;
        }
        return list;
    }

    public static void printList(SinglyLinkedList list) {
        Node currNode = list.head;
        System.out.print("SinglyLinkedList: ");
        // Traverse through the SinglyLinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");
            // Go to next node
            currNode = currNode.next;
        }
        System.out.println();
    }

    // Method to delete a node in the SinglyLinkedList by KEY
    public static SinglyLinkedList deleteByKey(SinglyLinkedList list, int key) {
        // Store head node
        Node currNode = list.head;
        Node prev = null;
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next; // Changed head
            System.out.println(key + " found and deleted");
            return list;
        }
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        }
        if (currNode == null) {
            System.out.println(key + " not found");
        }
        return list;
    }

    // method to create a Singly linked list with n nodes
    public static void main(String[] args) {
        /* Start with the empty list. */
        SinglyLinkedList list = new SinglyLinkedList();
        // Insert the values
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        insert(list, 6);
        insert(list, 7);
        insert(list, 8);
        // Print the SinglyLinkedList
        printList(list);
        // Delete node with value 1
        deleteByKey(list, 1);
        // Print the SinglyLinkedList
        printList(list);
        // Delete node with value 4
        deleteByKey(list, 4);
        // Print the SinglyLinkedList
        printList(list);
        // Delete node with value 10
        deleteByKey(list, 10);
        // Print the SinglyLinkedList
        printList(list);
    }
}
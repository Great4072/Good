public class DoublyLinkedList {

    // Node สำหรับ Doubly Linked List
    class Node {
        int studentID;
        String name;
        double GPA;

        Node next;
        Node prev;

        Node(int studentID, String name, double GPA) {
            this.studentID = studentID;
            this.name = name;
            this.GPA = GPA;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;

    // Insert First
    public void insertFirst(int id, String name, double gpa) {

        Node newNode = new Node(id, name, gpa);

        if (head == null) {
            head = tail = newNode;
        } else {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert Last
    public void insertLast(int id, String name, double gpa) {

        Node newNode = new Node(id, name, gpa);

        if (head == null) {
            head = tail = newNode;
        } else {

            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Search
    public boolean search(int id) {

        Node current = head;

        while (current != null) {

            if (current.studentID == id) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Delete First
    public void delete() {

        if (head == null) {
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {

            head = head.next;
            head.prev = null;
        }
    }

    // Display Forward
    public void displayForward() {

        Node current = head;

        while (current != null) {

            System.out.print(current.studentID);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }

    // Display Backward
    public void displayBackward() {

        Node current = tail;

        while (current != null) {

            System.out.print(current.studentID);

            if (current.prev != null) {
                System.out.print(" -> ");
            }

            current = current.prev;
        }

        System.out.println();
    }
}

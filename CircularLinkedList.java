public class CircularLinkedList {

    // Node สำหรับ Circular Linked List
    class Node {
        int studentID;
        String name;
        double GPA;
        Node next;

        Node(int studentID, String name, double GPA) {
            this.studentID = studentID;
            this.name = name;
            this.GPA = GPA;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    // Insert First
    public void insertFirst(int id, String name, double gpa) {

        Node newNode = new Node(id, name, gpa);

        if (head == null) {

            head = tail = newNode;
            newNode.next = head;

        } else {

            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    // Insert Last
    public void insertLast(int id, String name, double gpa) {

        Node newNode = new Node(id, name, gpa);

        if (head == null) {

            head = tail = newNode;
            newNode.next = head;

        } else {

            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Search
    public boolean search(int id) {

        if (head == null) {
            return false;
        }

        Node current = head;

        do {

            if (current.studentID == id) {
                return true;
            }

            current = current.next;

        } while (current != head);

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
            tail.next = head;
        }
    }

    // Display
    public void display() {

        if (head == null) {
            System.out.println("ไม่มีข้อมูล");
            return;
        }

        Node current = head;

        do {

            System.out.print(current.studentID);

            current = current.next;

            if (current != head) {
                System.out.print(" -> ");
            }

        } while (current != head);

        System.out.println();
    }
}

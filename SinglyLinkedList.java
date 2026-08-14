public class SinglyLinkedList {

    // Node สำหรับเก็บข้อมูลนักศึกษา
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

    // Insert First
    public void insertFirst(int id, String name, double gpa) {
        Node newNode = new Node(id, name, gpa);

        newNode.next = head;
        head = newNode;
    }

    // Insert Last
    public void insertLast(int id, String name, double gpa) {
        Node newNode = new Node(id, name, gpa);

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
        if (head != null) {
            head = head.next;
        }
    }

    // Display
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.println(
                current.studentID + " | " +
                current.name + " | GPA = " +
                current.GPA
            );

            current = current.next;
        }
    }

    // Find Maximum GPA
    public void findMaxGPA() {

        if (head == null) {
            System.out.println("ไม่มีข้อมูล");
            return;
        }

        Node current = head;
        Node max = head;

        while (current != null) {

            if (current.GPA > max.GPA) {
                max = current;
            }

            current = current.next;
        }

        System.out.println(
            max.studentID + " | " +
            max.name + " | GPA = " +
            max.GPA
        );
    }
}
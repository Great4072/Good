public class Main {

    public static void main(String[] args) {

        // =====================================
        // SINGLY LINKED LIST
        // =====================================

        System.out.println("=================================");
        System.out.println("       SINGLY LINKED LIST");
        System.out.println("=================================");

        SinglyLinkedList singly = new SinglyLinkedList();

        singly.insertLast(65001, "Anan", 3.25);
        singly.insertLast(65002, "Beam", 3.50);
        singly.insertLast(65003, "Game", 2.75);
        singly.insertLast(65004, "Great", 3.90);
        singly.insertLast(65005, "Mark", 3.20);
        singly.insertLast(65006, "Boss", 3.65);

        System.out.println("\nข้อมูลนักศึกษา:");
        singly.display();

        System.out.println("\nค้นหา 65003:");
        System.out.println(singly.search(65003));

        System.out.println("\nนักศึกษาที่ GPA สูงที่สุด:");
        singly.findMaxGPA();

        System.out.println("\nหลัง Delete First:");
        singly.delete();
        singly.display();


        // =====================================
        // DOUBLY LINKED LIST
        // =====================================

        System.out.println("\n\n=================================");
        System.out.println("       DOUBLY LINKED LIST");
        System.out.println("=================================");

        DoublyLinkedList doubly = new DoublyLinkedList();

        doubly.insertLast(65001, "Anan", 3.25);
        doubly.insertLast(65002, "Beam", 3.50);
        doubly.insertLast(65003, "Game", 2.75);
        doubly.insertLast(65004, "Great", 3.90);
        doubly.insertLast(65005, "Mark", 3.20);
        doubly.insertLast(65006, "Boss", 3.65);

        System.out.println("\nForward:");
        doubly.displayForward();

        System.out.println("Backward:");
        doubly.displayBackward();

        System.out.println("\nค้นหา 65004:");
        System.out.println(doubly.search(65004));


        // =====================================
        // CIRCULAR LINKED LIST
        // =====================================

        System.out.println("\n\n=================================");
        System.out.println("      CIRCULAR LINKED LIST");
        System.out.println("=================================");

        CircularLinkedList circular = new CircularLinkedList();

        circular.insertLast(65001, "Anan", 3.25);
        circular.insertLast(65002, "Beam", 3.50);
        circular.insertLast(65003, "Game", 2.75);
        circular.insertLast(65004, "Great", 3.90);
        circular.insertLast(65005, "Mark", 3.20);
        circular.insertLast(65006, "Boss", 3.65);

        System.out.println("\nรอบที่ 1:");
        circular.display();

        System.out.println("รอบที่ 2:");
        circular.display();

        System.out.println("\nค้นหา 65005:");
        System.out.println(circular.search(65005));

        System.out.println("\nหลัง Delete First:");
        circular.delete();
        circular.display();
    }
}

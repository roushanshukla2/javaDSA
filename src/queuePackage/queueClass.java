package queuePackage;

// "static void main" must be defined in a public class.



public class queueClass {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);
        
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(45);
        q.enQueue(53);
        q.enQueue(45);
        q.printQueue();
        q.deQueue();
        // System.out.println("Before removing element");
        // q.printList();
        // q.deQueue();
        // System.out.println("After removing element");
        // q.printList();
        

        // if (q.isEmpty() == false) {
        //     System.out.println(q.Front());
        // }
        // q.deQueue();
        // if (q.isEmpty() == false) {
        //     System.out.println(q.Front());
        // }
        // q.deQueue();
        // if (q.isEmpty() == false) {
        //     System.out.println(q.Front());
        // }
    }
}
package linkedListPackage;

public class singlyLinkedList {

    nodeOfSinglyLinkedList headPointer;
    int size;
    singlyLinkedList()
    {
        headPointer=null;
        size=0;
    }

    public class nodeOfSinglyLinkedList {
        int data;
        nodeOfSinglyLinkedList next;

        nodeOfSinglyLinkedList(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void insertAtEnd(int element) {
        nodeOfSinglyLinkedList newNode = new nodeOfSinglyLinkedList(element);
        if (headPointer == null) {
            headPointer = newNode;
            size++;
            return;
        }
        nodeOfSinglyLinkedList temp = headPointer;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
        return;
    }

    public void insertAtHead(int data)
    {
        nodeOfSinglyLinkedList newNode= new nodeOfSinglyLinkedList(data);
        newNode.next=headPointer;
        headPointer=newNode;
        size++;
    }

    public void insertAtIndex(int index, int data)
    {
        if(index<0||index>size)
            return;
        nodeOfSinglyLinkedList newNode=new nodeOfSinglyLinkedList(data);
        nodeOfSinglyLinkedList preivousNode =headPointer;
        for(int i=1;i<index;i++)
        {
            preivousNode=preivousNode.next;
        }       
        newNode.next=preivousNode.next;
        preivousNode.next=newNode;
        size++;
        return;
    }
    public void displayLl() {
        nodeOfSinglyLinkedList temp = headPointer;
        while (temp != null) {
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void deleteElement()
    {
        if(headPointer==null)
        { 
            return;
        }
        nodeOfSinglyLinkedList last=headPointer;
        while(last.next.next!=null)
        {
            last=last.next;
        }
        last.next=null;
        size--;
        return;

    }

    public static void main(String[] args) {
        singlyLinkedList list = new singlyLinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(34);
        list.insertAtEnd(32);
        System.out.println("after Insert at end");
        list.displayLl();
        list.insertAtHead(24);
        list.insertAtHead(53);
        list.insertAtHead(245);
        list.insertAtHead(533);
        System.out.println("After insert at head");
        list.displayLl();
        list.insertAtIndex(2,20);
        list.insertAtIndex(3,30);
        list.insertAtIndex(6,60);
        System.out.println("After insert at index 2,3,6");
        list.displayLl();
        System.out.println("total element in linkedlist is " + list.size);
        list.deleteElement();
        list.displayLl();
        
    }
}
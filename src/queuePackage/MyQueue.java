package queuePackage;

// import java.util.ArrayList;
// import java.util.List;
// // import java.util.Iterator; // Import correct Iterator class


// class MyQueue {
//     // store elements
//     private List<Integer> data;
//     // a pointer to indicate the start position
//     private int p_start;
//     // Constructor
//     public MyQueue() {
//         data = new ArrayList<Integer>();
//         p_start = 0;
//     }
//     /** Insert an element into the queue. Return true if the operation is successful. */
//     public boolean enQueue(int x) {
//         data.add(x);
//         return true;
//     }    
//     /** Delete an element from the queue. Return true if the operation is successful. */
//     public boolean deQueue()  {
//         if (isEmpty() == true) {
//             return false;
//         }
//         else
//         {   // shifting element at ith+1 index to ith index
//             for(int i=0;i<data.size()-1;i++)
//             {
//                 int element=data.get(i+1);
//                 data.set(i, element);
//             }
//         }
//         data.remove(data.size() - 1);
//         p_start++;
//             return true;
//     }
//     /** Get the front item from the queue. */
//     public int Front() {
//         return data.get(p_start);
//     }
//     /** Checks whether the queue is empty or not. */
//     public boolean isEmpty() {
//         return p_start >= data.size();
//     }     
//     public void printList() {
//         // Iterator<Integer> iterator = data.iterator();
//         // while (iterator.hasNext()) {
//         //     System.out.println(iterator.next());
//         // }
//         for(int i=0; i<=data.size()-1;i++)
//         {
//             System.out.println(data.get(i));
//         }
    
//     }
// }

/**
 * MyQueue
 */
public class MyQueue {
    int size;
    int arr[];
    int front;
    int rear;
    MyQueue(int size)
    {
        this.size=size;
        this.arr=new int[size];
        this.front=0;
        this.rear=0;
    }
    public boolean enQueue(int data)
    {
        if(isFull()){
            System.out.println("Not Inserted "+ data );
            return false;
        }else
        {  
            arr[rear++]=data;
            return true;
        }
    }
    public boolean deQueue()
    {
        if(isEmpty())
            return false;
        else
        {
            front++;
            return true;
        }
    }
    public boolean isFull() {
        if(rear==size)
        {
            System.out.print("overflow ");
            return true;
        }
            else
            {
                System.out.println("not full");
            return false;
    }}
    public boolean isEmpty() {
        if(rear==0){
            System.out.println("Underflow");
            return true;
        }else{
            System.out.println("Not underflow");
            return false;
    }}
    public void printQueue(){
        for(int i=front;i<rear;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

    
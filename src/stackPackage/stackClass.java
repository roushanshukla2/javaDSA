package stackPackage;

import java.util.Arrays;
import java.util.Scanner;

public class stackClass {
    private int size;
    int stackArray[] = new int[size];
    int top;

    public stackClass(int size) {
        this.size = size;
        this.stackArray = new int[size];
        this.top = -1; // Stack is initially empty
    }

    @SuppressWarnings("resource")
    public void display() {
        int breakCase = 1;
        while (breakCase != 0) {
            if (empty())
                System.out.println("Your stack is Empty Select an Option");
            else
                System.out.println("Select an Option");
            System.out.println(
                    "Press 1 to Create a Stack\nPress 2 to Push an Element into Stack\nPress 3 to Pop an Element from Stack\nPress 4 to Check the top Element in Stack\nPress 5 to check Size of Stack\nPress 6 to check all the element in Stack\nPress any other key to close the Program");
            int Option;
            Scanner in = new Scanner(System.in);

            Option = in.nextInt();

            switch (Option) {

                case 1:// Set size of the stack
                    System.out.println("Enter size of the stack to create a stack");
                    int size = in.nextInt();
                    setSizeOfStack(size);
                    System.out.println(size + " is the size of stack \n" + top + " is top of stack index of stack \n"
                            + Arrays.toString(stackArray) + " is element of Stack");
                    break;

                case 2:// PUSH OPTION
                    System.out.println("Enter the number of element want to push");
                    int numberOfElementToPush;
                    numberOfElementToPush = in.nextInt();

                    int i = 0;
                    while (i < numberOfElementToPush) {
                        int element;
                        System.out.println("Enter the element to push into stack");
                        element = in.nextInt();
                        push(element);
                        i++;
                    }
                    break;
                case 3://POP operation
                    int numberOfElementInStack=top+1;
                    System.out.println("You have "+numberOfElementInStack+" element in stack.How many element want to remove from Stack");
                    int numberOfElementToPop=in.nextInt();
                    int loop=0;
                    while (numberOfElementToPop<loop) {
                        System.out.println(pop()+" is removed from Stack");
                    }
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                default:
                 
                    break;
            }
            System.out.println("Thanks\nPress 1 to try again and any other key to close the program");
            int loopBreakcondition = in.nextInt();
            if (loopBreakcondition != 1)
                breakCase = 0;

        }
    }

    // Empty function
    public void setSizeOfStack(int size) {
        this.size = size;
    }

    public boolean empty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    // pop Function
    public int pop() {
        if (top != -1) {
            int removedElement = stackArray[top];
            top--;
            return removedElement;
        } else{
            System.out.println("Stack underflow");
            return 0;
        }
    }

    // Push function
    public void push(int element) {
        if (top == size - 1)
            System.out.println("Stack Overflow");
        else {
            top++;
            stackArray[top] = element;
            System.out.println(element + " is inserted into Stack");
        }
    }

    // Peak function
    public void peak() {
        if (empty())
            System.out.println("Stack is Empty");
        else
            System.out.println(stackArray[top]);
    }
}

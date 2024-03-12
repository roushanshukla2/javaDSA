package arrayPackage;

import java.util.Scanner;

public class arr {
    int a[];
    int size;
    arr(int size)
    {
        this.size=size;
        this.a=new int[size];
    }
    
    public int arrInput(){
        System.out.println("Enter the Element");
        int element;
        Scanner inn =new Scanner(System.in);
        for(int i=0;i<size;i++)
        {   
            element=inn.nextInt();
            a[i]=element;
        }
        inn.close();
        return 0;
    }
    public void displayArray()
    {
        for(int i=0;i<size;i++)
        {   
            System.out.println("Array at index "+i+" is "+a[i]);    
        }  
    }
    public static void main(String args[])
    {
        int size;
        Scanner inn = new Scanner(System.in);
        System.out.println("Enter size of the array");
        size=inn.nextInt();
        arr ref=new arr(size);
        ref.arrInput();
        ref.displayArray();
        inn.close();
    }
}

package practice;

public class secondLargest {
    int max=Integer.MIN_VALUE;
    int secondMax=Integer.MIN_VALUE;
    public int findSecondLargestNumber(int arr[])
    {
        for (int i=0;i<arr.length;i++)
            {
                
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>secondMax && arr[i]<max)
            {
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
    
    public static void main(String args[])
    {
        secondLargest num=new secondLargest();
        int arr[]={1};
        System.out.println(num.findSecondLargestNumber(arr));
    }
}



// public int findSecondLargestNumber(int[] array) {
//       // Finding the largest number
//       for (int i = 0; i < array.length; i++) {
//         if (array[i] > max) {
//             max = array[i];
//         }
//     }

//     // Finding the second largest number
//     for (int i = 0; i < array.length; i++) {
//         if (array[i] > secondMax && array[i] < max) {
//             secondMax = array[i];
//         }
//     }

//     return secondMax;
// }
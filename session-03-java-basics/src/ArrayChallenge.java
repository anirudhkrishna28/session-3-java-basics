package io.javabrains.javabasics;

//package io.javabrains.javabasics;

public class ArrayChallenge {
    public static int sum(int arr[])
    {
        int s=0;
        for(int i:arr){
            s+=i;
        }
        return s;
    }
    public static int maxVal(int arr[])
    {
        int max=0;
        for (int i:arr)
        {
            max = i>max?i:max;
        }
        return max;
    }

    public static double Avg(int arr[])
    {
        int s = sum(arr);
        return (double)s/ (double)arr.length;
    }
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] arr = {1,2,3,4,5};


        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array

        System.out.println("sum:"+sum(arr));
        System.out.println("avg:"+Avg(arr));
        System.out.println("maxvalue:"+maxVal(arr));


    }
}


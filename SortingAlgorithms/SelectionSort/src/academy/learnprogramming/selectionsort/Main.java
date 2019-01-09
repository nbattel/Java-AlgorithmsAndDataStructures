package academy.learnprogramming.selectionsort;

public class Main {

    public static void main(String[] args)
    {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};        //Array of size 7

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            int largestIndex = 0;
            for (int x = 1; x <= lastUnsortedIndex; x++)         //For loop to loop through every index of the array ensuring all elements are in increasing order
            {
                if ( intArray[x] > intArray[largestIndex])       //For loop comparing each element of the array and setting the index of the largest element of the array to largestIndex
                {
                    largestIndex = x;
                }
            }

            swap(intArray, largestIndex, lastUnsortedIndex);     //Calling the swap function

        }

        for (int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);                //Printing each element of the array
        }
    }

    public static void swap(int[] array, int i, int j)       //Swap function used for swapping two elements in an array
    {
        if ( i == j)
        {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}

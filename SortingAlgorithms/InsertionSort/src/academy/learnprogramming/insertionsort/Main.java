package academy.learnprogramming.insertionsort;

public class Main {

    public static void main(String[] args)
    {
        int[] intArray = {20, 35, -15, 7, 88, 12, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++)
        {
            int newElement = intArray[firstUnsortedIndex];

            int x;

            for(x = firstUnsortedIndex; x > 0 && intArray[x - 1] > newElement; x--)
            {
                intArray[x] = intArray[x - 1];
            }

            intArray[x] = newElement;
        }

        for (int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }
    }
}

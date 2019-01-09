package academy.learnprogramming.arrays;

public class Main
{

    public static void main(String[] args)
    {
	int[] intArray = new int[7];

	intArray[0] = 20;
	intArray[1] = 35;
	intArray[2] = -15;
	intArray[3] = 7;
	intArray[4] = 55;
	intArray[5] = 1;
	intArray[6] = -22;

	for (int i = 0; i < intArray.length; i++)     //Printing every element of the array
	{
		System.out.println(intArray[i]);
	}


	int index = -1;
	for(int i = 0; i < intArray.length; i++)     //Searching for the number 7 in the array and printing the index of the array where 7 is
    {
        if(intArray[i] == 7)
        {
        	index = i;
        	break;
		}
    }

    System.out.println(index);
    }
}

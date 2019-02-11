package nbattel.recursion;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(RecursiveFactorial(4));
        System.out.println(IterativeFactorial(4));
    }

    public static int RecursiveFactorial(int num)
    {
        //Base case
        if(num == 0)
        {
            return 1;
        }

        return num * RecursiveFactorial(num - 1);
    }

    public static int IterativeFactorial(int num)
    {
        if(num == 0)
        {
            return 1;
        }

        int factorial = 1;
        for(int i = 1; i <= num; i++)
        {
            factorial *= i;
        }

        return factorial;
    }
}

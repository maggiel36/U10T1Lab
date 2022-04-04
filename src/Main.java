public class Main
{
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }

    private static int factorial(int num)
    {
        int factorial = num;
        while (num > 1)
        {
            num--;
            factorial *= num;
        }
        return factorial;
    }
}

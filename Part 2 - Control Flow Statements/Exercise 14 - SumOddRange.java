public class SumOddRange 
{
    public static boolean isOdd(int number)
    {
        if (number <= 0 || number % 2 == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static int sumOdd(int start, int end)
    {
        if (end < start || start < 0 || end < 0)
        {
            return -1;
        }
        else
        {
            int sum = 0;
            for (int i = start; i <= end; i++)
            {
                boolean check = isOdd(i);
                if (check)
                {
                    sum += i;
                }
                else
                {
                    sum += 0;
                }
            }
            return sum;
        }
    }
}

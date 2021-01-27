public class FirstLastDigitSum 
{
    public static int sumFirstAndLastDigit(int number)
    {
        int lastDigit = number % 10;
        int sum = 0;
        
        if (number >= 10)
        {
            while ((number / 10) >= 10)
            {
                number = number / 10;
            }
            number = number / 10;
            sum = lastDigit + number;
            return sum;
        }
        else if (number < 0)
        {
            return -1;
        }
        sum = number *= 2;
        return sum;
    }
}

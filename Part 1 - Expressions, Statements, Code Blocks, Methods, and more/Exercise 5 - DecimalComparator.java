public class DecimalComparator
{
    public static boolean areEqualByThreeDecimalPlaces(double one, double two) 
    {
        int a = (int) (one * 1000);
        int b = (int) (two * 1000);

        if(a != b)
        {
            return false;
        }
        return true;
    }
}

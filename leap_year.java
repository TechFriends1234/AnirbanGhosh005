public class leap_year
{
    public static void main(long y)
    {
    if(y%4==0)
    {
        if(y%100==0)
        {
            if(y%400==0)
            System.out.println("Leap year");
            else 
            System.out.println("Not a Leap Year");
        }
    }
}
}
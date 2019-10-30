import java.util.*;
public class ci
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double p,r,t,i,a;
        System.out.println("Enter the principal: ");
        p=sc.nextDouble ();
        System.out.println("Enter the rate of interest: ");
        r=sc.nextDouble ();
        System.out.println("Enter the time period: ");
        t=sc.nextDouble ();
        i=p*(Math.pow(1+r/100,t))-1;
        a=p+i;
        System.out.println("The compound interest is "+i);
        System.out.println("The amount is "+a);
    }
}
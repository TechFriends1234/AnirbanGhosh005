import java.util.*;
public class method 
{
    void rectangle()
    {
        Scanner sc=new Scanner(System.in);
        double l,b,p,a;
        System.out.println("Enter the length: ");
        l=sc.nextDouble();
        System.out.println("Enter the breadth: ");
        b=sc.nextDouble();
        p=2*(l+b);
        a=l*b;
        System.out.println("The perimeter is "+p);
        System.out.println("The area is "+a);
    }
        public static void main()
    {
        method ob=new method();
        ob.rectangle();
    }
}
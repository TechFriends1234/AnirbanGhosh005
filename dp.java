import java.util.Scanner;
public class dp
{
    public static void main()
    {
        int a=0,b=0;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a=kb.nextInt();
        System.out.println("enter the second number: ");
        b=kb.nextInt();
        if(a>b)
        System.out.println(a+" is greater");
        if(a<b)
        System.out.println(b+" is greater");
        if(a==b)
        System.out.println("both are equal");
    }
}
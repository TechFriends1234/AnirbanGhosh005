import java.util.*;
public class right_trinagle
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Date dt=new Date();
        System.out.println("Welcome!");
        System.out.println("Current status: "+dt);
        System.out.println("Enter the length of the three sides: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        boolean x=(a*a+b*b)==(c*c)?true:false;
        boolean y=(a*a+c*c)==(b*b)?true:false;
        boolean z=(b*b+c*c)==(a*a)?true:false;
        boolean p=(x==true||y==true||z==true)?true:false;
        System.out.println("IS the triangle right angled?");
         System.out.println("Ans:- "+p);
        }
    }
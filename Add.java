//program for entering four numbers and and printing the sum and their sum.
import java.util.Scanner;
public class Add
{
    void display()
    {
        int n1,n2,n3,n4,sum;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the four numbers");
        n1=kb.nextInt();
        n2=kb.nextInt();
        n3=kb.nextInt();
        n4=kb.nextInt();
        sum=n1+n2+n3+n4;
        System.out.println("You entered:"+n1+","+n2+","+n3+","+n4);
        System.out.println("The sum is "+sum); 
    }
}
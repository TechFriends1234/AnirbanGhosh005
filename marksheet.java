import java.util.*;
public class marksheet
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double p,c,m;
        String name;
        System.out.println("Name");
        name=sc.nextLine();
        System.out.println("Enter the marks in physics out of 100: ");
        p=sc.nextDouble();
        System.out.println("Enter the marks in chemistry out of 100: ");
        c=sc.nextDouble();
        System.out.println("Enter the marks in mathematics out of 100: ");
        m=sc.nextDouble();
        double per;
        per=((p+c+m)/300)*100;
        System.out.println("Your name is "+name);
        System.out.println("The percentage of marks is "+per);
    }
}
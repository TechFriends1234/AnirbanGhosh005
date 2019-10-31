import java.util.*;
public class boo_lean
{
    public static void main()
    {
        Scanner kb=new Scanner(System.in);
        boolean divby2=false,divby4=false,divby5=false;
        int number,lastDigit,last2Digit;
        System.out.println("Enter the number:");
        number=kb.nextInt();
        lastDigit=number%10;
        last2Digit=number%100;
        if(lastDigit==0 || lastDigit==2 || lastDigit==4 || lastDigit==6 || lastDigit==8)
        divby2=true;
        if(lastDigit==0 || lastDigit==5)
        divby5=true;
        if(lastDigit%4==0)
        divby4=true;
        if(divby2==true&&divby4==true&&divby5==true)
        System.out.println(number+" is divisible by 2,4,5");
        else
        System.out.println(number+" is not divisible by 2,4,5");
    }
}
import java.io.*;
public class sum
{
    public static int Add(int m,int n)
    {
        int s=0;
        s=m+n;
        return s;
    }
    public static void main(String args[])throws IOException
    {
        int a,b,p;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter n1: ");
        a=Integer.parseInt(in.readLine());
        System.out.println("Enter n2: ");
        b=Integer.parseInt(in.readLine());
        p=Add(a,b);
        System.out.println(p);
    }
}
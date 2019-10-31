import java.io.*;
public class buffer_reader
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String month;
        System.out.println("Enter the name of the month ");
        month=(in.readLine());
        String consumer;
        System.out.println("Enter the name consumer ");
        consumer=(in.readLine());
        String consumer_no;
        System.out.println("Enter the consumer no. ");
        consumer_no=(in.readLine());
        int unit;
        System.out.println("Enter the unit consumed ");
        unit=Integer.parseInt(in.readLine());
        System.out.println("Month: "+month);
        System.out.println("Consumer name: "+consumer);
        System.out.println("Consumer number: "+consumer_no);
        System.out.println("The unit consumed: "+unit);
        if(unit<=100)
        System.out.println("The charge is Rs."+ 2.80*unit);
        if(unit>100&&unit<=300)
        System.out.println("The charge is Rs."+ 2.30*unit);
        if(unit>300&&unit<=500)
        System.out.println("The charge is Rs."+ 4.80*unit);
        if(unit>500)
        System.out.println("The charge is Rs."+ 5.50*unit);
    }
}
//program for printing "hllw _" after inputing the _.
//  ["_" = "name"]
import java.util.Scanner;
public class Input
{
     void takeInput()
    {
    Scanner a=new Scanner(System.in);
    System.out.println("Enter your name");
    String name=a.nextLine();
    System.out.println("Hello "+name);
    System.out.println("Glad you like this presentation");
}
}
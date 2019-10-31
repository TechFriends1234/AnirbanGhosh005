public class Grade
{
    public static void main(int m)
    {
        if(m>80)
        {
        System.out.println("Distinction");
    }
    else if(m>60&&m<80)
      {
        System.out.println("1st divison");
    }
    else if(m>40&&m<60)
      {
        System.out.println("2nd Divison");
    }
    else if(m>40&&m<45)
      {
        System.out.println("Pass");
    }
    else
    System.out.println("Fail");
}
}
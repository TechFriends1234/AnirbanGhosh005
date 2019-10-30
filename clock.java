public class clock
{
    public void main(int h,int m)
    {
        int a;
        a=time(h,m);
        System.out.println("The time in second is "+a);
    }
    int time(int a,int b)
    {
        int r=(a*60*60)+(b*60);
        return r;
    }
}
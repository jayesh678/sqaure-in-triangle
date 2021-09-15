import java.util.*;
class Squareintriangle
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int Test= sc.nextInt();
        while (Test-->0)
        {
            long base= sc.nextInt();
            base=base-2;
            base=Math.floorDiv(base,2);
            System.out.println(base*(base+1)/2);
        }
    }
}
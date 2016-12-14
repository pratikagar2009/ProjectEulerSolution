/* 2520 is the smallest number that can
 * be divided by each of the numbers from
 * 1 to 10 without any remainder.

What is the smallest positive number
 that is evenly divisible by all of the numbers from 1 to 20?*/

class SmallestMultiple5
{
    public static void main(String args[])
    {
        int c=20;
        int m=0;
        boolean flag=true;
           while(flag)
           {
        for(int i=2 ; i<=20 ; i++)
        {
            if(c%i == 0)
            m++;
        }
        if(m==19)
        flag=false;
        else
        {
        c=c+20;m=0;}
    }
    System.out.println(c);
}
}
//largest prime factor of 600851475143

class prime3
{
    public static void main(String args[])
    {
         int m=10976461;
        int c=0;
        for(int i=23 ; i<11000000; i++)
        for(int j=2 ; j<i ; j++)
        if(i%j !=0 && m%i==0)
        c=i;
        System.out.println(c);
    }
}
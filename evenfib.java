class evenfib
{
    public static void main(String args[])
    {
        int a=1;
        int b=2;
        int c=0;
        int w=1;
        
        while(c<4000000)
        {
        c=a+b;
        
        if(c%2==0)
        w=w+c;
        a=b;
        b=c;
    }
    System.out.println(w);
}}
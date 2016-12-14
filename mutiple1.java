class mutiple1
{
    public static void main(String args[])
    {int sum=0;
        long startTime = System.currentTimeMillis();
        for(int i=1 ; i<1000 ; i++)
        {
            if(i%5==0 || i%3==0)
            sum=sum+i;
        }
        long stopTime = System.currentTimeMillis();
      long elapsedTime = stopTime - startTime;
      System.out.println("time take = "+elapsedTime);
        System.out.println(sum);
    }}
import java.util.*;
class AssingmentFour
{
  public static void main (String args[])
  {
      int sum = 0;
   int l =999000000;
   int u =1000000000;
   boolean is_prime = true;
   
   for(int i = l; i<=u ; i++)
   {
       for(int j=2 ; j<=Math.sqrt(i) ;j++)
       {
           if(i%j==0)
           is_prime = false;
        }
        if(is_prime==true)
        sum = sum + i;
        is_prime =true;
   }
   int output = sum % 1024;
   System.out.println(output);
  }
}


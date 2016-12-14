
import java.util.*;
class GetExecutionTimes
{
    public GetExecutionTimes(){}
    public static void main(String args[])
    {
        long startTime = System.currentTimeMillis();
  GetExecutionTimes ext=new GetExecutionTimes();
  ext.callmethod();
  long endTime = System.currentTimeMillis();
  System.out.println("Total elapsed time in execution of method callMethod() is :"+ (endTime-startTime));
}

public void callmethod()
{long c=0;
    for(long i=0 ; i<100000000 ; i++)
    c++;
}
}
    
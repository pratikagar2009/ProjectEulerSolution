class prob6
{
    public static void main(String args[]){
        int pos=0 , sop=0 , ans=0;
        for(int i=1 ; i<=100 ; i++)
        {sop = sop + (i*i);}
        for(int j=1 ; j<=100 ; j++)
        {pos = pos + j;}
        ans = pos*pos;
        System.out.println(sop-ans);
    }
}
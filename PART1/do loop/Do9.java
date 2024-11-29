class Do9
{
    public static void main (String [] args)

    {
        int a = 100;
        int count = 0;
        do
        {
           if(a%2!=0)
           {
            count++;
           }
            a--;
        }while(a>=1);
        System.out.println(count);
    }
}
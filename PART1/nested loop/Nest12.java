class Nest12{
public static void main(String [] args){

char a='Z';
for(int p=1;p<=3;p++)
{
    for(int b=1;b<=3;b++)
    {
       System.out.print(a);
       a--;
    }
       System.out.println();
     a=(char)(a+3);
     
  }            
}}
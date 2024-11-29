class cond2{
public static void main (String [] args){

//1. Write a program to check if a number is greater than 10 and less than 20.
   
int a=18;
System.out.println(a>10 && a<20);

//2. Write a condition to check if a year is divisible by 4 and not divisible by 100 or  divisible by 400.

int year=2004;
System.out.println(year%4==0 && year%100!=0 || year%400==0);

//3. Check if a number is either positive or divisible by 5.
 int b=25;
System.out.println((b>0 || b%5==0)? "no. is +ve and divisible by 5":"no. is -ve and not divisible by 5");

//4. Validate if a character is a vowel and is uppercase.
 char ch='E';
System.out.print((ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')? "vowel" : "not_vowel");
System.out.println((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')?" and uppercase":" and not a uppercase");

//5. Write a condition to verify if a number is even or greater than 50.
int c=77;
System.out.print(c%2==0 ?"no. is even":" no is not even");
System.out.println(c>50 ?" and no is greater than 50":" and no is less than 50");

//6. Determine if a string is not null and starts with "A".

	String str="Anil";

System.out.println((str!=null ) ? "it is not a null" : "it is a null");

//7. Write a program to check if both conditions, x > 5 and y < 10, are true.
int x=7;
int y=9;


System.out.println( x>5 && y<10 ? "both no are true" : "both number are false");

//8.Write a condition to confirm if a number lies neither between 10 and 20 nor is divisible by 3.

int z=6;
System.out.println(z<10 || z>20 && z%3==0 ? "the number is valid" : "the no is not valid");

//9. Validate if a number is not prime and less than 100.
int t=96;

System.out.println(t<100 ? "it is less than 100" : "it is more than 100" );

//10.

//// 11.Check if a number is divisible by both 2 and 3.

int n = 6;
System.out.println(( n%2 == 0  &&  n%3 ==0) ? "the no is divisible by 2 and 3" : "the no is divisible by 2 and 3");

////12.Validate if a string contains the word "Java" or "Code".

String s = "java";
String s1 = "core";

System.out.println((s.contains("java") && s1.contains("core")) ? "the no is valid" : "the no is not valid");


 // 13. Write a program to check if a person is eligible to vote (age >= 18) and is a citizen.


        boolean citizen = true;
        System.out.println("Person is eligible to vote: " + 
            ((age >= 18 && citizen) ? "True" : "False"));

 //14. Check if a person is either a teenager (age between 13 and 19) or a senior (age > 60).



        boolean person = true;
        System.out.println("Person is a teenager or senior: " + 
            (((age >= 13 && age <= 19) || age > 60) ? "True" : "False"));

   //15.Write a condition to confirm if a variable is neither null nor empty.

          s="sahil";
          System.out.println(s!=null && s!="");
//16.Verify if a number is divisible by 7 and the sum of its digits is even.
 
  n1=42;
System.out.println(n1%7==0 &&  


17.Write a condition to check if two numbers are both negative or both positive.
 int   x1=3 ;
  int  x2=-4 ;
    System.out.println(); 



//18.Validate if a password is longer than 8 characters and contains both letters and numbers.

 String ,password = "Pass1234"; // Example password

        
        String validationMessage = (password.length() > 8 && 
                                     password.matches(".*[a-zA-Z].*") && 
                                     password.matches(".*[0-9].*"))
                                    ? "Password is valid"
                                    : "Password is invalid";

        System.out.println(validationMessage);

// 19.

}}
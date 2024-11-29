class Condition{
public static void main(String [] args){

//Write a program to check if a number is greater than 10 and less than 20.

int a = 20;

System.out.println(a> 10 && a<20);

//Check if a number is either positive or divisible by 5.

System.out.println(a%2 ==0 && a%5 == 0);

//Validate if a character is a vowel and is uppercase.


  char ch = 'A'; 

  String result = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                        ? "vowel" 
                        : "Not a vowel";

        System.out.println(result);

//Write a condition to verify if a number is even or greater than 50.

System.out.println(a%2 == 0 || a> 50);

//write a program to check if both conditions, x > 5 and y < 10, are true.

int x = 6;
int y = 6;

System.out.println( x > 5 && y < 10);

// 11.Check if a number is divisible by both 2 and 3.

int n = 6;
System.out.println( n%2 == 0  &&  n%3 ==0);

//Validate if a string contains the word "Java" or "Code".

String s = "java";
String s1 = "core";

System.out.println(s.contains("java") && s1.contains("core"));


//Validate if a password is longer than 8 characters and contains both letters and numbers.

 String password = "Pass1234"; // Example password

        
        String validationMessage = (password.length() > 8 && 
                                     password.matches(".*[a-zA-Z].*") && 
                                     password.matches(".*[0-9].*"))
                                    ? "Password is valid"
                                    : "Password is invalid";

        System.out.println(validationMessage);

//Determine if a string is not null and starts with "A".


String r = "sahil";
System.out.println(r != null);



      

   //  Write a program to check if a person is eligible to vote (age >= 18) and is a citizen.


        boolean citizen = true;
        System.out.println("Person is eligible to vote: " + 
            ((age >= 18 && citizen) ? "True" : "False"));

   //  Check if a person is a teenager or senior


        boolean person = true;
        System.out.println("Person is a teenager or senior: " + 
            (((age >= 13 && age <= 19) || age > 60) ? "True" : "False"));

   //Write a condition to confirm if a variable is neither null nor empty.

          s="sahil";
          System.out.println(s!=null && s!="");

//Verify if a number is divisible by 7 and the sum of its digits is even.
 
  n1=42;
System.out.println(n1%7==0 &&  


//Write a condition to check if two numbers are both negative or both positive.
   S1=3;
   S2=-4 ;
    System.out.println(   

}}
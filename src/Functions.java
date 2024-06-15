import java.text.DecimalFormat;
import java.util.Scanner;

public class Functions {


////    A function to print my name    

//     public static void printMyName(String name) {        
//         System.out.println(name);
//         return;
//     }

//     public static void main(String[] args) {

//         System.out.print("Enter your name: ");

//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
        
//         System.out.print("Your name is: ");
//         printMyName(name);    ////    printMyName is called    

//     }
    
// }

        
////    Addition of two numbers    

    //     public static int calculateSum(int a, int b) {
    //         int sum = a + b;
    //         return sum;
    //     }
    
    //     public static void main(String[] args) {

    //         Scanner sc = new Scanner(System.in);
    
    //         System.out.print("Enter first number: ");
    //         int a = sc.nextInt();
    //         System.out.print("Enter second number: ");
    //         int b = sc.nextInt();
    
    //         int sum = calculateSum(a, b);
    
    //         System.out.println("Sum of two numbers is: "+sum);  ////   addTwoNumbers is called    

    // }

    

    ////    Multiplication of two numbers   

        // public static int calculateProduct(int a, int b) {
        //     return a * b;
        // }
        
        // public static void main(String args[]) {
        //     Scanner sc = new Scanner(System.in);

        //     System.out.println("Enter the first number: ");
        //     int a = sc.nextInt();
        //     System.out.println("Enter the second number: ");
        //     int b = sc.nextInt();

        //     System.out.println("The product of two numbers is: "+calculateProduct(a, b));
            
        // }


        ////    Evaluate the factorial of a number    

        // public static int printFactorial(int n) {
            
        //     if(n < 0) {
        //         System.out.println("Invalid Number");
        //         return n;
        //     }

        //     int factorial = 1;
        //     for(int i=n; i>=1; i--) {
        //         factorial = factorial * i;
        //     }
        //     System.out.print("The factorial of "+n+" is: ");
        //     System.out.println(factorial);
        //     return n;
        // }
        
        // public static void main(String args[]) {

        //     Scanner sc = new Scanner(System.in);
        //     System.out.print("Enter a number: ");
        //     int n = sc.nextInt();

        //     printFactorial(n);
                       
        // }


        //// Homework Problems 
        //? Make a function to check if a number is prime or not.
        //? Make a function to check if a given number n is even or not.
        //? Make a function to print the table of a given number n.
        //? Read about Recursion.


    ////    A number is prime or not    

    //     public static int printPrimeNumber(int n) {

    //         for(int i=2; i<n; i++) {
    //             if (n % i == 0) {
    //                 System.out.println("non prime");
    //                 break;       
    //             }
    //         }
    //         System.out.println("prime");
    //     return n;
    // }

    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner(System.in);
    //         System.out.println("Enter a number: ");
    //         int n = sc.nextInt();

    //         printPrimeNumber(n);
    //     }


////    A given number n is even or not    
// public static int evenOROdd(int n) {

//     if(n % 2 == 0) {
//         System.out.println("Even");
//     } else{
//         System.out.println("Odd");
//     }
//     return n;
// }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();

//         evenOROdd(n);
//         }


////    print the table of a given number n    

// public static int printTable(int n) {

//     for(int i=1; i<=10; i++){
//         System.out.println(n+" X "+i+" = "+n*i);
//     }
//     return n;
// }


// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number: ");
//     int n = sc.nextInt();

//     printTable(n);
// }

////    Recursion    
// public static void main(String[] args) {
//     sayHi(3);
// }

// public static void sayHi(int count) {
//     System.out.println("Hi");

//     if (count <= 1) {
//         return;
//     }
//     sayHi(count - 1);
// }


////  Questions  
//? 1. Enter 3 numbers from the user & make a function to print their average.
//? 2. Write a function to print the sum of all odd numbers from 1 to n.
//? 3. Write a function which takes in 2 numbers and returns the greater of those two.
//? 4. Write a function that takes in the radius as input and returns the circumference of a circle.
//? 5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
//? 6. Write an infinite loop using do while condition.
//? 7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
//? 8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
//? 9. Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
//? 10. Write a program to print Fibonacci series of n terms where n is input by user :
//? 0 1 1 2 3 5 8 13 21 ..... 
//? In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
//? (BONUS)


////   1.Enter 3 numbers from the user & make a function to print their average    

// public static void ptintAverage(int num1, int num2, int num3){

//     int average = ((num1+num2+num3)/3);
//     System.out.println("Average: "+average);
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the first number: ");
//     int num1 = sc.nextInt();
//     System.out.print("Enter the second num1: ");
//     int num2 = sc.nextInt();
//     System.out.print("Enter the third num1: ");
//     int num3 = sc.nextInt();
    
//     ptintAverage(num1, num2, num3);
// }


////   2.Write a function to print the sum of all odd numbers from 1 to n   

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the value of n: ");
//     int n = sc.nextInt();
//     sumOddNumber(n);
// }
// public static void sumOddNumber(int n){
//      int odd = (((n+1)/2)*((n+1)/2));    // sum of odd num 1 to n
//      int odd = (2*n)-1;    // nth odd number
//     System.out.println(odd);
// }


////   3. Write a function which takes in 2 numbers and returns the greater of those two    

// public static void printGreaterNumber(int a, int b){
//     if (a > b) {
//         System.out.println(a);
//     }
//     else if (a < b) {
//         System.out.println(b);
//     }
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the first number: ");
//     int a = sc.nextInt();
//     System.out.println("Enter the second number: ");
//     int b = sc.nextInt();
//     printGreaterNumber(a, b);
// }


////   4. Write a function that takes in the radius as input and returns the circumference of a circle   

// public static void printCircumference(double r){
//     double circumference = 2*3.1416*r;
//     DecimalFormat df = new DecimalFormat(".00");
//     System.out.println("The value of the circumference is: "+df.format(circumference));
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the value of radius: ");
//     double r = sc.nextDouble();
//     printCircumference(r);



////  5. Write a function that takes in age as input and returns if that person is eligible to vote or not. 
////  A person of age > 18 is eligible to vote  
   

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in)
    System.out.println("Enter age: ");
    int n =
}











 














    
}










































}

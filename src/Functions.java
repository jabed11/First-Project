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




        public static int printPrimeNumber(int n) {

            boolean prime = true;
            for(int i=2; i<n; i++) {
                if (n % i == 0) {
                    System.out.println("non prime");
                    break;       
                }
            }
            System.out.println(prime);
        return n;
    }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = sc.nextInt();

            printPrimeNumber(n);
        }

















}

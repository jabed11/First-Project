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
        public static int calculateProduct(int a, int b) {
            return a * b;
        }
        
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the first number: ");
            int a = sc.nextInt();
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();

            System.out.println("The product of two numbers is: "+calculateProduct(a, b));
            
        }

}

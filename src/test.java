import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        System.out.print("\"I love burger\"");
//        System.out.println("\\I love burger\\");
        //This is a comment
        /*This is also a comment*/

//        int a; //declaration
//        a = 5; //assignation
//        int b = 3; //initialization
//        float x = 3.1655666665f;
//        boolean z = false;
//        char symbol = '@';
//        String name = "Jabed";

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("what is your fav food?");
        String food = sc.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+"years old");
        System.out.println("You like "+food);















        }
}

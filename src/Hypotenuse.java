import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args) {

        double a, b, c ;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        a = sc.nextDouble();
        System.out.print("Enter side b: ");
        b = sc.nextDouble();


        c = Math.sqrt((a*a)+(b*b));
        System.out.println("The hypotenuse is: "+c);

        sc.close();

    }
}

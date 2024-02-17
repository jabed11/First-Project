import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        int ft_marks, st_marks, final_marks;
        double total_marks;


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your First Term mark: ");
        ft_marks = sc.nextInt();
        
        System.out.print("Enter your Second Term mark: ");
        st_marks = sc.nextInt();

        System.out.print("Enter your First Term mark: ");
        final_marks = sc.nextInt();
        
        total_marks = ft_marks/4.0+st_marks/4.0+final_marks/2.0;
        
        System.out.println(total_marks);

    }
    
}

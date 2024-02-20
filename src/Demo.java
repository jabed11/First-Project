public class Demo {
    public void method() {
        System.out.println("Inside abstract method");
    };
}
public class Sample2 {
    
    public static void main(String[] args) {
        Demo d = new Demo(){
            public void method(){
                System.out.println("Demo for method inside a method");
            }
        };
    }
}

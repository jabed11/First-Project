public class Patterns {
    public static void main(String[] args) {

        
// //    RECTANGLE           
//        int n=5;
//        for (int i=1; i<=4; i++){
//            for (int j=1; j<=n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


// //    HALF PYRAMID            
//        int n=5;
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



// //  UPSIDE DOWN HALF PYRAMID          
//        int n=5;
//        for (int i=1; i<=n; i++){
//            for (int j=n; j>=i; j--){
//                    System.out.print("*");
//            }
//            System.out.println();
//        }


// // BOX                  
//        int n=4, m=5;
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=m; j++){
//                if (i==1 || j==1 || i==n || j==m) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


// //INVERTED HALF PYRAMID
       int n=5;
       for (int i=1; i<=n; i++){
           for (int j=1; j<=n-i; j++){
               System.out.print(" ");
           }
           for (int j=1; j<=i; j++){
               System.out.print("*");
           }
           System.out.println();
       }

    }    
}

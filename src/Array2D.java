public class Array2D {
    public static void main(String[] args) {
        
        // 2d array = an array of arrays


                String[][] cars = {
                                    {"Camaro","Corvette","Silverado"},
                                    {"Tesla","Tesla","Mustang"},
                                    {"Ferrari","Lambo","F-150"}
                                  };

        // cars[0][0] = "Camaro";
        // cars[0][1] = "orvette";
        // cars[0][2] = "Silverado";
        // cars[1][0] = "Tesla";
        // cars[1][1] = "Ford";
        // cars[1][2] = "Mustang";
        // cars[2][0] = "Ferrari";
        // cars[2][1] = "Lambo";
        // cars[2][2] = "F-150";

        for(int i=0; i<cars.length; i++) {
            System.out.println();
            for(int j=0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
        }















    }
    
}

public class JavaSwitch  {
    public static void main(String[] args) {
        String day = "Today";

        switch (day) {
            case "Sunday": System.out.println("It is Thursday");
            break;
            case "Monday": System.out.println("It is Monday");
            break;
            case "Tuesday": System.out.println("It is Tuesday");
            break;
            case "Wednesday": System.out.println("It is Wednesday");
            break;
            case "Thursday": System.out.println("It is Thursday");
            break;
            case "Friday": System.out.println("It is Friday");
            break;
            case "Saturday": System.out.println("It is Saturday");
            break;
            default:
                System.out.println("Bro, that's no way a day!");
        }
    }
}
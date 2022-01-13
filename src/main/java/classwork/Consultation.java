package classwork;

public class Consultation {


    /*

    Print out seasons months by provided season
    // winter, spring, summer, autumn

     */


    public static void main(String[] args) {

        String currentSeason = "summer";

        if(currentSeason.equals("winter")) {
            System.out.println("December, January, February");
        } else if (currentSeason.equals("spring")) {
            System.out.println("March, April, May");
        } else if (currentSeason.equals("summer")) {
            System.out.println("June, July, August");
        } else if (currentSeason.equals("autumn")) {
            System.out.println("September, October, November");
        } else {
            System.out.println("Impossible to handle: " + currentSeason);
        }

        String currentMonth = "dkjadad";

        switch (currentMonth) {
            case "September":
            case "October":
            case "November":
                System.out.println("This is autumn");
                break;
            case "December":
            case "January":
            case "February":
                System.out.println("This is winter");
                break;
            default:
                System.out.println("This month is not supported: " + currentMonth);
        }
    }
}

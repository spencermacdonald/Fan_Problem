import java.util.Scanner;

public class FanDriver {
    public static void main(String[] args){
        /* setting up variables */
        Fan fan = new Fan();
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        /* printing information to user */
        System.out.println("Enter 'd' to change the direction of the fan or enter 's' to increase the speed of the fan.");
        System.out.println("Enter any other key to exit.");

        /* Executing functionality */
        while (running) {
            String userInput = sc.nextLine();
            if (userInput.compareToIgnoreCase("s") == 0) {
                fan.speedCord();
            } else if (userInput.compareToIgnoreCase("d") == 0) {
                fan.directionCord();
            } else {
                running = false;
            }
            System.out.println(fan);
        }
        
    }
}

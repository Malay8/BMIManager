import java.util.Scanner;

/**
 * Created by jc277099 on 16/03/15.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("BMI  Manager");

        Patient patient=new Patient();
        running:
        while (true) {
            System.out.println("Please select from the " + "following menu options:\n" +
                    "\t1. Add new patient\n" +
                    "\t2. View patient\n" +
                    "\t3. Exit\n");
            System.out.println("Enter choice:");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1: {
                    double height,weight;
                    //double bmi = ((weight * 703)/(height * height));
                    System.out.println("Enter your name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter your age:");
                    String age = scanner.nextLine();

                    System.out.println("Enter your height and weight: ");
                    String details = scanner.nextLine();
                    break;
                }
                case 2: {

                    System.out.println("Your name is " + "%s");
                    System.out.println("Your age is " + "%d");
                    System.out.println("Your bmi is " + "%.2f");
                    break;
                }
                case 3: {
                    System.out.println("Good Bye!");
                    break running;
                }

            }
        }
    }
}
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
                    addPatient(patient, scanner);
                    break;
                }
                case 2: {
                    viewPatient(patient);
                    break;
                }
                case 3: {
                    System.out.println("Good bye!");
                    break running;
                }
            }
        }
    }
    private static void viewPatient(Patient patient) {
        System.out.println(String.format("Name: %s Age: %d BMI:%.2f", patient.getName(), patient.getAge(), patient.getBMI()));
    }

    private static void addPatient(Patient patient, Scanner scanner){
        System.out.print("Enter your Name: ");
        patient.setName(scanner.nextLine());
        System.out.print("Enter your Age: ");
        patient.setAge(scanner.nextInt());
        System.out.print("Height and Weight: ");
        patient.setDetails(scanner.nextDouble(), scanner.nextDouble());
    }
}

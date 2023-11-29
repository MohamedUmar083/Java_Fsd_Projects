import java.util.Scanner;
import java.util.regex.Pattern;

public class emailIdValidation {
    public static void main(String[] args) {

        String[] emailArray = {"sundhar@gmail.com", "musk@twitter.com", "timcook@icloud.com",};
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.print("Enter the email ID to search: ");

        String searchEmail = scanner.nextLine();

        if (isValidEmail(searchEmail)) {

            boolean found = searchEmail(emailArray, searchEmail);


            if (found) {
                System.out.println("Email ID found!");
            } else {
                System.out.println("Email ID not found.");
            }
        } else {
            System.out.println("Invalid email format. Please enter a valid email ID.");
        }


    }


    private static boolean searchEmail(String[] emailArray, String searchEmail) {
        for (String email : emailArray) {
            if (email.equalsIgnoreCase(searchEmail)) {
                return true;
            }
        }
        return false;
    }
    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.matches(emailRegex, email);
    }

}

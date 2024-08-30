import java.util.Scanner;

public class BonusTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something: ");
        String enteredString = scan.nextLine();
        for (int i = 0; i < enteredString.length(); i++) {
            System.out.println(enteredString.charAt(i));
        }
    }
}

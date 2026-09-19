import java.util.Scanner;
public class Main {
    static void checkPinLength(String pin) {
        if (pin.length()!= 4) {
            System.out.println("Invalid PIN length. PIN must be 4 digits.");
        } else {
            System.out.println("Valid PIN length.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a PiN: ");
        String pin = scanner.next();
        checkPinLength(pin);
    }
}
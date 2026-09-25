import java.util.Scanner;
public class Main {
    // Method 1: Normalize the code
    static String normalizeCode(String raw) {
        // Remove leading and trailing spaces
        String code = raw.trim();
        // Convert only first 3 characters to uppercase
        String publisher = code.substring(0, 3).toUpperCase();
        // Keep remaining characters unchanged
        String rest = code.substring(3);
        return publisher + rest;
    }
    // Method 2: Validate and format the code
    static String validateAndFormat(String code) {
        // Check length
        if (code.length() != 13) {
            return "Invalid: wrong length";
        }
        // Check first 3 characters are letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }
        // Check remaining 10 characters are digits
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }
        // Build formatted output
        StringBuilder result = new StringBuilder();
        result.append("[");
        result.append(code.substring(0, 3));
        result.append("] YEAR: ");
        result.append(code.substring(3, 7));
        result.append(" | CATALOG: ");
        result.append(code.substring(7, 13));
        return result.toString();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN code: ");
        String rawCode = sc.nextLine();

        // Step 1: Normalize
        String normalizedCode = normalizeCode(rawCode);

        // Step 2: Validate and format
        String result = validateAndFormat(normalizedCode);

        // Step 3: Print result
        System.out.println(result);
        sc.close();
    }
}
import java.util.Scanner;
public class Main {
    void reverse(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder rev = new StringBuilder();
            for (int j = words[i].length() - 1; j >= 0; j--) {
                rev.append(words[i].charAt(j));
            }
            result.append(rev);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = sc.nextLine();

        new Main().reverse(inputSentence);  // reverse() is non-static, so call it on an instance

        sc.close();
    }
}
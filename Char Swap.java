import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.length() < 2) {
            System.out.println("Output: " + input);
        } else {
            
            String result = input.charAt(input.length() - 1) 
                          + input.substring(1, input.length() - 1) 
                          + input.charAt(0);

            System.out.println("Output: " + result);
        }

        scanner.close();
    }
}

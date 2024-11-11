public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "madam";
        
        if (isPalindrome(input)) {
            System.out.println("It is aPalindrome");
        } else {
            System.out.println(" It is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        
        str = str.toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
      
        return str.equals(reversed);
    }
}

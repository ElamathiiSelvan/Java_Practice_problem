public class StringLength {
    public static void main(String[] args) {
        String input = "Hello";
        int length = 0;

        
        for (char c : input.toCharArray()) {
            length++;
        }

       
        System.out.println("Length of the string: " + length);
    }
}

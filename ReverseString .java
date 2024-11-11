public class ReverseString {
    public static void main(String[] args) {
        
        String inputString = "OpenAI";
    
        
        String reversedString = new StringBuilder(inputString).reverse().toString();
        System.out.println(reversedString);
    }
}

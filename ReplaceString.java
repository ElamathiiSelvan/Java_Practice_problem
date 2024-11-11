public class ReplaceCharacter {
    public static void main(String[] args) {
        
        String inputString = "banana";
       
        char charToReplace = 'a';
        char replacementChar = 'o';
        
        String replacedString = inputString.replace(charToReplace, replacementChar);
        System.out.println(replacedString);
    }
}

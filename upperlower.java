public class UpperLowerCount {
    public static void main(String[] args) {
        String str = "Java";
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }

        System.out.println("Uppercase count: " + uppercaseCount);
        System.out.println("Lowercase count: " + lowercaseCount);
    }
}

public class ReversedJava {
    public static void main(String[] args) {
        String originalString = "so we learning";
        String reversedString = reverseString(originalString);
        System.out.println(reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
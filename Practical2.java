public class Practical2 {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "   Java Programming   ";
        String str3 = "HELLO";

        // 1. length()
        System.out.println("Length of str1: " + str1.length());

        // 2. charAt()
        System.out.println("Character at index 4: " + str1.charAt(4));

        // 3. substring()
        System.out.println("Substring from index 6: " + str1.substring(6));
        System.out.println("Substring from 0 to 5: " + str1.substring(0, 5));

        // 4. contains()
        System.out.println("str1 contains 'World'? " + str1.contains("World"));

        // 5. equals() and equalsIgnoreCase()
        System.out.println("str1 equals 'Hello World'? " + str1.equals("Hello World"));
        System.out.println("str1 equalsIgnoreCase 'hello world'? " + str1.equalsIgnoreCase("hello world"));

        // 6. compareTo() and compareToIgnoreCase()
        System.out.println("Compare str1 and str3: " + str1.compareTo(str3));
        System.out.println("Compare (ignore case): " + str1.compareToIgnoreCase(str3));

        // 7. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 8. trim()
        System.out.println("Trimmed str2: '" + str2.trim() + "'");

        // 9. replace()
        System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));

        // 10. startsWith() and endsWith()
        System.out.println("str1 starts with 'Hello'? " + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'World'? " + str1.endsWith("World"));

        // 11. indexOf() and lastIndexOf()
        System.out.println("Index of 'o': " + str1.indexOf('o'));
        System.out.println("Last index of 'o': " + str1.lastIndexOf('o'));

        // 12. isEmpty()
        String emptyStr = "";
        System.out.println("emptyStr is empty? " + emptyStr.isEmpty());

        // 13. split()
        String[] words = str1.split(" ");
        System.out.println("Split str1:");
        for (String word : words) {
            System.out.println(word);
        }

        // 14. concat()
        System.out.println("Concatenation: " + str1.concat(" - " + str3));

        // 15. matches() (Regex check)
        System.out.println("str1 matches 'Hello.*'? " + str1.matches("Hello.*"));

        // 16. valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("String value of int: " + numStr);

        // 17. toCharArray()
        char[] charArray = str1.toCharArray();
        System.out.println("Characters in str1:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
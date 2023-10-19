public class StringMethodsDemo {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "world!";
        String str3 = "Java is fun.";
        String str4 = "Java is platform-independent";
        String str5 = "PYTHON";
        String str6 = "Artificial Intelligence";
        String str7 = "C++";
        String str8 = "Data Science";
        String str9 = "HTLM&CSS";
        String str10 = "Example";

        // String method examples
        System.out.println("1. Concatenation: " + str1.concat(str2));
        System.out.println("2. Length: " + str3.length());
        System.out.println("3. Uppercase: " + str4.toUpperCase());
        System.out.println("4. Lowercase: " + str5.toLowerCase());
        System.out.println("5. Substring: " + str6.substring(3, 11));
        System.out.println("6. Index Of: " + str7.indexOf("rogram"));
        System.out.println("7. Replace: " + str8.replace("Science", "Analysis"));
        System.out.println("8. Trim: " + "  " + str9.trim() + "  ");
        System.out.println("9. StartsWith: " + str10.startsWith("Ex"));
        System.out.println("10. EndsWith: " + str10.endsWith("ple"));
    }
}

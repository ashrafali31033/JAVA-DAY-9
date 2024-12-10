public class Main {
    public static void main(String[] args) {
        String str = "hello world";
        String upperCaseStr = str.toUpperCase();
        String LowerCaseStr = str.toLowerCase();
        System.out.println(upperCaseStr);
        System.out.println(LowerCaseStr);
         // prints "HELLO WORLD"

        char c = 'a';
        char upperCaseC = Character.toUpperCase(c);
        char LowerCaseC = Character.toLowerCase(c);

        System.out.println(upperCaseC);
        System.out.println(LowerCaseC); // prints 'A'
    }
}
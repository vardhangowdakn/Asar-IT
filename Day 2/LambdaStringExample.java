import java.util.*;

@FunctionalInterface
interface StringOperation {
    String operate(String input);

}

public class LambdaStringExample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        StringOperation toUpperCase = s -> s.toUpperCase();
        StringOperation toLowerCase = s -> s.toLowerCase();
        StringOperation reverse = s -> new StringBuilder(s).reverse().toString();
        StringOperation length = s -> "Length:" + s.length();

        System.out.println("Original: " + name);
        System.out.println("UpperCase: " + toUpperCase.operate(name));
        System.out.println("LowerCase: " + toLowerCase.operate(name));
        System.out.println("Reverse: " + reverse.operate(name));
        System.out.println("Length: " + length.operate(name));

    }
}

// output

// Original: Vardhan
// UpperCase: VARDHAN
// LowerCase: vardhan
// Reverse: nahdraV
// Length: Length:7
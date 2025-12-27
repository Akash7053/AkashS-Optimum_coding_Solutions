package String_programs;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reverse_String {
    public static void main(String[] args) {
        // Using reduce method
        String string = "Akash";
        String revString = string.chars().mapToObj(c -> (char) c).map(String::valueOf).reduce("", (a, b) -> b + a);
        System.out.println(revString);

        // Using IntStream and collect
        String string1 = "Aaksh";
        String rev = IntStream.rangeClosed(1, string1.length())
                .mapToObj(i -> string1.charAt(string1.length() - i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(rev);

      // Using character array
        String string2 = "Akash";
        char[] chr = string2.toCharArray();
        for (int i = chr.length - 1; i >= 0; i--) {
            System.out.println(chr[i]);
        }
       // Directly looping through string lentgh
        String string3 = "Akash";
        for (int i = string3.length() - 1; i >= 0; i--) {
            System.out.println(string2.charAt(i));
        }

    }
}
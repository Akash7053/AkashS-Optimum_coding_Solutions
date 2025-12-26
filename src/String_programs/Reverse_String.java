package String_programs;

public class Reverse_String {
    public static void main(String[] args) {
        String string = "Akash";
        String revString = string.chars().mapToObj(c -> (char) c).map(String::valueOf).reduce("", (a, b) -> b + a);
        System.out.println(revString);
    }}
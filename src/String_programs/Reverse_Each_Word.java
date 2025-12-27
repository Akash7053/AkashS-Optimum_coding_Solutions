package String_programs;

public class Reverse_Each_Word {
    public static void main(String[] args) {
        String string = "Akash is a good boy";
        String[] str = string.split(" ");

        String reversed = "";
        for (String strg : str) {
            String rev = "";
            char[] chr = strg.toCharArray();
            for (int i = chr.length - 1; i >= 0; i--) {
                char ch = chr[i];
                rev = rev + ch;
            }
            reversed = reversed + rev + " ";
        }

        System.out.println(reversed);
    }
}


import java.util.Scanner;

public class StringPlay {

    public static String capitalizeLetter(String letter){
        return letter.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println(capitalizeLetter("a"));
        String letter = scan.next();
        System.out.println(capitalizeLetter(letter));
    }
}

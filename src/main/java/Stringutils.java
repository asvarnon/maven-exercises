import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Stringutils {

    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        String input = scan.nextLine();
        System.out.println("You entered " + input);
        if(StringUtils.isNumeric(input)){
            System.out.println(input + " is a number");
        } else {
            System.out.println(input + " is not a number");
        }

        System.out.println("Flipped case: " + StringUtils.capitalize(input));
    }
}

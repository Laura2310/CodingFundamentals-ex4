import java.util.Scanner;
import java.util.regex.Pattern;

public class ArrayAbc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = input.nextLine().split(" "); //citeste si le pune intr-un array
        // "abc", "afdas", "abbbc

        for(String e:array){
            if(Pattern.matches(".*?a.*?b.*?c.*?",e))
                System.out.println(e);
        }

    }
}

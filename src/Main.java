import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {

        A a = new A();
        a.ah();


        while (true) {

            int number = 0;
            System.out.println("Введите строку");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();

            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                number = Integer.parseInt(matcher.group())+number;
                }
            System.out.println(number);
            System.out.println("2222");

        }
    }
}

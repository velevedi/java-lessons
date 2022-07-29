import java.util.Scanner;

public class ReadingOffConsole {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = "";
        while (!"finish".equals(line)) {
            System.out.print("> ");
            line = scanner.nextLine();
            System.out.println(">>> " + line);
        }

    }

}

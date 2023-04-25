import java.util.Scanner;
public class TriangleStar {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input Triangle height");
        int n = keyboard.nextInt();

        for (int i = 0; i <= n; i++) {
            String space = " ".repeat((n - i ));
            System.out.println(space + "*".repeat(2*i+1) + space);
        }
    }
}


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class DaysOfaMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter month: ");
        String inputStr = keyboard.nextLine();
        System.out.println("Enter year: ");
        int yearInt = keyboard.nextInt();

        int index;
        int[] daysArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (inputStr.length() < 3) {
            index = Integer.parseInt(inputStr)-1;
        } else {
            inputStr = inputStr.substring(0, 3);
            List<String> monthsLs = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
            index = monthsLs.indexOf(inputStr);
        }

        boolean isLeapYear = false;
        if (yearInt % 4 == 0) {
            if (yearInt % 100 == 0) {
                if (yearInt % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear && index == 1) {
            System.out.println(28);
        } else {
            System.out.println(daysArr[index]);
        }
    }
}

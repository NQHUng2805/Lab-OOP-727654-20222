import java.util.Scanner;
public class FindRoots {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        boolean WrongNumber = false;

        while (WrongNumber == false){
            System.out.println("Input Function's Degree ");
            int deg = key.nextInt();
            if (deg == 1){
                System.out.println("Input variables number");
                int var = key.nextInt();
                if ( var == 1){
                   System.out.println("input a and b");
                   double a = key.nextLong();
                   double b = key.nextLong();

                   if (a==0){
                    System.out.println(" This system has no solution");
                    System.exit(0);
                   }

                   else {
                    double x =(-b)/a;
                    System.out.println(String.format("Solution: %.2f",x));
                    System.exit(0);
                   }
                }

                else if ( var == 2){     
                    System.out.println("input a1, a2, b of first equation");
                    double a11 = key.nextInt();
                    double a12 = key.nextInt();
                    double b1 = key.nextInt();
                    System.out.println("input a1, a2, b of second equation");
                    double a21 = key.nextInt();
                    double a22 = key.nextInt();
                    double b2 = key.nextInt();
                    double detD = a11 * a22 - a21 * a12;
                    if (detD == 0) {
                         System.out.println("System have no solution/infinitely many solutions");
                         System.exit(0);
                    }
                    else {
                        double detD1 = b1 * a22 - b2 * a12;
                        double detD2 = a11 * b2 - a21 * b1;
                        double x1 = detD1 / detD;
                        double x2 = detD2 / detD;
                        System.out.printf("Solution: %.2f and %.2f\n", x1, x2);
                        System.exit(0);
                    }
                }
                else{
                    System.out.println("Wrong input, please input again");
                    WrongNumber = true;
                }   
            }

            else if (deg == 2) {
                System.out.println("input a, b, c of quadratic equation");
                double a = key.nextInt();
                double b = key.nextInt();
                double c = key.nextInt();
                double Delta = b*b - 4*a*c;
                if (Delta < 0) {
                    System.out.println("System have no solution");
                    System.exit(0);
                }
    
                else if(Delta == 0){
                    double x = -b/(2*a);
                    System.out.printf("Duplicate solution %.2f", x);
                    System.exit(0);
                }
    
                else{
                    double x1 = (-b-Delta)/(2*a);
                    double x2 = (-b+Delta)/(2*a);
                    System.out.printf("Two solution %.2f and %.2f", x1, x2);
                    System.exit(0);
                }
            }
            else{
                System.out.println("We dont support that degree function, please input again");
            }    
        key.close();
        }
    }
}

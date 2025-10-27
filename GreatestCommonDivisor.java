import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1 = scan.nextInt();
        System.out.println("enter 2nd number");
        int num2 = scan.nextInt();

        int num3 = gcd(num1 , num2);

        System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is : " + num3 );

        scan.close();
    }

    private static int gcd(int num1, int num2) {
      
        int a = Math.abs(num1);
        int b = Math.abs(num2);
        if (a == 0) return b;
        if (b == 0) return a;
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}

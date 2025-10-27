
    import java.util.Scanner;
import java.util.Random;

public class IsPalindromeReverse {

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        return reversed;
    }
    
    
    public static boolean isPalindrome(int number, int userReverse) {
        int correctReverse = reverse(number);
        int counter = 0;
        int digits = 0;
        

        int temp = number;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        

        int num1 = correctReverse;
        int num2 = userReverse;
        
        for (int i = 0; i < digits; i++) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            

            for (int j = 0; j < 1; j++) {
                if (digit1 == digit2) {
                    counter++;
                }
            }
            
            num1 /= 10;
            num2 /= 10;
        }
        

        return counter == digits;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        

        int number = random.nextInt(900) + 100;
        

        System.out.print("Enter the reverse of " + number + ": ");
        int userReverse = input.nextInt();
        

        boolean result = isPalindrome(number, userReverse);
        

        System.out.println("The digit " + userReverse + " is palindrome of " + 
                          number + " is " + result + ".");
        
        input.close();
    }
}


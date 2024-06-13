
import java.util.*;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("enter operator");
        int operator = sc.nextInt();

        /**
         * 1-> a+b 2-> a-b 3-> a*b 4-> a%b 5-> a/b
         */
        switch (operator) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("invalid");
                } else {
                    System.out.println(a % b);
                }
                break;
            case 5:
                if (b == 0) {
                    System.out.println("invalid");
                } else {
                    System.out.println(a / b);
                }
                break;

            default:
                System.out.println("invalid");
                break;
        }

    }
}

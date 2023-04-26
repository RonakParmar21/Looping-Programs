import java.net.SocketTimeoutException;
import java.util.*;

public class looping {
    Scanner sc = new Scanner(System.in);

    public void first() {
        /*
         * 1, 2, 3, 4, 5, 6, 7, 8, 9....…..…………………n
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("1st Program...");
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public void second() {
        /*
         * Write a program to print n to 1 numbers.
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("2nd Program...");
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public void third() {
        /*
         * Write a Program to print 1 to n odd numbers
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("3rd Program...");
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public void four() {
        /*
         * Write a Program to print 1 to n even numbers
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("4th Program...");
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int i = 0;
        while (i <= n) {
            System.out.print(i + ", ");
            i += 2;
        }
        System.out.println();
    }

    public void five() {
        /*
         * Write a Program to print n to 1 even numbers
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("5th Program...");
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i -= 2) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public void six() {
        /*
         * Write a Program to print n to 1 odd numbers
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("6th Program...");
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 1) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    public void seven() {
        /*
         * 1+2+3+4+5+6+7+8+9.…………………………n
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("7th Program...");
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "+");
        }
        System.out.println();
    }

    public void eight() {
        /*
         * 1, 4, 9, 16, 25, 36………………………………n
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("8th Program...");
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + ", ");
        }
        System.out.println();
    }

    public void nine() {
        /*
         * 1+4+9+16+25+36....……………………………n
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("9th Program...");
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + "+");
        }
        System.out.println();
    }

    public void ten() {
        /*
         * 1, 1, 2, 3, 5, 8, 13, 21.…………………………n.
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("10th Program...");
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int a = 1, b = 0, sum = 0;
        System.out.print((a + b) + ", ");
        for (int i = 1; i <= n; i++) {
            sum = a + b;
            System.out.print(sum + ", ");
            b = a;
            a = sum;
            sum = b;
        }
        System.out.println();
    }

    public void eleven() {
        /*
         * 1, 2, 4, 7, 11, 16…………………………………n
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("11th Program...");
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int a = 1, sum = 0;
        System.out.print(a + ", ");
        for (int i = 1; i <= n; i++) {
            sum = a + i;
            System.out.print(sum + ", ");
            a = sum;
        }

        System.out.println();
    }

    public void twelve() {
        /*
         * Write a Program to Generate a Series like 2 4 8 16 32…1048
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("12th Program...");
        int a = 2, mul = 1;
        for (int i = 1; i <= 10; i++) {
            mul *= a;
            System.out.print(mul + ", ");
        }
        System.out.println();
    }

    public void thirteen() {
        /*
         * Write a Program to Generate a Series like 1 11 20 28 35 41 46 50 53 55 56
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("13th Program...");
        int a = 1, sum = 0;
        System.out.print(a + ", ");
        for (int i = 10; i >= 1; i--) {
            sum = a + i;
            System.out.print((i + a) + ", ");
            a = sum;
        }
        System.out.println();
    }

    public void fourteen() {
        /*
         * Write a Program to Generate a Series like 1 10 2 9 3 8 4 7 5 6
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("14th Program...");
        int sum = 0, a = 1;
        for (int i = 9; i >= 1; i--) {
            sum = a + i; // 9 + 9
            System.out.print(sum + ", ");
            a = sum;
            a--;
            sum--;
        }
        System.out.println();
    }

    public void fifteen() {
        /*
         * Write a program to generate series like 2 5 10 17 26………..n (Square + 1
         * Series)
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("15th Program...");
        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + 1 + " ");
        }
    }

    public void sixteen() {
        /*
         * Write a Program to Calculate the Series like 1-2+3-4…. –10 (Result = -5)
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("16th Program...");
        int odd = 0, even = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                even += i;
                System.out.print(even + "+");
            } else {
                odd += i;
                System.out.print(odd + "-");
            }
        }
        int res = odd - even;
        System.out.println("\nThe Result is : " + res);
    }

    public void seventeen() {
        /*
         * Write a Program enter number from user and check number is prime or not.
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("17th Program...");
        boolean isPrime = false;
        System.out.println("Enter any Number : ");
        int n = sc.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not prime");
                isPrime = true;
                break;
            } else {
                isPrime = false;
            }
        }
        if (isPrime == false) {
            System.out.println(n + " is Prime");
        }
    }

    public void eighteen() {
        /*
         * Write a program following series.
         * 2 3 5 9 17 33 65 …….n
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("18th Program...");
        int n = 2, ans = 1 + 1;
        for (int i = 1; i <= 10; i++) {
            System.out.print(ans + ", ");
            n = ans;
            ans = n + (n - 1);
        }
        System.out.println();
    }

    public void ninteen() {
        /*
         * Write a program to print first 10 numbers of fibonacci series.
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("19th Program...");
        int a = 1, b = 0, sum = 0;
        int arr[] = new int[10];
        System.out.print(a + " ");
        for (int i = 1; i <= 20; i++) {
            sum = a + b;
            System.out.print(sum + " ");
            int temp = a;
            a = sum;
            b = temp;
        }
    }

    public void twenty() {
        /*
         * Write a Program to generate the following output
         * 1+2+3+4+5+6+7+8+9+10=55
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("20th Program...");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "+");
            sum += i;
        }
        System.out.println("\nSum is : " + sum);
    }

    public static void main(String[] args) {
        looping l = new looping();

        l.first();
        l.second();
        l.third();
        l.four();
        l.five();
        l.six();
        l.seven();
        l.eight();
        l.nine();
        l.ten();
        l.eleven();
        l.twelve();
        l.thirteen();
        l.fourteen();
        l.fifteen();
        l.sixteen();
        l.seventeen();
        l.eighteen();
        l.ninteen();
        l.twenty();
    }
}
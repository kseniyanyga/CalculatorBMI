package gcd;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();

        System.out.println("GCD is:" + gcd(a, b));
        System.out.println("LCM is: " + lcm(a,b));

    }

    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static int lcm(int a, int b){
        return a/gcd(a,b)*b;
    }
}

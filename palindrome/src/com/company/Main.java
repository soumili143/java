package com.company;

import java.util.Scanner;

class palin {
    int reverse(int n) {
        int d, rev = 0;
        do {
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        } while (n != 0);
        return (rev);
    }

    public static void main (String[] args)

    {
        Scanner in = new Scanner(System.in);
        int k, a, c;
        palin ob = new palin();
        System.out.println("enter your no.");
        a = in.nextInt();
        c = a;
        k = ob.reverse(a);
        if (k == c)
            System.out.println("palindrome");
        else
            System.out.println("not palindrme");
    }
}

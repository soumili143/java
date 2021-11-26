package com.company;

import java.util.*;
class palin {
    private int i;
    public void getNum(int x) {
        i = x;
    }
    public boolean isPalindrome() {
        int n, sum, d;

        n = i;
        sum = 0;
        while (n > 0) {
            d = n % 10;
            sum = (sum * 10) + d;
            n /= 10;
        }
        if (sum == i) return true;
        else return false;
    }
}

public class palindrome {
    public static void main(String[] s) {
        palin dig = new palin();
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an +ve integer number: ");
        n = sc.nextInt();

        dig.getNum(n);
        if (dig.isPalindrome()) {
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }

    }
}
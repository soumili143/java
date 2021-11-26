package com.company;

public class Main {

    public static void main(String[] args)

            int reverse(int n) {
                int d, rev = 0;
                do {
                    d = n % 10;
                     rev = rev * 10 + d;
                   n = n / 10;
                } while (n != 0);
                return (rev);
            }

     public static void main ()

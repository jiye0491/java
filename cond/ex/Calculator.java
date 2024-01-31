package cond.ex;

import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = sc.next();

        if (str.equals("+")){
            System.out.println(a + b);
        }
        if (str.equals("-")){
            System.out.println(a - b);
        }
        if (str.equals("/")){
            System.out.println(a / b);
        }
        if (str.equals("*")){
            System.out.println(a * b);
        }

    }
}
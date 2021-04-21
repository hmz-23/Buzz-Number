package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        if(n%7==0 || n%10==7){
            System.out.println("It is a Buzz Number");
        }
        else{
            System.out.println("It is not a Buzz Number");
        }
    }
}

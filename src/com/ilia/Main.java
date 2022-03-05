package com.ilia;
import java.util.Scanner;


interface MyInteger {
    public void isEven();
    public void isOdd();
    public void isPositive();
    public void isNegative();
    public void isZero();
}

  class Number implements MyInteger {
    public void isOdd() {
        System.out.println("The integer you entered is odd.");
    }
    public void isEven(){
        System.out.println("The integer you entered is even.");
    }
    public void isPositive(){
        System.out.println("The integer you entered is positive.");
    }
    public void isNegative(){
        System.out.println("The integer you entered is negative.");
    }
    public void isZero(){
        System.out.println("The integer you entered is zero.");
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int num = scanner.nextInt();

        Number myNumber = new Number();
        if (num % 2 == 0)
            myNumber.isEven();
        else
            myNumber.isOdd();

        if ( num > 0)
            myNumber.isPositive();
        else if ( num == 0)
            myNumber.isZero();
        else
            myNumber.isNegative();
    }
}
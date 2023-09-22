package Looping;

import Condition.Method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=>>>Nhập 2 số number1 và number2: ");
        System.out.println("Nhập vào number1:");
        int number1 = scanner.nextInt();
        System.out.println("Nhập vào number2:");
        int number2 = scanner.nextInt();
        System.out.println();

        System.out.println("=>>> Số lẻ");
        String oddNumbers = Looping.printOddNumbers(number1, number2);
        System.out.println("Số lẻ từ " + number1 + " đến " + number2 + " là: " + oddNumbers);
        System.out.println();

        System.out.println("=>>> tìm printFizzBuzz: ");
        String result = Looping.printFizzBuzz(number1, number2);
        System.out.println(result);
        System.out.println();

        System.out.println("=>>> Số chính phương ");
        String results = Looping.printPerfectSquares(number1, number2);
        System.out.println(results);

        System.out.println("=>>> Tổng số chẵn ");
        int sum = Looping.sumEvenNumbers(number1,number2);
        System.out.println(sum);
        System.out.println();


        System.out.println("=>>> Tổng bình phương number1 đến number2");
        int sumSquared = Looping.sumOfSquares(number1,number2);
        System.out.println(sumSquared);
        System.out.println();

        System.out.println("=>>> Ước chung lớn nhất và Bội chung nhỏ nhất");
        System.out.println("Ước chung lớn nhất của " + number1 + " và " + number2 + " là: " + Looping.UCLN(number1, number2));
        System.out.println("Bội chung nhỏ nhất của " + number1 + " và " + number2 + " là: " + Looping.BCNN(number1, number2));
    }





    }




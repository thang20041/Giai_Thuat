package Condition;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("=>>> Kiểm tra số chẵn số lẻ " + "" +
//                "");
//        System.out.println("Nhập vào 1 số:");
//        int num = scanner.nextInt();
//        Method.checkNumberEvenAndOdd(num);
//
//        System.out.println("=>>> Số lớn nhất trong 3 số" + "" +
//                "");
//        System.out.println("Nhập vào 3 số:");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int max = Method.findMax(a, b, c);
//        System.out.println("Số lớn nhất là: " + max);
//
//        System.out.println("=>>> Tam giác" + "" + "");
//        System.out.println("Nhập vào 3 cạnh của tam giác:");
//        int side1 = scanner.nextInt();
//        int side2 = scanner.nextInt();
//        int side3 = scanner.nextInt();
//        String result = Method.checkTriangle(side1, side2, side3);
//        System.out.println(result);
//
//
//        System.out.println("=>>> Phân loại học sinh");
//        System.out.println("Nhập vào điểm của học sinh: ");
//        double score = scanner.nextDouble();
//        Method.classifyStudent(score);

        System.out.println("=>>> Tính lãi ngân hàng:");
        System.out.println("Nhập số tiền vay: ");
        double principal = scanner.nextDouble();
        System.out.println("Nhập số phần trăm  lãi suất ");
        double rate = scanner.nextDouble();
        System.out.println("Nhập thời gian vay/năm: ");
        int time = scanner.nextInt();

    }
}

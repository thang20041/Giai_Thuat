package Condition;

public class Method {
    public static void checkNumberEvenAndOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " là số chẵn");
        } else {
            System.out.println(num + " là số lẻ");
        }
    }
    public static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
    public static String checkTriangle(int a, int b, int c) {

        if (!isTrangle(a, b, c)) {
           return  "Khong phai la tam giac";
        }

        if (isEquilateraleTriangle(a, b ,c)) {
            return "La tam giac deu";
        }

        if (isIsoscelesTriangle(a, b, c)) {
            return "La tam giac can";
        }

        return "tam giac thuong";

    }
    public static String classifyStudent(double score) {
        if (score < 5) {
            return "Học sinh yếu";
        } else if (score < 7) {
         return "Học sinh trung bình";
        } else if (score < 8) {
            return "Học sinh khá";
        } else {
           return "Học sinh giỏi";
        }
    }
    public static double calculateBankInterest(double principal, double rate, int time) {
        return principal * Math.pow(1 + rate / 100, time);
    }


    private static boolean isIsoscelesTriangle(int a, int b, int c) {
        return a == b || a == c || b == c;
    }

    private static boolean isEquilateraleTriangle(int a, int b, int c) {
        return a == b && b == c;
    }

    private static boolean isTrangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }


}

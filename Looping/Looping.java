package Looping;

public class Looping {
    public static String printOddNumbers(int number1, int number2) {
        StringBuilder oddNumbers = new StringBuilder();
        for (int i = number1; i <= number2; i++) {
            if (isOdd(i)) {
                oddNumbers.append(i).append(" ");
            }
        }
        return oddNumbers.toString();
    }

    public static String printFizzBuzz(int number1, int number2) {
        String result = "";
        for (int i = number1; i <= number2; i++) {
            if (isFizzBuzz(i)) {
                result += i + " FizzBuzz\n";
            } else if (isFizz(i)) {
                result += i + " Fizz\n";
            } else if (isBuzz(i)) {
                result += i + " Buzz\n";
            } else {
                result += i + " Số không chia hết cho 3 || 5 \n";
            }
        }
        return result;
    }

    public static String printPerfectSquares(int number1, int number2) {
        String results = "";
        for (int i = number1; i <= number2; i++) {
            if (isPerfectSquare(i)) {
                results += i + "\n";
            }
        }
        return results;
    }

    public static int sumEvenNumbers(int number1, int number2) {
        int sum = 0;
        for (int i = number1; i <= number2; i++) {
            if (isSumEven(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static int sumOfSquares(int number1, int number2) {
        int total = 0;
        for (int i = number1; i <= number2; i++) {
            total += i * i;
        }
        return total;
    }

    public static int UCLN(int number1, int number2) {
        for (; number2 != 0; ) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }

    public static int BCNN(int number1, int number2) {
        return (number1 * number2) / UCLN(number1, number2);
    }

    private static boolean isSumEven(int i) {
        return i % 2 == 0;
    }


    private static boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    private static boolean isFizz(int i) {
        return i % 3 == 0;
    }

    private static boolean isFizzBuzz(int i) {
        return i % 3 == 0 && i % 5 == 0;
    }


    private static boolean isPerfectSquare(int num) {
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }

    private static boolean isOdd(int i) {
        return i % 2 != 0;
    }

}

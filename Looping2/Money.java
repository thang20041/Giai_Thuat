package Looping2;

public class Money {
    public static String findAllCombinations() {
        int count = 0;
        String result = "";
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 10; j++) {
                for (int k = 0; k <= 4; k++) {
                    if (isAllOptions(i, j, k)) {
                        count++;
                        result += "Phương án " + count + ": " + i + " tờ 1000 đồng, " + j + " tờ 2000 đồng, " + k + " tờ 5000 đồng\n";
                    }
                }
            }
        }
        if (count == 0) {
            return "Không tìm thấy phương án nào.";
        } else {
            return result;
        }
    }

    private static boolean isAllOptions(int i, int j, int k) {

        return i * 1000 + j * 2000 + k * 5000 == 20000;
    }

    public static String findMinCombination() {
        int minCount = Integer.MAX_VALUE;
        String minOption = "";
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 10; j++) {
                for (int k = 0; k <= 4; k++) {
                    int total = i + j + k;
                    if (i * 1000 + j * 2000 + k * 5000 == 20000 && total < minCount) {
                        minCount = total;
                        minOption = "Phương án: " + i + " tờ 1000 đồng, " + j + " tờ 2000 đồng, " + k + " tờ 5000 đồng";
                    }
                }
            }
        }
        return "Phương án ít tờ tiền nhất: " + minOption;
    }

    private static boolean isOptionsLeastAmountOfMoney(int i, int j, int k, int minCount) {
        return i * 1000 + j * 2000 + k * 5000 == 20000 && i + j + k < minCount;
    }

}

package utils;

import java.util.Random;

public class GenerateAccNum {
    public static String generateAccNum() {
        String accountNum = "";
        Random rand = new Random();
        String card = "NV";
        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(9) + 0;
            card += Integer.toString(n);
        }
        for (int i = 0; i < 12; i++) {
            if (i % 4 == 0)
                accountNum = accountNum + " ";
            accountNum = accountNum + card.charAt(i);
        }

        return accountNum.trim();
    }
}

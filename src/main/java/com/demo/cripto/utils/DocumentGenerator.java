package com.demo.cripto.utils;

import lombok.experimental.UtilityClass;

import java.util.Random;

@UtilityClass
public class DocumentGenerator {

    private static final Random random = new Random();

    public static String generate() {
        int n1 = random.nextInt(10);
        int n2 = random.nextInt(10);
        int n3 = random.nextInt(10);
        int n4 = random.nextInt(10);
        int n5 = random.nextInt(10);
        int n6 = random.nextInt(10);
        int n7 = random.nextInt(10);
        int n8 = random.nextInt(10);
        int n9 = random.nextInt(10);

        int d1 = calcDigit(n1, n2, n3, n4, n5, n6, n7, n8, n9);
        int d2 = calcDigit(n1, n2, n3, n4, n5, n6, n7, n8, n9, d1);

        return String.format("%d%d%d%d%d%d%d%d%d%d%d",
                n1, n2, n3, n4, n5, n6, n7, n8, n9, d1, d2);
    }

    private static int calcDigit(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i] * (numbers.length + 1 - i);
        }
        int mod = sum % 11;
        return (mod < 2) ? 0 : 11 - mod;
    }

}

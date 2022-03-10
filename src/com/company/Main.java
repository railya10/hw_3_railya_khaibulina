package com.company;

public class Main {

    public static void main(String[] args) {
        double[] digits = {7.3, -3.2, 1.8, -6.2, 7.1, 2.8, 9.9, 6.7, 1.3, -8.2, 4.2, 8.6, -4.1, 2.0, 7.4};
        double number = 0;
        int zero = 0;
        boolean doubt = false;
        for (double order : digits) {
            if (order < 0) {
                doubt = true;
            } else if (doubt) {
                zero++;
                number += order;
            }
        }
        System.out.println(number / zero);
    }
}

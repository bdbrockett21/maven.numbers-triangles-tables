package com.github.curriculeon;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        int a = start;
        int b = stop;
        String result = "";
        for (int x = a; x < b; x++) {
            if (x % 2 == 0) {
                result += x;
            }
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        int a = start;
        int b = stop;
        String result = "";
        for (int x = a; x < b; x++) {
            if (x % 2 == 1) {
                result += x;
            }
        }
        return result;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        int a = start;
        int b = stop;
        int c = step;
        String result = "";
        for (int x = a; x < b; x+=step){
            result += x*x;
        }
        return result;
    }


    public static String getRange(int stop) {
        int b = stop;
        String result = "";
        for (int x = 0; x < b;x++){
            result += x;
        }
        return result;
    }
    public static String getRange(int start, int stop) {
        int a = start;
        int b = stop;
        String result = "";
        for (int x = a; x < b;x++){
            result += x;
        }
        return result;
    }

    public static String getRange(int start, int stop, int step) {
        int num = start;
        String result = "";
        while (num < stop) {
            result += num;
            num += step;
        }
        return result;
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        int num = start;
        String result = "";
        while (num < stop) {
            result += (int) Math.pow(num, exponent);
            num += step;
        }
        return result;
    }
}


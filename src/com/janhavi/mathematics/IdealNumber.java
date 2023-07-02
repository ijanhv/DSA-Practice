package com.janhavi.mathematics;

public class IdealNumber {
    public static void main(String[] args) {
        System.out.print(getIdealNums (1, 1));
    }

    public static int getIdealNums(int low, int high) {
        int maxPower3 = (int) (Math.log(high) / Math.log(3));
        int maxPower5 = (int) (Math.log(high) / Math.log(5));
        int count = 0;
        for (int x = 0; x <= maxPower3; x++) {
            for (int y = 0; y <= maxPower5; y++) {
                int num = (int) (Math.pow(3, x) * Math.pow(5, y));
                if (num >= low && num <= high) {
                    count++;
                }
            }
        }
        return count;
    }


}

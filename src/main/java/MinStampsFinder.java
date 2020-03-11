
/*
 * Copyright (c) Dmytro Hutkin 2020.
 */

public class MinStampsFinder {

    public static int compute(int price, int maxStampValue){

        int[][] m = new int[price + 1][maxStampValue + 1];

        for (int i = 1; i <= price; i++)
            m[i][1] = i;

        for (int i = 1; i <= maxStampValue; i++)
            m[1][i] = 1;

        for (int i = 2; i <= price; i++) {
            for (int j = 2; j <= maxStampValue; j++) {

                if (j <= i){
                    m[i][j] = Math.min(m[i][j-1], 1 + m[i-j][j-1]);
                }
                else{
                    m[i][j] = m[i][j-1];
                }
            }
        }

        return m[price][maxStampValue];
    }
}

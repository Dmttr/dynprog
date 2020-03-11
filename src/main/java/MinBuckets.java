/*
 * Copyright (c) Dmytro Hutkin 2020.
 */

@Deprecated
public class MinBuckets {

    private int k;

    public MinBuckets(int k){
        this.k = k;
    }

    private String solve(int k){

        if (k < 1){
            return "";
        }
        if (k == 1){
            return "1 K";
        }
        if (k < 4){
            return "1 Stuebchen + " + solve(k - 2);
        }
        if (k < 16){
            return "1 Viertel + " + solve(k - 4);
        }
        if (k < 20){
            return "1 Eimer + " + solve(k - 16);
        }
        if (k < 80){
            return "1 Anker + " + solve(k - 20);
        }
        if (k < 480){
            return "1 Ohm + " + solve(k - 80);
        }
        return "1 Fuder + " + solve(k - 480);
    }

    public String getSolution(){

        return solve(k);
    }
}

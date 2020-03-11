/*
 * Copyright (c) Dmytro Hutkin 2020.
 */

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {

    private int n;
    private List<Integer> primes = new ArrayList<Integer>();

    public PrimeFinder(int n) {
        this.n = n;
    }

    public List<Integer> getPrimes() {
        return primes;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private boolean isPrime(int n){
        boolean flag = true;
        for(int i = 2; i <= n/2; ++i)
        {
            // condition for nonprime number
            if(n % i == 0)
            {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public int findPrimeByIndex(){

        int counter = 1, nCounter = 0;
        while (nCounter < this.n){
            counter++;
            if (isPrime(counter)){
                primes.add(counter);
                nCounter++;
            }
        }
        return primes.get(this.n - 1);
    }
}

/*
 * Copyright (c) Dmytro Hutkin 2020.
 */

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {

    private int index;
    private List<Integer> primes = new ArrayList<Integer>();

    public List<Integer> getPrimes() {
        return primes;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private boolean isPrime(int n){
        boolean flag = true;
        for(int i = 2; i <= n/2; ++i)
        {
            // condition for non-prime number
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
        while (nCounter < this.index){
            counter++;
            if (isPrime(counter)){
                primes.add(counter);
                nCounter++;
            }
        }
        return primes.get(this.index - 1);
    }
}

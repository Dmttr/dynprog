import booksinlibrary.Book;
import booksinlibrary.BooksFinder;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1. Primes
        PrimeFinder primeFinder = new PrimeFinder();
        primeFinder.setIndex(7);
        try{
            int prime = primeFinder.findPrimeByIndex();
            System.out.println("prime with index " + primeFinder.getIndex() + " is: " + prime);
            System.out.println("all found primes: " + primeFinder.getPrimes().toString());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No such element");
        }
        catch (Exception e){
            System.out.println("unknown error");
        }
        System.out.println("------------------");
        
        // 2. Stamps
        int price = 17, maxStampValue = 6;
        int m = MinStampsFinder.compute(price, maxStampValue);
        System.out.println("Min to get " + price + " from " + maxStampValue + " is " + m);

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book(3,4));
        System.out.println(BooksFinder.findMaxKnowledge(bookList, 2));
    }
}

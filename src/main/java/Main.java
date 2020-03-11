public class Main {

    public static void main(String[] args) {

        PrimeFinder primeFinder = new PrimeFinder(5);
        try{
            System.out.println("prime number " + primeFinder.getN() + ": " + primeFinder.findPrimeByIndex());
            System.out.println("all found primes: " + primeFinder.getPrimes().toString());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No such element");
        }
        catch (Exception e){
            System.out.println("unknown error");
        }

    }
}

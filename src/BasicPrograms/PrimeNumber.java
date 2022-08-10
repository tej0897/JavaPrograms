package BasicPrograms;

public class PrimeNumber {

    public static void main(String[] args) {
        int n = 11;
        boolean isPrime = primeCheck(n);
        System.out.println(isPrime);
    }

    private static boolean primeCheck(int n) {
        if (n <= 1){
            return false;
        } else if ( n==2 ) {
            return true;
        } else if ( n %2 == 0) {
            return false;
        }
        for (int i =3; i <= Math.sqrt(n); i++){
            if (i % 2 ==0){
                return false;
            }
        }
        return true;
    }
}

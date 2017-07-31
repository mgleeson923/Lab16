/**
 * Created by michaelgleeson on 7/27/17.
 */
public class Math {
    private static boolean isPrime(int n) {
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int findPrime(int userNum) {


        //method to iterate through all prime numbers and locate each one
        int numOfPrimes = 0;
        int i;
        for (i = 2; numOfPrimes < userNum; i++) {
            if (isPrime(i)) {
                numOfPrimes++;
            }
        }
        //testing showed I had to subtract one. Not sure why, but testing and fiddling made me figure it out.
        return i-1;
    }
}

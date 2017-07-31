/**
 * Created by michaelgleeson on 7/31/17.
 */
public class MathMain {
    public static void main(String[] args) {

        LocatePrime();

    }

    private static void LocatePrime() {
        Validate validate = new Validate();

        do {
            findUserPrime();
        } while (validate.validateContinue());

        System.out.println("Goodbye");
    }

    private static void findUserPrime() {
        Validate validate = new Validate();
        Math primeNum = new Math();

        System.out.print("Which Prime are we looking for?\nEnter a number between 1 and 25 to find your Prime: ");
        int userNum = validate.numberIsPositiveInteger(0);

        int prime = primeNum.findPrime(userNum);

        if (userNum == 1){
            System.out.println("The " + userNum + "st prime number is " + prime);
        }else if (userNum == 2){
            System.out.println("The " + userNum + "nd prime number is " + prime);
        }else if (userNum == 3) {
            System.out.println("The " + userNum + "rd prime number is " + prime);
        }else{
            System.out.println("The " + userNum + "th prime number is " + prime);
        }
    }

}


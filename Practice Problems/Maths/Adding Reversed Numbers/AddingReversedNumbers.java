import java.math.BigInteger;
import java.util.Scanner;

class AddingReversedNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n != 0) {
            BigInteger first = sc.nextBigInteger();
            BigInteger second = sc.nextBigInteger();

            String result = reverseAndAdd(first, second);
            
            System.out.println(result);
            n--;
        }
    }


    public static String reverseAndAdd(BigInteger first, BigInteger second) {
        StringBuilder firstString = new StringBuilder(first + "");
        StringBuilder secondString = new StringBuilder(second + "");

        BigInteger firstReversed = new BigInteger(firstString.reverse().toString());
        BigInteger secondReversed = new BigInteger(secondString.reverse().toString());
        BigInteger result = firstReversed.add(secondReversed);
        String resultReversed = new StringBuilder(result + "").reverse().toString();

        return resultReversed.replaceFirst("^0*", "");
    }
}
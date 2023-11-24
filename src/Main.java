import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Main {

    // Question 1 - Write a program with a method named getTotal that accepts two integers as an argument and return its sum. Call this method from main( ) and print the results.
    static int getTotal (int a, int b){
        return (a+b);
    }

    // Question 2 - Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.

    static boolean isEven (int a){
        return (a % 2 == 0);
    }

    // Question 3 - Write a value-returning method, isVowel that returns the value true if a given character is a vowel, and otherwise returns false. In main() method accept a string from user and count number of vowels in that string. (a, e, i, o, u)

    static boolean isVowel (char a) {
        return (a == 'a') | (a == 'e') | (a == 'i') | (a == 'o') | (a == 'u');
    }

    // Question 4 - A prime number is a number that is evenly divisible only by itself and 1. For example, the number 5 is prime because it can be evenly divided only by 1 and 5. The number 6, however, is not prime because it can be divided evenly by 1, 2, 4, and 6.
    // Write a method named isPrime, which takes an integer as an argument and returns true if the argument is a prime number, or false otherwise. Also write main method that displays prime numbers between 1 to 500.

    static boolean isPrime (int a){
        boolean isprime = true;
        for (int i = 2; i <= (a/2); i++) {
            if (a % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    // Question 5 - A nonnegative integer is called a palindrome if it reads forward and backward in the same way. For example, the numbers 5, 121, 3443, and 123454321 are palindromes.
    // Write a method that takes as input a nonnegative integer and returns true if the number is a palindrome; otherwise, it returns false. Also write a program to test your method.

    static boolean isPalindromes(int a){

        char[] digits = (Integer.toString(a)).toCharArray();
        boolean ispalindrom = true;

        for (int i = 0; i < digits.length/2; i++) {
               if (digits[i] != digits[digits.length-i-1]){
                   ispalindrom = false;
                   break;
               }
        }

        System.out.println("The digits array is: "+ Arrays.toString(digits));

        return ispalindrom;
    }


        public static void main(String[] args) {

        System.out.println(getTotal(3,6));
        System.out.println(isEven(6));
        System.out.println(isEven(9));
        System.out.println(isVowel('a'));
        System.out.println(isVowel('b'));

        System.out.println(isPrime(6));
        System.out.println(isPrime(7));
        System.out.println(isPrime(13));

        for (int i = 2; i <501 ; i++) {
            if (isPrime(i)) {
                System.out.print(i+", ");
            }
        }
        System.out.println();
        System.out.println(isPalindromes(123456789));
        System.out.println(isPalindromes(123454321));
        System.out.println(isPalindromes(1221));
        System.out.println(isPalindromes(1));



        }
}
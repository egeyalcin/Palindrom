import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Palindrom {
    static boolean isPalindrom(int number) {
        int temp = number,reverseNumber = 0,lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp / 10;
        }

        System.out.println(number);
        System.out.println(reverseNumber);

        if (number == reverseNumber) {
            System.out.println("Palindrom");
            return true;
        }
        else {
            System.out.println("Palindrom degil");
            return false;
        }
    }

    public static void main(String[] args) {
        isPalindrom(242);

    }
}

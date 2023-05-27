package LeetCode.java;

public class ReverseInteger {
    public static void main(String[] args) {

    }

    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow occurred
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow occurred
            }
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;
    }
}

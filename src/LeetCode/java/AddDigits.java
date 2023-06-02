package LeetCode.java;

public class AddDigits {
    public static void main(String[] args) {

    }

    public int addDigits(int num) {
        while (num >= 10) {
            int toplam = 0;
            while (num != 0) {
                toplam += num % 10;
                num /= 10;
            }
            num = toplam;
        }
        return num;
    }
}

package LeetCode.java;

public class SumofAllOddLengthSubarrays1588 {
    public static void main(String[] args) {
        int[] sayilar={1,2,4};

        System.out.println(sumOddLengthSubarrays(sayilar));


    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j += 2) {
                int y = i;
                while (y <= j) {
                    toplam = toplam + arr[y];
                    y++;
                }

            }

        }
        return toplam;
    }
}









package LeetCode.java;

import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int [][]sayi=new int[][]{{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(sayi));

    }


    public static int maximumWealth(int[][] accounts){
        int sum=0;
        int max=0;
        for (int i=0;i<accounts.length;i++){
            for (int j=1;j<accounts[i].length;j++){
                sum=accounts[i][j]+sum;
            }
            if (sum>max){
                max=sum;
            }
            sum=0;
        }
        return max;

    }
}

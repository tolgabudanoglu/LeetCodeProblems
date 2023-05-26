package LeetCode.java;

import java.util.Scanner;

public class tournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(numberOfMatches(7));
    }

        public static int numberOfMatches(int n){
            int noOfMatches=0;
            while(n>1)
            {
                if(n%2==0)
                {
                    noOfMatches+=(n/2);
                    n=n/2;
                }
                else if(n%2!=0)
                {
                    noOfMatches+=((n-1)/2);
                    n=((n-1)/2)+1;
                }
            }
            return noOfMatches;
        }


    }





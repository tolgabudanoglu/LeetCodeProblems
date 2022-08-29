package LeetCode;

import java.util.Scanner;
import java.lang.String;

public class DefanginganIPAddress {
    public static void main(String[] args) {
        String string="1.2.3.4";
        System.out.println(defangIPaddr(string));
    }





    public static String defangIPaddr(String address) {
        String str="";
       str=address.replace(".","[.]");
       return str;

    }
}

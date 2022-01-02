package com.BridgeLabz.Day13.GenericMethod;

import java.util.*;

public class MaxOfThreeString {
    public static void main(String[] args) {
        MaxOfThreeString obj = new MaxOfThreeString();
        System.out.println("Maximum of string is");
        System.out.println(obj.compareTo());

    }

    public String compareTo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three strings: ");
        String x = scanner.next();
        String y = scanner.next();
        String z = scanner.next();
        String max = "";
        int result = x.compareTo(max);
        if (result > 1) {
            max = x;
        }
        result = y.compareTo(max);
        if (result > 1) {
            max = y;
        }
        result = z.compareTo(max);
        if (result > 1) {
            max = z;
        }
        return (max);
    }
}

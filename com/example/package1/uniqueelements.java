package com.example.package1;

import java.util.*;

public class uniqueelements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int x : a) 
        	set1.add(x);
        for (int x : b) {
            if (set1.contains(x)) {
                result.add(x);
            }
        }

        System.out.println(result);
    }
}
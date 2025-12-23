package com.example.package1;
import java.util.*;

public class removeduplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        Set<Integer> seen = new HashSet<>();
        int index = 0;

        for (int num : arr) {
            if (seen.add(num)) {
                arr[index++] = num;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
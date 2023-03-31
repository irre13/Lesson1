package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr =  new int[] {5, 2, 5, 6, 12, 3};
        Arrays.sort(arr);
        int min = arr[0];
        System.out.println(min);
        int max = arr[arr.length - 1];
        System.out.println(max);
    }
}
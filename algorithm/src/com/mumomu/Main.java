package com.mumomu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n;
    static int[][] arr = new int[1005][1005];
    static int[][] dp = new int[1005][1005];
    static int[] minSum = new int[1005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}

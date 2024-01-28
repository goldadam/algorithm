package org.example.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int number = 666;
        int count = 1;
        while (n != count) {
            number++;
            if (Integer.toString(number).contains("666")) {
                count ++;
            }
        }
        System.out.println(number);
    }
}

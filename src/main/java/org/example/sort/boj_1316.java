package org.example.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class boj_1316 {
    static int res = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean check() throws IOException {
        boolean[] isVisited = new boolean[26];
        int prev= 0 ;
        String str = br.readLine();

        for(int i=0;i<str.length(); i++){
            int now = str.charAt(i);
            if(prev != now){
                if(!isVisited[now - 'a']){
                    isVisited[now - 'a'] = true;
                    prev = now;
                }else{
                    return false;
                }
            }else{
                continue;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = "";
        for(int i=0;i<N;i++){
            if(!check()){
                res++;
            }
        }
        System.out.println(res);

    }
}

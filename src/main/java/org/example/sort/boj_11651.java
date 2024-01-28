package org.example.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj_11651 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        StringTokenizer st;
        for(int i =0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken()); //x좌표
            arr[i][1]=Integer.parseInt(st.nextToken()); //y좌표
        }

        Arrays.sort(arr ,new Comparator<int[]>(){
            @Override
            public int compare(int[] p1, int[] p2){
                if(p1[1] == p2[1] ) //x좌표가 동일하면
                    return Integer.compare(p1[0],p2[0]);
                else  //x좌표가 다르면
                    return Integer.compare(p1[1],p2[1]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i =0; i <n;i++){
            sb.append(arr[i][0]+ " "+ arr[i][1]).append('\n');
        }

        System.out.println(sb);

    }

}

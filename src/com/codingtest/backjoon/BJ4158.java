package com.codingtest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BJ4158{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if(N == 0 || M ==0){
                break;
            }
            HashSet<Integer> set = new HashSet<>();
            int cnt =0;
            for (int i = 0; i < N; i++) {
                set.add(Integer.parseInt(br.readLine()));
            }
            for (int i = 0; i < M; i++) {
                if(set.contains(Integer.parseInt(br.readLine()))){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}


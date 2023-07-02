package com.lecture.알고리즘.sorting;

import java.util.Arrays;
// 알고리즘 - 정렬_2
// 합병 정렬
public class Main2 {
    public static void mergeSort(int[] arr, int[] tmp, int left, int right) {
        if(left < right){
            int mid = (left + right) /2;
            mergeSort(arr, tmp, left, mid);
            mergeSort(arr, tmp, mid+1, right);
            merge(arr, tmp, left, right, mid);   // 맨마지막에 역순으로 합병을 시켜줄 것이다
        }

    }

    public static void merge(int[] arr, int[] tmp, int left, int right, int mid) {
        int p = left;
        int q = mid +1;
        int idx = p;
        while( p<= mid || q <= right){
            if( p <= mid && q <= right){
                if(arr[p] <= arr[q]){
                    tmp[idx++] = arr[p++];
                } else {
                    tmp[idx++] = arr[q++];
                }
            } else if (p <= mid && q> right){
                tmp[idx++] = arr[p++];
            } else {
                tmp[idx++] = arr[q++];
            }
        }
        for (int i = left; i <=right ; i++) {
            arr[i] = tmp[i];
        }
    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {3, 5, 2, 7, 1, 4, 6};
        int[] tmp = new int[arr.length];
        mergeSort(arr, tmp, 0, arr.length - 1);
        System.out.println("합병 정렬: " + Arrays.toString(arr));
    }

}

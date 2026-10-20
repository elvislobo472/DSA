package Coding.Java.TwoPointer;

import java.util.Arrays;

public class MergeArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n){


        int i = m-1, j = n-1, k = m+n -1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }

            k--;

        }


        while(j < n){
            nums1[k] = nums2[j];
            j++;
            k++;
        }


        System.out.println(Arrays.toString(nums1));



    }



    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4,8,9};
        int[] nums2 = {2, 5, 6};

        int m = nums1.length;
        int n = nums2.length;

        merge(nums1, m, nums2, n);
    }
}

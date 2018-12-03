package com.asim.interviewr2;

public class MergeSortedArrays {

    public static void main(String[] args) {


        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {9, 10, 11, 12, 13, 14, 15};
        int ref_i = 0;
        int ref_j = 0;
        int ref_k = 0;
        int t_length = array1.length + array2.length;
        int[] result_array = new int[t_length];

        while (ref_i < array1.length && ref_j < array2.length) {
            if (array1[ref_i] < array2[ref_j]) {
                result_array[ref_k] = array1[ref_i];
                ref_i++;
                ref_k++;
            }
            if (array1[ref_i] > array2[ref_j]) {
                result_array[ref_k] = array2[ref_j];
                ref_j++;
                ref_k++;
            }

        }


        if (ref_i < array1.length - 1) {
            while (ref_i != array1.length - 1) {
                result_array[ref_k] = array1[ref_i];
                ref_i++;
                ref_k++;


            }

            if (ref_j < array2.length - 1) {
                while (ref_j != array2.length - 1) {
                    result_array[ref_k] = array2[ref_j];
                    ref_j++;
                    ref_k++;


                }
            }

        }
    }

}

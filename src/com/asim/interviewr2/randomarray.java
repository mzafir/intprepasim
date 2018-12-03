package com.asim.interviewr2;

import java.util.Random;

public class randomarray {


    public static void main(String[] args) {

        int[] array1 = {1, 3, 4, 5, 8, 6};
        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            int rnd = new Random().nextInt( array1.length );
            array2[i] = array1[rnd];
        }

        for (int j = 0; j < array2.length; j++)
        {
            System.out.println(array2[j]);
        }


    }
}



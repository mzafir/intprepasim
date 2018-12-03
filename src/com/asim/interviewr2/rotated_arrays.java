package com.asim.interviewr2;

public class rotated_arrays {

    static int temp =0;
    public static void rotate (int[] array, int d)
    {
        temp = array[0];
        int count=0;

        for (int j=0; j <d ; j++)
        { temp=array[0];
        count=0;
            for (int i = 0; i < array.length-1; i++)
            {

                array[i] = array[i + 1];
                count++;
            }

            array[count]=temp;
        }


    }

    public static void main(String[] args) {
       int[] ar1={1,2,3,4,5};
        rotate( ar1, 2 );



    }

}

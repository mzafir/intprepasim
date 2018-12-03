package com.asim.interviewr2;

public class rightrotate
{
    static int temp =0;
    public static void rotate_arr(int[] nums, int k)


    {
        for (int j=0; j<k; j++)
        {


        int lenarr=nums.length-1;
        int temp =  nums[lenarr];

        while(lenarr!=0)
        {
            nums[lenarr]=nums[lenarr-1];
            lenarr=lenarr-1;
        }

        nums[0]=temp;
    }

    }

    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5,6,7};
        rotate_arr(arr1, 3);

    }
}

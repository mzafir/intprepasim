package com.asim.interviewr2;

public class arraylength {

    static boolean t1 = false;

    public  static boolean array6(int[] nums, int index) {

        if(index==nums.length)
        {

            return t1;
        }

        if (nums[index] == 6) {

            t1 = true;
        }

        else {
            t1 = false;
            array6( nums, index + 1 );
        }

        return t1;
    }


    public static void main(String[] args) {

        int nums1[] = {1, 3, 4};
        int nums2[] = {1, 4};
        int nums3[] = {1, 9, 6, 3, 3};
        System.out.println(array6( nums1, 0 ));
        System.out.println(array6( nums2, 0 ));
        System.out.println(array6( nums3,0 ));

    }



}
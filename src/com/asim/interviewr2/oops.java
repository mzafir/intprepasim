package com.asim.interviewr2;

public class oops {

    public static int tire;



    public void shared (int a)
    {
        int x=0;
        int y=0;
    }
    public static void main(String[] args) {
        oops v1 = new oops();
        oops v2 = new oops();

        v1.tire =1;

        System.out.println(v2.tire);

        v2.tire=4;

        System.out.println(v1.tire);

        System.out.println(oops.tire);

    }

}

package com.asim.interviewr2;

public class test333 {

    static int count = 0;
    static int prev = 1;

    public static void count7(int n) {

        if(n==0)
        {
            return;
        }

        if (n % 10 != 8)
        {

            prev = 1;
            n = n / 10;

            count7(n);
        }
        else
        {
            if (n % 10 == 8 && prev == 1)
            {
                count = count + 1;
                prev = 2;
            }
            else if (n % 10 == 8 && prev > 1)
            {
                count = count *2;

            }
            n = n / 10;
            count7(n);

        }


    }


    public static void main(String[] args) {

        count7(888111118);
        System.out.println( count );

    }
}



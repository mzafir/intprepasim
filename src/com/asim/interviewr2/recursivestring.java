package com.asim.interviewr2;

public class recursivestring {

public static int count =0;
public static String tstr="hi";

    public static void  countHi(String str) {

        int index = str.indexOf( tstr );
        if (index == -1)
        {
            return;
        }
        count++;

        countHi(str.substring( index+2, str.length() ));


    }

    public static void main(String[] args) {

        countHi("xabvdjdhixhixhi");
        System.out.println(count);

    }


}

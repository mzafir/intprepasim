package com.asim.interviewr2;

public class padvar {

    public static  String  allStar(String str) {
        char[] carray = str.toCharArray();

        char[]carray2 = new char[carray.length*2];

        String final3= " ";

        for (int i=0; i<carray.length; i++)
        {
            final3 = carray[i] + "*";

        }
        return final3;
    }

    public static void main(String[] args) {


        System.out.println(allStar( "Asim" ));

    }
}

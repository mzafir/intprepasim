package com.asim.interviewr2;

public class trcount {

    public  int triangle(int rows) {
        int total =0;
        if (rows==1)
        {
            total= total + rows;
            return total ;
        }
        else
        {
            total = total + triangle(rows-1) ;
        }

        return total ;
    }

    public static void main(String[] args) {

        trcount alpha = new trcount();
        System.out.println(alpha.triangle(5));

    }

}

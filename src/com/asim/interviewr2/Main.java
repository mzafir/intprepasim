package com.asim.interviewr2;

public class Main {

    static int count = 0;
    static int reset = 0;

    public static void count8(int n) {

        if(n == 0 )
            return;

        if (n % 10 == 8){

            if(reset > 0){
                count = count * 2;
            }else{
                count = count + 1;
            }
            reset = reset + 1;
        }
        else {
            reset = 0;
        }
        count8( n / 10 );
    }


    public static void main(String[] args) {

        //input: 8818 =====> 2+1+0+1
        //output:4


        count8( 888111118 );
        System.out.println( count );

    }
}



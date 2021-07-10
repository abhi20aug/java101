package com.java101.sec26.datetime.java7.datetime;

public class Ex261currentTimeMillis {

    public static void main(String[] args) {
    //
        System.out.println("current milli sec after 1-jan-1970"+System.currentTimeMillis());
        System.out.println("current milli sec after 1-jan-1970"+System.currentTimeMillis());
        System.out.println("current milli sec after 1-jan-1970"+System.currentTimeMillis());

        long noOfYearsAfter1970 = System.currentTimeMillis()/1000/60/60/24/365;
        System.out.println("noOfYearsAfter1970: "+noOfYearsAfter1970);
        System.out.println("current Year: "+(noOfYearsAfter1970+1970));

        System.out.println("long.maxValue"+Long.MAX_VALUE);
        System.out.println("Max Year in Java"+(Long.MAX_VALUE/1000/60/60/24/365));
    }
}

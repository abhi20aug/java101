package com.java101.sec26.datetime.java7.datetime;

import java.util.Date;

strictfp public class Ex261Date {
        public static void main(String[] args) {

            //depreacted class
            Date date = new Date();
            //Sat Jun 05 23:33:36 IST 2021
            System.out.println("date"+date);

            System.out.println(date.getDate());

            //day start with 0 as Sunday
            System.out.println("day:"+date.getDay());

            //month starts with 0 as Jan
            System.out.println("month: "+date.getMonth());

            //year starts with 1900
            System.out.println(date.getYear());

            System.out.println(date.getHours());
            System.out.println(date.getMinutes());

            //
            System.out.println(date.getTimezoneOffset());

        }
}

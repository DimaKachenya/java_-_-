package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);

        int time=in.nextInt();
        int hour, min, sek;



           hour=time/3600;
           time=time-hour*3600;
           min=time/60;
            time=time-min*60;
            sek=time;


        System.out.println(hour+" ч. "+min+" мин. "+sek+" сек. ");

    }
}

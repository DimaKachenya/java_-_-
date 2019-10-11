package com.company;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x,y;

        Scanner in=new Scanner(System.in);

        x=in.nextInt();
        y=in.nextInt();

        System.out.print( (sin(x)+cos(x))/(cos(x)-sin(y))*tan(x*y)  );

    }
}

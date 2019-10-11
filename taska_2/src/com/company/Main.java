package com.company;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.print("Введите a,b,c : ");

        a= in.nextInt();
        b= in.nextInt();
        c= in.nextInt();

        System.out.print((b+sqrt(pow(b,2)+4*a*c))/(2*a)-pow(a,3)*c+pow(b,-2));



    }
}

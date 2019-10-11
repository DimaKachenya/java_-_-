package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner un=new Scanner (System.in);
        int a,b,c;
        double z;
        System.out.print("Введите a,b,c :");
        a=  un.nextInt();
        b=  un.nextInt();
        c=  un.nextInt();
        z=((a-3)*b/2)+c;
        System.out.print(z);
    }
}

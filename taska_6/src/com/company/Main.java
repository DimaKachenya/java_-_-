package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);

        int x=in.nextInt(), y=in.nextInt();
        //если у больше 0 и меньше 4
        //если х больше нуля  и меньшн 4


        if(y>0||y<=4) {
            if (x >= -2 || x <= 2)
                System.out.print("True");
        }
        else if(y>=-3||y<0) {
            if (x >= -4 || x <= 4)
                System.out.print("True");
        }
        else if (y==0) {
            if (x >= -4 || x <= 4)
                System.out.print("True");
        }
        else
            System.out.print("False");










        //System.out.print("True");
    }
}

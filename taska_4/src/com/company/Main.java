package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in=new Scanner(System.in);


        String my_str=in.nextLine();
       // System.out.print(my_char[]);


        char[] my_char=my_str.toCharArray();

        //System.out.println(my_char[0]);

        for( int i=my_str.length()-1 ;i>=0 ; i-- )
        {
            System.out.print(my_char[i]);
          //  System.out.println(i);
        }


    }
}

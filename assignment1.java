package com.company;

public class Main {

    public static void main(String[] args) {
        int i,j;
        for (int i=0; i<=4; i++)
        {
            for (int j=0 ; j<=4; j++)
            {
                if (i<=2)
                    if (j < 2 - i ||  j > 2 + i )
                        System.out.print(" ") ;
                    else
                        System.out.print("*");
                else
                if ( j < i - 2 || j >6 - i)
                   System.out.print(" ");
                else System.out.print("*");

            }

           System.out.println("\n");
    }
    }
}

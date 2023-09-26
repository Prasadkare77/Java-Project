package com.democode;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius");
        int r= sc.nextInt();
        System.out.println("area of circle is");
        double a=3.14*(r*r);
        System.out.println(a);

    }
}

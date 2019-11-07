package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the time(xx:xx)");
        String time = sc.next();
        String ar [] = time.split(":");
        int hr = Integer.parseInt(ar[0]);
        int m = Integer.parseInt(ar[1]);
        if(hr == 7 && m >=30 ) {
            System.out.println("on class");
        }
        else if(hr>7&&hr<17){
            System.out.println("on class");
        }
        else{
            System.out.println("out of school");
        }
    }
}
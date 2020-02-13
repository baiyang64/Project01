package com.atguigu.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class Customer {

    private static ArrayList list00100;

    /*

     */
    public static void main(String[] args){
        System.out.println("HelloWorld!!");
        method02();

        method01();
    }

    private static void method02() {
        System.out.println("Hellorld!!");
        System.out.println("HelloWorld!!");
        System.out.println();

        list00100 = new ArrayList();

        list00100.add();
        new Date();
    }

    /**
     *
     */
    public static void method01(){
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<Object> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");
        list.add("888");

        if (list == null) {
            
        }

        if (list != null) {

        }

        if (list == null) {

        }
        if (list != null) {

        }
    }
}

package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author shkstart
 * @create 2020-02-12 21:28
 * @date 2020/2/12 - 21:28
 */
public class TemplatesTest {

    private static final Customer cust = new Customer();

    public static final int NUM = 1;

    public static final int i = 10;
    public static final String s = "1";


    public static void main(String[] args) {
        System.out.println("out");
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);

        int num = 10;
        System.out.println("num = " + num);

        for (int i = 0; i < args.length; i++) {
            
        }

        for (String arg : args) {
            
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
        }

        ArrayList<Object> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");
        list.add("888");

        for (Object o : list) {
            
        }

        for (int i = 0; i < list.size(); i++) {
            
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }
}

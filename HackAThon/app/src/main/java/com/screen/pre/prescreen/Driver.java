package com.screen.pre.prescreen;

import java.util.ArrayList;

/**
 * Created by devin on 1/14/2018.
 */


public class Driver {
    public static ArrayList<Person> list = new ArrayList<Person>();

    public Driver  (){

    }

    public static void sort(ArrayList<Person> list) {
        for (int i = 1; i < list.size(); i++) {
            int position;
            Person holder = list.get(i);
            for (position = i; position > 0; position--) {
                if (holder.compareTo(list.get(position - 1)) > 0) {
                    list.set(position, list.get(position - 1));
                } else {
                    break;
                }
            }
            list.set(position, holder);
            System.out.println(list);
        }
    }

    public static void add(Person x) {
        list.add(x);
    }
}

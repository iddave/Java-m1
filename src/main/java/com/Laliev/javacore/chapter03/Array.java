package com.Laliev.javacore.chapter03;

public class Array {
    public static void main(String[] args) {
        int [] month_days;
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        System.out.println("Количество дней в апреле: " + month_days[3]);
    }
}

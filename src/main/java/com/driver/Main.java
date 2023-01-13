package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        //java: name has private access in com.driver.RWOnly
        rw.setName("aparth443");
        String ans = rw.getName();
        System.out.println(ans);
    }
}
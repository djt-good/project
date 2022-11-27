package com.example.test;

public class re {
    public static void main(String[] args) {
        int b=test2.a;
        test2 test2 = new test2();
        System.out.println(test2.b);
        test2.mm();
    }
}
class test2{
    static  int a = 1;
    int b=1;
    static {
        System.out.println("我被加载了");
    }
    {
        System.out.println("普通代码块！！！！");
    }
    public static int mm(){
        return 21;
    }
}
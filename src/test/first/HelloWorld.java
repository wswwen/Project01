package test.first;


import test.customer;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {

    // 5. prsf
    private static final customer cust = new customer();
    // psf  psfi psfs
    public static final int num = 1;


    // 使用自定义的模版
    public void testUpdate(){
        //生成测试
    }

    /**
     * 客户id
     */
    private final int ID = 2;

    private final String RR = "faffs";


    public static void main(String[] args){
        // 1. psvm  sout  soutp  / soutv soutm
        System.out.println("Hello World!!!!");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("HelloWorld.main");


        int num1 = 10;
        int num2 = 30;
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);

        // 2. fori
        String[] arr = new String[]{"Tom", "Jerry", "Lily"};
        for (String value : arr) {  // enter
            System.out.println(value);
        }
        // iter
        for (String s : arr) {
            System.out.println(s);
        }
        // itar
        for (String s : arr) {
            System.out.println(s);
        }

        // 3.  集合 list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(434);
        list.add(545);

        for (Object o : list) {
            System.out.println("o = " + o);
        }
        //list.fori   list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        // 4.
    }

    public void method(){
        System.out.println("HelloWorld.method");
        // 4.
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(434);
        list.add(545);
        // ifn
        if (list == null) {

        }
        // 变形 inn
        if (list != null) {

        }
        // xxx.nn   xxx.null
        if (list != null) {

        }
        if (list == null) {

        }


    }

}
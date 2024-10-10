package com.msb.j2se.oop.testbuffbuider;

public class Test01 {
    public static void main(String[] args) {
        String msg = "1234321";
        //反过来与原来的对比


        //从中间切开  前后对比
        boolean ok = true;
        for (int i = 0; i < msg.length() / 2; i++) {
            if (msg.charAt(i) != msg.charAt(msg.length() - i - 1)) ;
            {
                ok = false;
                break;
            }
        }

        System.out.println(ok);
}

}
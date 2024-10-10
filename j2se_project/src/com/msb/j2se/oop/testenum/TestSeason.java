package com.msb.j2se.oop.testenum;



public class TestSeason {
    public static void main(String[] args) {
        //

        Season1 season01=new Season1("001",Season.SPRING);
        Season1 season02=new Season1("002",Season.SUMMER);
        Season1 season03=new Season1("003",Season.AUTUMN);
        Season1 season04=new Season1("004",Season.WINTER);

        /*System.out.println(season01.season);
        System.out.println(season03.season.desc);
*/
        //枚举switch
        switch (season01.season){
            case AUTUMN:
                System.out.println("夏天");
                break;
            case SPRING:
                System.out.println("春天");
                break;
        }

    }
}

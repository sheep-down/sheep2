package com.msb.j2se.oop.testenum;


public class Season1 {
    //属性
    String seas;
    //枚举
    Season season;

    public Season1(String seas, Season season) {
        this.seas = seas;
        this.season = season;
    }

    public String getSeas() {
        return seas;
    }

    public void setSeas(String seas) {
        this.seas = seas;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}

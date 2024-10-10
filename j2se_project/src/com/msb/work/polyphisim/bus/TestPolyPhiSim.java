package com.msb.work.polyphisim.bus;

public class TestPolyPhiSim {
    public static void main(String[] args) {
        CheLei c=new CheLei();
        WeiXiu w=new WeiXiu();
          Bus b=new Bus();
          BYD by=new BYD();
          YuTong y=new YuTong();
     w.zl(by);
     w.zl(b);
     w.zl(y);
    }
}

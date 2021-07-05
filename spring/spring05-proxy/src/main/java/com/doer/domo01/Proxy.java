package com.doer.domo01;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//中介 代理
@NoArgsConstructor
@AllArgsConstructor
public class Proxy implements Rent{
    private Host host;

    public void rent() {
        host.rent();
        seeHouse();
        hetong();
        fare();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房子");
    }
    //签租赁合同
    public void hetong(){
        System.out.println("签租赁合同");
    }

    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}

package com.doer.domo01;

public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();
        //代理,中介帮房东出租房子,代理一般会有一些附属操作
        Proxy proxy = new Proxy(host);

        //你不用面对房东,直接找中介租房即可
        proxy.rent();
    }
}

package com.wang.demo01;

public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //代理, 中介要帮房东租房子, 代理角色一般会有一些附属操作
        Proxy proxy = new Proxy(host);
        //你不用面对房东,直接面对中介租房即可
        proxy.rent();
    }
}

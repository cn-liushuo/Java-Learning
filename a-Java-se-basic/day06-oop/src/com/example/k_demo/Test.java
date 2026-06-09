package com.example.k_demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 目标：加油站支付小程序
        // 1、创建卡片类，以便创建金卡或银卡对象，封装车主的数据。
        // 2、定义一个卡片父类：Card，定义金卡和银卡的共同属性和方法。
        // 3、定义一个金卡类，继承Card类，金卡必须重写消费方法(8折优惠)
        // 4、定义一个银卡类，继承Card类，银卡必须重写消费方法(9折优惠)
        // 5、办一张金卡：创建金卡对象，交给一个独立的业务(支付机)来完成：存款，消费。
        Card goldCard = new GoldCard("京A88888", "dilei", "12345678900", 5000);
        goldCard.deposit(100); // 再存100
        pay(goldCard);
        // 6、办一张银卡：创建银卡对象，交给一个独立的业务(支付机)来完成：存款，消费。
        Card silverCard = new SilverCard("京B99999", "lisi", "12345678901", 2000);
        pay(silverCard);
    }

    // 支付机：用一个方法来刷卡：可能接受金卡，也可能接收银卡。
    public static void pay(Card c) {
        System.out.println("请刷卡，请您输入当前消费的金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);
    }
}

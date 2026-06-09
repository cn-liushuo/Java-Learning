package com.example.k_demo;

public class SilverCard extends Card {
    public SilverCard(String carId, String name, String phone, double money) {
        super(carId, name, phone, money);
    }

    @Override
    public void consume(double money) {
        System.out.println("您当前银卡消费: " + money);
        System.out.println("优惠后的价格: " + money * 0.9);
        if (getMoney() < money * 0.9) {
            System.out.println("您的余额是: " + getMoney() + "当前余额不足，请存钱！");
            return; // 干掉方法
        }
        // 变更金卡的账户余额
        setMoney(getMoney() - money * 0.9);
    }
}

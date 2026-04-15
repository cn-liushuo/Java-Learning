package com.example.k_demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String carId; // 车牌号
    private String name;
    private String phone;
    private double money; // 余额

    // 预存金额。
    public void deposit(double money) {
        this.money += money;
    }

    // 消费金额。
    public void consume(double money) {
        this.money -= money;
    }
}

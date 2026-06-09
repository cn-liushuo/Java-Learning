package com.example.array;

public class D_ArrayTest {
    public static void main(String[] args) {
        // 完成斗地主游戏的做牌和洗牌
        start();
    }

    public static void start() {
        // 1、做牌：创建一个动态初始化数组存储54张牌
        String[] poker = new String[54];
        // poker = [null, null, null, null, null, null, null, ...]
        //           0     1     2     3     4     5     6

        // 2、准备四种花色，还有点数，再开始做牌存入到数组中去。
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        // 3、遍历点数，再遍历花色
        int index = 0; // 定义一个变量记录牌存储的索引位置
        for (int i = 0; i < numbers.length; i++) {
            // 当前点数 numbers[i]
            for (int j = 0; j < colors.length; j++) {
                // 4、将牌存储数组中去
                poker[index++] = colors[j] + numbers[i];
            }
        }

        // 5、存入大小王
        poker[index++] = "🃏";
        poker[index] = "👲";

        // 6、打印牌
        System.out.println("新牌：");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
        }
        System.out.println(); // 换行

        // 7、洗牌：把54张牌的数组poker中的牌顺序打乱
        for (int i = 0; i < poker.length; i++) {
            // 随机获取一个索引
            int index1 = (int) (Math.random() * poker.length);
            // 随机获取一个索引
            int index2 = (int) (Math.random() * poker.length);
            // 拿index1索引对应的牌，和index2索引对应的牌进行交换
            String temp = poker[index1];
            poker[index1] = poker[index2];
            poker[index2] = temp;
        }

        System.out.println("洗牌后：");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
        }
        System.out.println();
    }
}

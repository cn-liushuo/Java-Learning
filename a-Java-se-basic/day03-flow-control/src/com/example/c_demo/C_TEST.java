package com.example.c_demo;

public class C_TEST {
    public static void main(String[] args) {
        // 目标：开发验证码
        // 1. 调用一个方法返回执行位数的验证码，每位只能是数字或者大写字母或者小写字母。
        System.out.println(getCode(4));
        System.out.println(getCode(6));
    }

    public static String getCode(int n) {
        // 2. 定义一个变量用户记录生产的验证码。
        String code = "";
        // 3. 循环n次每次生成一个验证码
        for (int i = 0; i < n; i++) {
            // i = 0 1 2 3
            // 4. 为当前位置随机生成一个数字或者大写字母或者小写字母。数字0 / 大写1 / 小写2
            // 随机一个 0 或者 1 或者 2 表示当前位置随机的字符类型。
            int type = (int) (Math.random() * 3); // [0, 1) * 3 => [0, 2] => 0 1 2
            // 5. 使用 switch 判断当前位置随机的字符类型
            switch (type) {
                case 0:
                    // 6. 如果当前位置是数字，则随机生成一个数字0-9，然后拼接
                    int num = (int) (Math.random() * 10);
                    code += num;
                    break;
                case 1:
                    // 7. 如果当前位置是大写字母，则随机生成一个大写字母A-Z，然后拼接  'A' 65  'Z' 65+25
                    int num1 = (int)(Math.random() * 26); // [0, 25]
                    char ch = (char) ('A' + num1); // 得到大写字母的随机编号，转成大写字母
                    code += ch;
                    break;
                case 2:
                    // 8. 如果当前位置是小写字母，则随机生成一个小写字母a-z，然后拼接  'a' 97  'z' 97+25
                    int num2 = (int)(Math.random() * 26); // [0, 25]
                    char ch1 = (char) ('a' + num2); // 得到小写字母的随机编号，转成小写字母
                    code += ch1;
                    break;
            }
        }

        return code;
    }
}

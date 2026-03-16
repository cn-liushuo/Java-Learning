package com.example.array;

public class A_ArrayDemo {
    public static void main(String[] args) {
        // 目标：认识使用数组的好处，数组的定义、访问。
        randomCall();
    }

    // 随机点名的方法， 假设有15名学生
    public static void randomCall() {
        // 1. 定义一个数组，存储8名学生的姓名
        // 静态初始化数组，定义数组的时候，数据已经确定好了
        String[] names = {"张三", "李四", "王五", "赵六", "孙七", "周八", "吴九", "郑十"};
        // String[] names = new String[]{"张三", "李四", "王五", "赵六", "孙七", "周八", "吴九", "郑十"};


        // 2. 随机获取一个索引值
        // Math.random() : [0, 1） 之间的小数
        // names.length : 元素个数：8
        int index = (int) (Math.random() * names.length); // [0, 15) - [0, 14]

        // 3. 根据索引值，获取数组中的元素：数组名[索引值]
        String name = names[index];
        System.out.println(name);
    }
}

package com.example.l_demo;

// 智能控制系统，单例类。
public class SmartHomeControl {
    private static final SmartHomeControl smartHomeControl = new SmartHomeControl();

    private SmartHomeControl() {
    }

    ;

    public static SmartHomeControl getInstance() {
        return smartHomeControl;
    }

    // 多态
    public void control(JD jd) {
        System.out.println(jd.getName() + "状态目前是：" + (jd.isStatus() ? "关闭" : "开着"));
        System.out.println("开始你的操作。。。。。。");
        jd.press(); // 按下开关
        System.out.println(jd.getName() + "状态已经是：" + (jd.isStatus() ? "关闭" : "开着"));
    }

    public void printAllStatus(JD[] jds) {
        // 使用for循环，根据索引遍历每个设备
        for (int i = 0; i < jds.length; i++) {
            JD jd = jds[i];
            System.out.println((i + 1) + "," + jd.getName() + "状态目前是：" + (jd.isStatus() ? "关闭" : "开着"));
        }
    }
}

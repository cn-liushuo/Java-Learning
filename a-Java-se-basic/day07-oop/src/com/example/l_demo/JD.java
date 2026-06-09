package com.example.l_demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 家电
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JD implements Switch {
    private String name;
    // 状态：开或者关。
    private boolean status; // false 默认是关闭

    @Override
    public void press() {
        // 控制当前设备开和关
        status = !status;
    }
}

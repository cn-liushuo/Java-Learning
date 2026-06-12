package org.example.b_twentysix;

import java.nio.charset.StandardCharsets;

/**
 * 给你一个二进制字符串 s ，该字符串 不含前导零 。
 * 如果 s 包含 零个或一个由连续的 '1' 组成的字段 ，返回 true​​​ 。否则，返回 false 。
 */
public class A_MarSix {
    public static void main(String[] args) {
        System.out.println(checkOnesSegment("s"));
    }

    public static boolean checkOnesSegment(String s) {
        // 1. 将字符串按 UTF-8 编码转为字节数组
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);

        // 2. 遍历每个字节，转换为二进制字符串
        StringBuilder binaryResult = new StringBuilder();
        for (byte b : bytes) {
            // 将字节转换为无符号整数（0~255），然后转二进制，再补齐8位
            String binary = Integer.toBinaryString(b & 0xFF);
            binary = String.format("%8s", binary).replace(' ', '0');
            binaryResult.append(binary).append(" "); // 用空格分隔每个字节
        }

        System.out.println("字符串 \"" + s + "\" 的二进制（UTF-8 编码）为：");
        System.out.println(binaryResult.toString().trim());

        return true;
    }
}

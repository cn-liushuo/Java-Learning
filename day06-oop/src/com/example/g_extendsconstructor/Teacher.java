package com.example.g_extendsconstructor;

// 子类
public class Teacher extends People {
    private String skill; // 技术

    public Teacher() {
    }

    public Teacher(String name, String skill, char sex) {
        super(name, sex);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}

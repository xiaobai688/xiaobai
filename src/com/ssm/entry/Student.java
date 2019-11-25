package com.ssm.entry;

public class Student {
    private int stuno;
    private String stuname;
    private int stuage;

    public Student() {
    }

    public Student(int stuno, String stuname, int stuage) {
        this.stuno = stuno;
        this.stuname = stuname;
        this.stuage = stuage;
    }

    public int getStuno() {
        return stuno;
    }

    public void setStuno(int stuno) {
        this.stuno = stuno;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public int getStuage() {
        return stuage;
    }

    public void setStuage(int stuage) {
        this.stuage = stuage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuno=" + stuno +
                ", stuname='" + stuname + '\'' +
                ", stuage=" + stuage +
                '}';
    }
}

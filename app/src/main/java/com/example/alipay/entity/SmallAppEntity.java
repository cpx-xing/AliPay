package com.example.alipay.entity;

public class SmallAppEntity {
    private String img0;
    private String name;
    private String describemsg;
    private String img1;
    private String text1;
    private String img2;
    private String text2;
    private String img3;
    private String text3;
    private int type;

    public String getImg0() {
        return img0;
    }

    public void setImg0(String img0) {
        this.img0 = img0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribemsg() {
        return describemsg;
    }

    public void setDescribemsg(String describemsg) {
        this.describemsg = describemsg;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public SmallAppEntity(String img0, String name, String describemsg, String img1, String text1, String img2, String text2, String img3, String text3, int type) {
        this.img0 = img0;
        this.name = name;
        this.describemsg = describemsg;
        this.img1 = img1;
        this.text1 = text1;
        this.img2 = img2;
        this.text2 = text2;
        this.img3 = img3;
        this.text3 = text3;
        this.type = type;
    }
}

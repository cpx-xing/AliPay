package com.example.alipay.entity;

public class GridItemEntity {
    private int mImageId;
    private String name;

    public GridItemEntity(int mImageId, String name) {
        this.mImageId = mImageId;
        this.name = name;
    }

    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
